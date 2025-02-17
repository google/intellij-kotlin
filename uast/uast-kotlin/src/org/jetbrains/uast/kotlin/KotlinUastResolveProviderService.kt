/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.uast.kotlin

import com.intellij.psi.*
import org.jetbrains.kotlin.builtins.createFunctionType
import org.jetbrains.kotlin.codegen.state.KotlinTypeMapper
import org.jetbrains.kotlin.config.LanguageVersionSettings
import org.jetbrains.kotlin.descriptors.*
import org.jetbrains.kotlin.name.FqNameUnsafe
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.getParentOfType
import org.jetbrains.kotlin.psi.psiUtil.parents
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.CompileTimeConstantUtils
import org.jetbrains.kotlin.resolve.bindingContextUtil.isUsedAsResultOfLambda
import org.jetbrains.kotlin.resolve.calls.callUtil.getResolvedCall
import org.jetbrains.kotlin.resolve.calls.callUtil.getType
import org.jetbrains.kotlin.resolve.calls.components.isVararg
import org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch
import org.jetbrains.kotlin.resolve.calls.model.ResolvedCall
import org.jetbrains.kotlin.resolve.constants.UnsignedErrorValueTypeConstant
import org.jetbrains.kotlin.resolve.descriptorUtil.annotationClass
import org.jetbrains.kotlin.resolve.descriptorUtil.builtIns
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameUnsafe
import org.jetbrains.kotlin.resolve.source.getPsi
import org.jetbrains.kotlin.types.*
import org.jetbrains.kotlin.types.typeUtil.TypeNullability
import org.jetbrains.kotlin.types.typeUtil.nullability
import org.jetbrains.uast.*
import org.jetbrains.uast.kotlin.psi.UastKotlinPsiParameterBase

interface KotlinUastResolveProviderService : BaseKotlinUastResolveProviderService {
    fun getBindingContext(element: KtElement): BindingContext
    fun getTypeMapper(element: KtElement): KotlinTypeMapper?
    fun getLanguageVersionSettings(element: KtElement): LanguageVersionSettings

    override val languagePlugin: UastLanguagePlugin
        get() = kotlinUastPlugin

    override val baseKotlinConverter: BaseKotlinConverter
        get() = KotlinConverter

    override fun convertValueArguments(ktCallElement: KtCallElement, parent: UElement): List<UNamedExpression>? {
        val resolvedCall = ktCallElement.getResolvedCall(ktCallElement.analyze()) ?: return null
        return resolvedCall.valueArguments.entries.mapNotNull {
            val arguments = it.value.arguments
            val name = it.key.name.asString()
            when {
                arguments.size == 1 ->
                    KotlinUNamedExpression.create(name, arguments.first(), parent)
                arguments.size > 1 ->
                    KotlinUNamedExpression.create(name, arguments, parent)
                else -> null
            }
        }
    }

    override fun findAttributeValueExpression(uAnnotation: KotlinUAnnotation, arg: ValueArgument): UExpression? {
        val annotationEntry = uAnnotation.sourcePsi
        val resolvedCall = annotationEntry.getResolvedCall(annotationEntry.analyze())
        val mapping = resolvedCall?.getArgumentMapping(arg)
        return (mapping as? ArgumentMatch)?.let { match ->
            val namedExpression = uAnnotation.attributeValues.find { it.name == match.valueParameter.name.asString() }
            namedExpression?.expression as? KotlinUVarargExpression ?: namedExpression
        }
    }

    override fun findDefaultValueForAnnotationAttribute(ktCallElement: KtCallElement, name: String): KtExpression? {
        val parameter = ktCallElement.resolveToClassDescriptor()
            ?.unsubstitutedPrimaryConstructor
            ?.valueParameters
            ?.find { it.name.asString() == name } ?: return null

        return (parameter.source.getPsi() as? KtParameter)?.defaultValue
    }

