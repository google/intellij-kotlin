/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.uast;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.idea.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.idea.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("uast/uast-kotlin-fir")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("../uast-kotlin/testData")
public class FirLegacyUastDeclarationTestGenerated extends AbstractFirLegacyUastDeclarationTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("AnnotatedExpressions.kt")
    public void testAnnotatedExpressions() throws Exception {
        runTest("../uast-kotlin/testData/AnnotatedExpressions.kt");
    }

    @TestMetadata("AnnotationComplex.kt")
    public void testAnnotationComplex() throws Exception {
        runTest("../uast-kotlin/testData/AnnotationComplex.kt");
    }

    @TestMetadata("AnnotationParameters.kt")
    public void testAnnotationParameters() throws Exception {
        runTest("../uast-kotlin/testData/AnnotationParameters.kt");
    }

    @TestMetadata("Anonymous.kt")
    public void testAnonymous() throws Exception {
        runTest("../uast-kotlin/testData/Anonymous.kt");
    }

    @TestMetadata("Assertion.kt")
    public void testAssertion() throws Exception {
        runTest("../uast-kotlin/testData/Assertion.kt");
    }

    @TestMetadata("Bitwise.kt")
    public void testBitwise() throws Exception {
        runTest("../uast-kotlin/testData/Bitwise.kt");
    }

    @TestMetadata("BrokenMethod.kt")
    public void testBrokenMethod() throws Exception {
        runTest("../uast-kotlin/testData/BrokenMethod.kt");
    }

    @TestMetadata("ClassAnnotation.kt")
    public void testClassAnnotation() throws Exception {
        runTest("../uast-kotlin/testData/ClassAnnotation.kt");
    }

    @TestMetadata("CommentOwners.kt")
    public void testCommentOwners() throws Exception {
        runTest("../uast-kotlin/testData/CommentOwners.kt");
    }

    @TestMetadata("Comments.kt")
    public void testComments() throws Exception {
        runTest("../uast-kotlin/testData/Comments.kt");
    }

    @TestMetadata("ConstructorDelegate.kt")
    public void testConstructorDelegate() throws Exception {
        runTest("../uast-kotlin/testData/ConstructorDelegate.kt");
    }

    @TestMetadata("Constructors.kt")
    public void testConstructors() throws Exception {
        runTest("../uast-kotlin/testData/Constructors.kt");
    }

    @TestMetadata("CycleInTypeParameters.kt")
    public void testCycleInTypeParameters() throws Exception {
        runTest("../uast-kotlin/testData/CycleInTypeParameters.kt");
    }

    @TestMetadata("DefaultImpls.kt")
    public void testDefaultImpls() throws Exception {
        runTest("../uast-kotlin/testData/DefaultImpls.kt");
    }

    @TestMetadata("DefaultParameterValues.kt")
    public void testDefaultParameterValues() throws Exception {
        runTest("../uast-kotlin/testData/DefaultParameterValues.kt");
    }

    @TestMetadata("Delegate.kt")
    public void testDelegate() throws Exception {
        runTest("../uast-kotlin/testData/Delegate.kt");
    }

    @TestMetadata("DeprecatedHidden.kt")
    public void testDeprecatedHidden() throws Exception {
        runTest("../uast-kotlin/testData/DeprecatedHidden.kt");
    }

    @TestMetadata("DestructuringDeclaration.kt")
    public void testDestructuringDeclaration() throws Exception {
        runTest("../uast-kotlin/testData/DestructuringDeclaration.kt");
    }

    @TestMetadata("ea101715.kt")
    public void testEa101715() throws Exception {
        runTest("../uast-kotlin/testData/ea101715.kt");
    }

    @TestMetadata("Elvis.kt")
    public void testElvis() throws Exception {
        runTest("../uast-kotlin/testData/Elvis.kt");
    }

    @TestMetadata("ElvisType.kt")
    public void testElvisType() throws Exception {
        runTest("../uast-kotlin/testData/ElvisType.kt");
    }

    @TestMetadata("EnumValueMembers.kt")
    public void testEnumValueMembers() throws Exception {
        runTest("../uast-kotlin/testData/EnumValueMembers.kt");
    }

    @TestMetadata("EnumValuesConstructors.kt")
    public void testEnumValuesConstructors() throws Exception {
        runTest("../uast-kotlin/testData/EnumValuesConstructors.kt");
    }

    @TestMetadata("IfStatement.kt")
    public void testIfStatement() throws Exception {
        runTest("../uast-kotlin/testData/IfStatement.kt");
    }

    @TestMetadata("Imports.kt")
    public void testImports() throws Exception {
        runTest("../uast-kotlin/testData/Imports.kt");
    }

    @TestMetadata("In.kt")
    public void testIn() throws Exception {
        runTest("../uast-kotlin/testData/In.kt");
    }

    @TestMetadata("InferenceInsideUnresolvedConstructor.kt")
    public void testInferenceInsideUnresolvedConstructor() throws Exception {
        runTest("../uast-kotlin/testData/InferenceInsideUnresolvedConstructor.kt");
    }

    @TestMetadata("InnerClasses.kt")
    public void testInnerClasses() throws Exception {
        runTest("../uast-kotlin/testData/InnerClasses.kt");
    }

    @TestMetadata("InnerNonFixedTypeVariable.kt")
    public void testInnerNonFixedTypeVariable() throws Exception {
        runTest("../uast-kotlin/testData/InnerNonFixedTypeVariable.kt");
    }

    @TestMetadata("LambdaReturn.kt")
    public void testLambdaReturn() throws Exception {
        runTest("../uast-kotlin/testData/LambdaReturn.kt");
    }

    @TestMetadata("Lambdas.kt")
    public void testLambdas() throws Exception {
        runTest("../uast-kotlin/testData/Lambdas.kt");
    }

    @TestMetadata("LocalDeclarations.kt")
    public void testLocalDeclarations() throws Exception {
        runTest("../uast-kotlin/testData/LocalDeclarations.kt");
    }

    @TestMetadata("LocalVariableWithAnnotation.kt")
    public void testLocalVariableWithAnnotation() throws Exception {
        runTest("../uast-kotlin/testData/LocalVariableWithAnnotation.kt");
    }

    @TestMetadata("ManyAlternatives.kt")
    public void testManyAlternatives() throws Exception {
        runTest("../uast-kotlin/testData/ManyAlternatives.kt");
    }

    @TestMetadata("MethodReference.kt")
    public void testMethodReference() throws Exception {
        runTest("../uast-kotlin/testData/MethodReference.kt");
    }

    @TestMetadata("NameContainingFile.kt")
    public void testNameContainingFile() throws Exception {
        runTest("../uast-kotlin/testData/NameContainingFile.kt");
    }

    @TestMetadata("NonTrivialIdentifiers.kt")
    public void testNonTrivialIdentifiers() throws Exception {
        runTest("../uast-kotlin/testData/NonTrivialIdentifiers.kt");
    }

    @TestMetadata("ParameterPropertyWithAnnotation.kt")
    public void testParameterPropertyWithAnnotation() throws Exception {
        runTest("../uast-kotlin/testData/ParameterPropertyWithAnnotation.kt");
    }

    @TestMetadata("ParametersDisorder.kt")
    public void testParametersDisorder() throws Exception {
        runTest("../uast-kotlin/testData/ParametersDisorder.kt");
    }

    @TestMetadata("ParametersWithDefaultValues.kt")
    public void testParametersWithDefaultValues() throws Exception {
        runTest("../uast-kotlin/testData/ParametersWithDefaultValues.kt");
    }

    @TestMetadata("PropertyAccessors.kt")
    public void testPropertyAccessors() throws Exception {
        runTest("../uast-kotlin/testData/PropertyAccessors.kt");
    }

    @TestMetadata("PropertyDelegate.kt")
    public void testPropertyDelegate() throws Exception {
        runTest("../uast-kotlin/testData/PropertyDelegate.kt");
    }

    @TestMetadata("PropertyInitializer.kt")
    public void testPropertyInitializer() throws Exception {
        runTest("../uast-kotlin/testData/PropertyInitializer.kt");
    }

    @TestMetadata("PropertyInitializerWithoutSetter.kt")
    public void testPropertyInitializerWithoutSetter() throws Exception {
        runTest("../uast-kotlin/testData/PropertyInitializerWithoutSetter.kt");
    }

    @TestMetadata("PropertyReferences.kt")
    public void testPropertyReferences() throws Exception {
        runTest("../uast-kotlin/testData/PropertyReferences.kt");
    }

    @TestMetadata("PropertyWithAnnotation.kt")
    public void testPropertyWithAnnotation() throws Exception {
        runTest("../uast-kotlin/testData/PropertyWithAnnotation.kt");
    }

    @TestMetadata("QualifiedConstructorCall.kt")
    public void testQualifiedConstructorCall() throws Exception {
        runTest("../uast-kotlin/testData/QualifiedConstructorCall.kt");
    }

    @TestMetadata("ReceiverFun.kt")
    public void testReceiverFun() throws Exception {
        runTest("../uast-kotlin/testData/ReceiverFun.kt");
    }

    @TestMetadata("Reified.kt")
    public void testReified() throws Exception {
        runTest("../uast-kotlin/testData/Reified.kt");
    }

    @TestMetadata("ReifiedParameters.kt")
    public void testReifiedParameters() throws Exception {
        runTest("../uast-kotlin/testData/ReifiedParameters.kt");
    }

    @TestMetadata("ReifiedResolve.kt")
    public void testReifiedResolve() throws Exception {
        runTest("../uast-kotlin/testData/ReifiedResolve.kt");
    }

    @TestMetadata("ReifiedReturnType.kt")
    public void testReifiedReturnType() throws Exception {
        runTest("../uast-kotlin/testData/ReifiedReturnType.kt");
    }

    @TestMetadata("Resolve.kt")
    public void testResolve() throws Exception {
        runTest("../uast-kotlin/testData/Resolve.kt");
    }

    @TestMetadata("SAM.kt")
    public void testSAM() throws Exception {
        runTest("../uast-kotlin/testData/SAM.kt");
    }

    @TestMetadata("Simple.kt")
    public void testSimple() throws Exception {
        runTest("../uast-kotlin/testData/Simple.kt");
    }

    @TestMetadata("SimpleAnnotated.kt")
    public void testSimpleAnnotated() throws Exception {
        runTest("../uast-kotlin/testData/SimpleAnnotated.kt");
    }

    @TestMetadata("StringTemplate.kt")
    public void testStringTemplate() throws Exception {
        runTest("../uast-kotlin/testData/StringTemplate.kt");
    }

    @TestMetadata("StringTemplateComplex.kt")
    public void testStringTemplateComplex() throws Exception {
        runTest("../uast-kotlin/testData/StringTemplateComplex.kt");
    }

    @TestMetadata("StringTemplateComplexForUInjectionHost.kt")
    public void testStringTemplateComplexForUInjectionHost() throws Exception {
        runTest("../uast-kotlin/testData/StringTemplateComplexForUInjectionHost.kt");
    }

    @TestMetadata("StringTemplateInClass.kt")
    public void testStringTemplateInClass() throws Exception {
        runTest("../uast-kotlin/testData/StringTemplateInClass.kt");
    }

    @TestMetadata("StringTemplateWithVar.kt")
    public void testStringTemplateWithVar() throws Exception {
        runTest("../uast-kotlin/testData/StringTemplateWithVar.kt");
    }

    @TestMetadata("SuperCalls.kt")
    public void testSuperCalls() throws Exception {
        runTest("../uast-kotlin/testData/SuperCalls.kt");
    }

    @TestMetadata("Suspend.kt")
    public void testSuspend() throws Exception {
        runTest("../uast-kotlin/testData/Suspend.kt");
    }

    @TestMetadata("TryCatch.kt")
    public void testTryCatch() throws Exception {
        runTest("../uast-kotlin/testData/TryCatch.kt");
    }

    @TestMetadata("TypeAliasExpansionWithOtherAliasInArgument.kt")
    public void testTypeAliasExpansionWithOtherAliasInArgument() throws Exception {
        runTest("../uast-kotlin/testData/TypeAliasExpansionWithOtherAliasInArgument.kt");
    }

    @TestMetadata("TypeAliases.kt")
    public void testTypeAliases() throws Exception {
        runTest("../uast-kotlin/testData/TypeAliases.kt");
    }

    @TestMetadata("TypeInAnnotation.kt")
    public void testTypeInAnnotation() throws Exception {
        runTest("../uast-kotlin/testData/TypeInAnnotation.kt");
    }

    @TestMetadata("TypeReferences.kt")
    public void testTypeReferences() throws Exception {
        runTest("../uast-kotlin/testData/TypeReferences.kt");
    }

    @TestMetadata("UnexpectedContainerException.kt")
    public void testUnexpectedContainerException() throws Exception {
        runTest("../uast-kotlin/testData/UnexpectedContainerException.kt");
    }

    @TestMetadata("WhenAndDestructing.kt")
    public void testWhenAndDestructing() throws Exception {
        runTest("../uast-kotlin/testData/WhenAndDestructing.kt");
    }

    @TestMetadata("WhenIs.kt")
    public void testWhenIs() throws Exception {
        runTest("../uast-kotlin/testData/WhenIs.kt");
    }

    @TestMetadata("WhenStringLiteral.kt")
    public void testWhenStringLiteral() throws Exception {
        runTest("../uast-kotlin/testData/WhenStringLiteral.kt");
    }
}