    override fun getArgumentForParameter(ktCallElement: KtCallElement, index: Int, parent: UElement): UExpression? {
        return ktCallElement.getResolvedCall(ktCallElement.analyze())?.let {
            getArgumentExpressionByIndex(index, it, parent)
        }
    }

    private fun getArgumentExpressionByIndex(
        actualParamIndex: Int,
        resolvedCall: ResolvedCall<out CallableDescriptor>,
        parent: UElement,
    ): UExpression? {
        val (parameter, resolvedArgument) = resolvedCall.valueArguments.entries.find { it.key.index == actualParamIndex } ?: return null
        val arguments = resolvedArgument.arguments
        if (arguments.isEmpty()) return null
        if (arguments.size == 1) {
            val argument = arguments.single()
            val expression = argument.getArgumentExpression()
            if (parameter.varargElementType != null && argument.getSpreadElement() == null) {
                return createVarargsHolder(arguments, parent)
            }
            return baseKotlinConverter.convertOrEmpty(expression, parent)
        }
        return createVarargsHolder(arguments, parent)
    }

    private fun createVarargsHolder(
        arguments: List<ValueArgument>,
        parent: UElement?,
    ): KotlinUExpressionList =
        KotlinUExpressionList(null, UastSpecialExpressionKind.VARARGS, parent).apply {
            expressions = arguments.map { baseKotlinConverter.convertOrEmpty(it.getArgumentExpression(), parent) }
        }

    override fun getImplicitReturn(ktLambdaExpression: KtLambdaExpression, parent: UElement): KotlinUImplicitReturnExpression? {
        val lastExpression = ktLambdaExpression.bodyExpression?.statements?.lastOrNull() ?: return null
        if (!lastExpression.isUsedAsResultOfLambda(lastExpression.analyze())) return null

        return KotlinUImplicitReturnExpression(parent).apply {
            returnExpression = baseKotlinConverter.convertOrEmpty(lastExpression, this)
        }
    }

    override fun getImplicitParameters(ktLambdaExpression: KtLambdaExpression, parent: UElement): List<KotlinUParameter> {
        val functionDescriptor =
            ktLambdaExpression.analyze()[BindingContext.FUNCTION, ktLambdaExpression.functionLiteral] ?: return emptyList()
        return functionDescriptor.valueParameters.map { p ->
            KotlinUParameter(
                UastKotlinPsiParameterBase(
                    name = p.name.asString(),
                    type = p.type.toPsiType(parent, ktLambdaExpression, false),
                    parent = ktLambdaExpression,
                    ktOrigin = ktLambdaExpression,
                    language = ktLambdaExpression.language,
                    isVarArgs = p.isVararg,
                    ktDefaultValue = null
                ),
                null,
                parent
            )
        }
    }

    override fun resolveCall(ktElement: KtElement): PsiMethod? {
        return resolveToPsiMethod(ktElement)
    }

    override fun isResolvedToExtension(ktCallElement: KtCallElement): Boolean {
        val resolvedCall = ktCallElement.getResolvedCall(ktCallElement.analyze()) ?: return false
        return resolvedCall.extensionReceiver != null
    }

    override fun resolvedFunctionName(ktCallElement: KtCallElement): String? {
        val resolvedCall = ktCallElement.getResolvedCall(ktCallElement.analyze()) ?: return null
        return resolvedCall.resultingDescriptor.name.asString()
    }

    override fun qualifiedAnnotationName(ktCallElement: KtCallElement): String? {
        return ktCallElement.resolveToClassDescriptor().takeUnless(ErrorUtils::isError)
            ?.fqNameUnsafe
            ?.takeIf(FqNameUnsafe::isSafe)
            ?.toSafe()
            ?.toString()
    }

    override fun callKind(ktCallElement: KtCallElement): UastCallKind {
        val resolvedCall = ktCallElement.getResolvedCall(ktCallElement.analyze()) ?: return UastCallKind.METHOD_CALL
        return when {
            resolvedCall.resultingDescriptor is ConstructorDescriptor -> UastCallKind.CONSTRUCTOR_CALL
            isAnnotationArgumentArrayInitializer(ktCallElement, resolvedCall) -> UastCallKind.NESTED_ARRAY_INITIALIZER
            else -> UastCallKind.METHOD_CALL
        }
    }

    private fun isAnnotationArgumentArrayInitializer(
        ktCallElement: KtCallElement,
        resolvedCall: ResolvedCall<out CallableDescriptor>
    ): Boolean {
        // KtAnnotationEntry (or KtCallExpression when annotation is nested) -> KtValueArgumentList -> KtValueArgument -> arrayOf call
        val isAnnotationArgument = when (val elementAt2 = ktCallElement.parents.elementAtOrNull(2)) {
            is KtAnnotationEntry -> true
            is KtCallExpression -> elementAt2.getParentOfType<KtAnnotationEntry>(true, KtDeclaration::class.java) != null
            else -> false
        }
        if (!isAnnotationArgument) return false

        return CompileTimeConstantUtils.isArrayFunctionCall(resolvedCall)
    }

    override fun isAnnotationConstructorCall(ktCallElement: KtCallElement): Boolean {
        val classDescriptor = ktCallElement.resolveToClassDescriptor() ?: return false
        return classDescriptor.kind == ClassKind.ANNOTATION_CLASS
    }

    override fun resolveToClassIfConstructorCall(ktCallElement: KtCallElement, source: UElement): PsiClass? {
        return resolveToClassIfConstructorCallImpl(ktCallElement, source) as? PsiClass
    }

    override fun resolveToClass(ktAnnotationEntry: KtAnnotationEntry): PsiClass? {
        val classDescriptor = ktAnnotationEntry.resolveToClassDescriptor() ?: return null
        return ktAnnotationEntry.calleeExpression?.let { ktExpression ->
            resolveToDeclarationImpl(ktExpression, classDescriptor) as? PsiClass
        }
    }

    private fun <T : KtCallElement> T.resolveToClassDescriptor(): ClassDescriptor? =
        when (this) {
            is KtAnnotationEntry ->
                this.analyze()[BindingContext.ANNOTATION, this]?.annotationClass
            is KtCallExpression ->
                (this.getResolvedCall(this.analyze())?.resultingDescriptor as? ClassConstructorDescriptor)?.constructedClass
            else -> null
        }

    override fun resolveToDeclaration(ktExpression: KtExpression): PsiElement? {
        if (ktExpression is KtExpressionWithLabel) {
            return ktExpression.analyze()[BindingContext.LABEL_TARGET, ktExpression.getTargetLabel()]
        }
        return resolveToDeclarationImpl(ktExpression)
    }

    override fun resolveToType(ktTypeReference: KtTypeReference, source: UElement): PsiType? {
        return ktTypeReference.toPsiType(source)
    }

    override fun resolveToType(ktTypeReference: KtTypeReference, lightDeclaration: PsiModifierListOwner?): PsiType? {
        return ktTypeReference.getType()?.toPsiType(lightDeclaration, ktTypeReference, false)
    }

    override fun getReceiverType(ktCallElement: KtCallElement, source: UElement): PsiType? {
        val resolvedCall = ktCallElement.getResolvedCall(ktCallElement.analyze()) ?: return null
        val receiver = resolvedCall.dispatchReceiver ?: resolvedCall.extensionReceiver ?: return null
        return receiver.type.toPsiType(source, ktCallElement, boxed = true)
    }

    override fun getDoubleColonReceiverType(ktDoubleColonExpression: KtDoubleColonExpression, source: UElement): PsiType? {
        val ktType =
            ktDoubleColonExpression.analyze()[BindingContext.DOUBLE_COLON_LHS, ktDoubleColonExpression.receiverExpression]?.type
                ?: return null
        return ktType.toPsiType(source, ktDoubleColonExpression, boxed = true)
    }

    override fun getCommonSupertype(left: KtExpression, right: KtExpression, uExpression: UExpression): PsiType? {
        val ktElement = uExpression.sourcePsi as? KtExpression ?: return null

        val leftType = left.analyze()[BindingContext.EXPRESSION_TYPE_INFO, left]?.type ?: return null
        val rightType = right.analyze()[BindingContext.EXPRESSION_TYPE_INFO, right]?.type ?: return null

        return CommonSupertypes
            .commonSupertype(listOf(leftType, rightType))
            .toPsiType(uExpression, ktElement, boxed = false)
    }

    override fun getType(ktExpression: KtExpression, source: UElement): PsiType? {
        val ktType = ktExpression.analyze()[BindingContext.EXPRESSION_TYPE_INFO, ktExpression]?.type ?: return null
        return ktType.toPsiType(source, ktExpression, boxed = false)
    }

    override fun getType(ktDeclaration: KtDeclaration, source: UElement): PsiType? {
        return (ktDeclaration.analyze()[BindingContext.DECLARATION_TO_DESCRIPTOR, ktDeclaration] as? CallableDescriptor)
            ?.returnType
            ?.takeIf { !it.isError }
            ?.toPsiType(source, ktDeclaration, boxed = false)
    }

    override fun getType(ktDeclaration: KtDeclaration, lightDeclaration: PsiModifierListOwner?): PsiType? {
        return (ktDeclaration.analyze()[BindingContext.DECLARATION_TO_DESCRIPTOR, ktDeclaration] as? CallableDescriptor)
            ?.returnType
            ?.toPsiType(lightDeclaration, ktDeclaration, boxed = false)
    }

    override fun getFunctionType(ktFunction: KtFunction, source: UElement): PsiType? {
        val descriptor = ktFunction.analyze()[BindingContext.FUNCTION, ktFunction] ?: return null
        val returnType = descriptor.returnType ?: return null

        return createFunctionType(
            builtIns = descriptor.builtIns,
            annotations = descriptor.annotations,
            receiverType = descriptor.extensionReceiverParameter?.type,
            parameterTypes = descriptor.valueParameters.map { it.type },
            parameterNames = descriptor.valueParameters.map { it.name },
            returnType = returnType
        ).toPsiType(source, ktFunction, boxed = false)
    }

    override fun getFunctionalInterfaceType(uLambdaExpression: KotlinULambdaExpression): PsiType? {
        return uLambdaExpression.getFunctionalInterfaceType()
    }

    override fun nullability(psiElement: PsiElement): TypeNullability? {
        return getTargetType(psiElement)?.nullability()
    }

    private fun getTargetType(annotatedElement: PsiElement): KotlinType? {
        if (annotatedElement is KtTypeReference) {
            annotatedElement.getType()?.let { return it }
        }
        if (annotatedElement is KtCallableDeclaration) {
            annotatedElement.typeReference?.getType()?.let { return it }
        }
        if (annotatedElement is KtProperty) {
            annotatedElement.initializer?.let { it.getType(it.analyze()) }?.let { return it }
            annotatedElement.delegateExpression?.let { it.getType(it.analyze())?.arguments?.firstOrNull()?.type }?.let { return it }
        }
        annotatedElement.getParentOfType<KtProperty>(false)?.let {
            it.typeReference?.getType() ?: it.initializer?.let { it.getType(it.analyze()) }
        }?.let { return it }
        return null
    }

    override fun evaluate(uExpression: UExpression): Any? {
        val ktElement = uExpression.sourcePsi as? KtExpression ?: return null
        val compileTimeConst = ktElement.analyze()[BindingContext.COMPILE_TIME_VALUE, ktElement]
        if (compileTimeConst is UnsignedErrorValueTypeConstant) return null
        return compileTimeConst?.getValue(TypeUtils.NO_EXPECTED_TYPE)
    }
}
