/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.checkers;

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
@TestRoot("fir")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirKotlinHighlightingPassTestGenerated extends AbstractFirKotlinHighlightingPassTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/testData/checker")
    public static class Checker extends AbstractFirKotlinHighlightingPassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("Abstract.kt")
        public void testAbstract() throws Exception {
            runTest("../idea/testData/checker/Abstract.kt");
        }

        @TestMetadata("AnnotationOnFile.kt")
        public void testAnnotationOnFile() throws Exception {
            runTest("../idea/testData/checker/AnnotationOnFile.kt");
        }

        @TestMetadata("AnnotationSupressing.kt")
        public void testAnnotationSupressing() throws Exception {
            runTest("../idea/testData/checker/AnnotationSupressing.kt");
        }

        @TestMetadata("AnonymousInitializers.kt")
        public void testAnonymousInitializers() throws Exception {
            runTest("../idea/testData/checker/AnonymousInitializers.kt");
        }

        @TestMetadata("BinaryCallsOnNullableValues.kt")
        public void testBinaryCallsOnNullableValues() throws Exception {
            runTest("../idea/testData/checker/BinaryCallsOnNullableValues.kt");
        }

        @TestMetadata("Bounds.kt")
        public void testBounds() throws Exception {
            runTest("../idea/testData/checker/Bounds.kt");
        }

        @TestMetadata("Bounds2.kt")
        public void testBounds2() throws Exception {
            runTest("../idea/testData/checker/Bounds2.kt");
        }

        @TestMetadata("BoundsWithSubstitutors.kt")
        public void testBoundsWithSubstitutors() throws Exception {
            runTest("../idea/testData/checker/BoundsWithSubstitutors.kt");
        }

        @TestMetadata("BreakContinue.kt")
        public void testBreakContinue() throws Exception {
            runTest("../idea/testData/checker/BreakContinue.kt");
        }

        @TestMetadata("Builders.kt")
        public void testBuilders() throws Exception {
            runTest("../idea/testData/checker/Builders.kt");
        }

        @TestMetadata("Casts.kt")
        public void testCasts() throws Exception {
            runTest("../idea/testData/checker/Casts.kt");
        }

        @TestMetadata("ClassObjectInEnum.kt")
        public void testClassObjectInEnum() throws Exception {
            runTest("../idea/testData/checker/ClassObjectInEnum.kt");
        }

        @TestMetadata("ClassObjects.kt")
        public void testClassObjects() throws Exception {
            runTest("../idea/testData/checker/ClassObjects.kt");
        }

        @TestMetadata("Constants.kt")
        public void testConstants() throws Exception {
            runTest("../idea/testData/checker/Constants.kt");
        }

        @TestMetadata("Constructors.kt")
        public void testConstructors() throws Exception {
            runTest("../idea/testData/checker/Constructors.kt");
        }

        @TestMetadata("CyclicHierarchy.kt")
        public void testCyclicHierarchy() throws Exception {
            runTest("../idea/testData/checker/CyclicHierarchy.kt");
        }

        @TestMetadata("ExposedContainerType.kt")
        public void testExposedContainerType() throws Exception {
            runTest("../idea/testData/checker/ExposedContainerType.kt");
        }

        @TestMetadata("ExposedInferredType.kt")
        public void testExposedInferredType() throws Exception {
            runTest("../idea/testData/checker/ExposedInferredType.kt");
        }

        @TestMetadata("ExtensionFunctions.kt")
        public void testExtensionFunctions() throws Exception {
            runTest("../idea/testData/checker/ExtensionFunctions.kt");
        }

        @TestMetadata("ForRangeConventions.kt")
        public void testForRangeConventions() throws Exception {
            runTest("../idea/testData/checker/ForRangeConventions.kt");
        }

        @TestMetadata("FunctionOnlyOneTypeParametersList.kt")
        public void testFunctionOnlyOneTypeParametersList() throws Exception {
            runTest("../idea/testData/checker/FunctionOnlyOneTypeParametersList.kt");
        }

        @TestMetadata("FunctionReturnTypes.kt")
        public void testFunctionReturnTypes() throws Exception {
            runTest("../idea/testData/checker/FunctionReturnTypes.kt");
        }

        @TestMetadata("GenericArgumentConsistency.kt")
        public void testGenericArgumentConsistency() throws Exception {
            runTest("../idea/testData/checker/GenericArgumentConsistency.kt");
        }

        @TestMetadata("IncDec.kt")
        public void testIncDec() throws Exception {
            runTest("../idea/testData/checker/IncDec.kt");
        }

        @TestMetadata("IsExpressions.kt")
        public void testIsExpressions() throws Exception {
            runTest("../idea/testData/checker/IsExpressions.kt");
        }

        @TestMetadata("JvmStaticUsagesRuntime.kt")
        public void testJvmStaticUsagesRuntime() throws Exception {
            runTest("../idea/testData/checker/JvmStaticUsagesRuntime.kt");
        }

        @TestMetadata("kt32189returnTypeWithTypealiasSubtitution.kt")
        public void testKt32189returnTypeWithTypealiasSubtitution() throws Exception {
            runTest("../idea/testData/checker/kt32189returnTypeWithTypealiasSubtitution.kt");
        }

        @TestMetadata("LocalObjects.kt")
        public void testLocalObjects() throws Exception {
            runTest("../idea/testData/checker/LocalObjects.kt");
        }

        @TestMetadata("MainWithWarningOnUnusedParam.kt")
        public void testMainWithWarningOnUnusedParam() throws Exception {
            runTest("../idea/testData/checker/MainWithWarningOnUnusedParam.kt");
        }

        @TestMetadata("MainWithoutWarningOnUnusedParam.kt")
        public void testMainWithoutWarningOnUnusedParam() throws Exception {
            runTest("../idea/testData/checker/MainWithoutWarningOnUnusedParam.kt");
        }

        @TestMetadata("MultipleBounds.kt")
        public void testMultipleBounds() throws Exception {
            runTest("../idea/testData/checker/MultipleBounds.kt");
        }

        @TestMetadata("MultipleModality.kt")
        public void testMultipleModality() throws Exception {
            runTest("../idea/testData/checker/MultipleModality.kt");
        }

        @TestMetadata("NestedObjects.kt")
        public void testNestedObjects() throws Exception {
            runTest("../idea/testData/checker/NestedObjects.kt");
        }

        @TestMetadata("NotFinishedGenericDeclaration.kt")
        public void testNotFinishedGenericDeclaration() throws Exception {
            runTest("../idea/testData/checker/NotFinishedGenericDeclaration.kt");
        }

        @TestMetadata("NullAsAnnotationArgument.kt")
        public void testNullAsAnnotationArgument() throws Exception {
            runTest("../idea/testData/checker/NullAsAnnotationArgument.kt");
        }

        @TestMetadata("Nullability.kt")
        public void testNullability() throws Exception {
            runTest("../idea/testData/checker/Nullability.kt");
        }

        @TestMetadata("ObjectLiteralInDelegate.kt")
        public void testObjectLiteralInDelegate() throws Exception {
            runTest("../idea/testData/checker/ObjectLiteralInDelegate.kt");
        }

        @TestMetadata("Objects.kt")
        public void testObjects() throws Exception {
            runTest("../idea/testData/checker/Objects.kt");
        }

        @TestMetadata("Override.kt")
        public void testOverride() throws Exception {
            runTest("../idea/testData/checker/Override.kt");
        }

        @TestMetadata("OverridesAndGenerics.kt")
        public void testOverridesAndGenerics() throws Exception {
            runTest("../idea/testData/checker/OverridesAndGenerics.kt");
        }

        @TestMetadata("PackageInExpressionPosition.kt")
        public void testPackageInExpressionPosition() throws Exception {
            runTest("idea/testData/checker/PackageInExpressionPosition.kt");
        }

        @TestMetadata("PackageQualified.kt")
        public void testPackageQualified() throws Exception {
            runTest("../idea/testData/checker/PackageQualified.kt");
        }

        @TestMetadata("PrimaryConstructors.kt")
        public void testPrimaryConstructors() throws Exception {
            runTest("../idea/testData/checker/PrimaryConstructors.kt");
        }

        @TestMetadata("ProjectionsInSupertypes.kt")
        public void testProjectionsInSupertypes() throws Exception {
            runTest("../idea/testData/checker/ProjectionsInSupertypes.kt");
        }

        @TestMetadata("Properties.kt")
        public void testProperties() throws Exception {
            runTest("../idea/testData/checker/Properties.kt");
        }

        @TestMetadata("QualifiedExpressions.kt")
        public void testQualifiedExpressions() throws Exception {
            runTest("../idea/testData/checker/QualifiedExpressions.kt");
        }

        @TestMetadata("QualifiedThis.kt")
        public void testQualifiedThis() throws Exception {
            runTest("../idea/testData/checker/QualifiedThis.kt");
        }

        @TestMetadata("QualifiedThisInClosures.kt")
        public void testQualifiedThisInClosures() throws Exception {
            runTest("../idea/testData/checker/QualifiedThisInClosures.kt");
        }

        @TestMetadata("Redeclaration.kt")
        public void testRedeclaration() throws Exception {
            runTest("../idea/testData/checker/Redeclaration.kt");
        }

        @TestMetadata("Redeclarations.kt")
        public void testRedeclarations() throws Exception {
            runTest("../idea/testData/checker/Redeclarations.kt");
        }

        @TestMetadata("ResolveToJava.kt")
        public void testResolveToJava() throws Exception {
            runTest("../idea/testData/checker/ResolveToJava.kt");
        }

        @TestMetadata("ResolveTypeInAnnotationArgumentRuntime.kt")
        public void testResolveTypeInAnnotationArgumentRuntime() throws Exception {
            runTest("../idea/testData/checker/ResolveTypeInAnnotationArgumentRuntime.kt");
        }

        @TestMetadata("ReturnTypeMismatchOnOverride.kt")
        public void testReturnTypeMismatchOnOverride() throws Exception {
            runTest("../idea/testData/checker/ReturnTypeMismatchOnOverride.kt");
        }

        @TestMetadata("SafeInvoke.kt")
        public void testSafeInvoke() throws Exception {
            runTest("../idea/testData/checker/SafeInvoke.kt");
        }

        @TestMetadata("Shadowing.kt")
        public void testShadowing() throws Exception {
            runTest("../idea/testData/checker/Shadowing.kt");
        }

        @TestMetadata("StringTemplates.kt")
        public void testStringTemplates() throws Exception {
            runTest("../idea/testData/checker/StringTemplates.kt");
        }

        @TestMetadata("SupertypeListChecks.kt")
        public void testSupertypeListChecks() throws Exception {
            runTest("../idea/testData/checker/SupertypeListChecks.kt");
        }

        @TestMetadata("TraitSupertypeList.kt")
        public void testTraitSupertypeList() throws Exception {
            runTest("../idea/testData/checker/TraitSupertypeList.kt");
        }

        @TestMetadata("trivialHierarchyLoop.kt")
        public void testTrivialHierarchyLoop() throws Exception {
            runTest("../idea/testData/checker/trivialHierarchyLoop.kt");
        }

        @TestMetadata("TypeArgumentsNotAllowed.kt")
        public void testTypeArgumentsNotAllowed() throws Exception {
            runTest("../idea/testData/checker/TypeArgumentsNotAllowed.kt");
        }

        @TestMetadata("TypeParameterBounds.kt")
        public void testTypeParameterBounds() throws Exception {
            runTest("../idea/testData/checker/TypeParameterBounds.kt");
        }

        @TestMetadata("UnreachableCode.kt")
        public void testUnreachableCode() throws Exception {
            runTest("../idea/testData/checker/UnreachableCode.kt");
        }

        @TestMetadata("Unresolved.kt")
        public void testUnresolved() throws Exception {
            runTest("../idea/testData/checker/Unresolved.kt");
        }

        @TestMetadata("Unused.kt")
        public void testUnused() throws Exception {
            runTest("../idea/testData/checker/Unused.kt");
        }

        @TestMetadata("Variance.kt")
        public void testVariance() throws Exception {
            runTest("../idea/testData/checker/Variance.kt");
        }

        @TestMetadata("When.kt")
        public void testWhen() throws Exception {
            runTest("../idea/testData/checker/When.kt");
        }

        @TestMetadata("WhenInEnumInExtensionProperty.kt")
        public void testWhenInEnumInExtensionProperty() throws Exception {
            runTest("../idea/testData/checker/WhenInEnumInExtensionProperty.kt");
        }

        @TestMetadata("WhenNonExhaustive.kt")
        public void testWhenNonExhaustive() throws Exception {
            runTest("../idea/testData/checker/WhenNonExhaustive.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/testData/checker/regression")
    public static class Regression extends AbstractFirKotlinHighlightingPassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("AmbiguityOnLazyTypeComputation.kt")
        public void testAmbiguityOnLazyTypeComputation() throws Exception {
            runTest("../idea/testData/checker/regression/AmbiguityOnLazyTypeComputation.kt");
        }

        @TestMetadata("AnnotationOnNamedParameterOfFunctionType.kt")
        public void testAnnotationOnNamedParameterOfFunctionType() throws Exception {
            runTest("../idea/testData/checker/regression/AnnotationOnNamedParameterOfFunctionType.kt");
        }

        @TestMetadata("AnnotationOnParameterOfFunctionType.kt")
        public void testAnnotationOnParameterOfFunctionType() throws Exception {
            runTest("../idea/testData/checker/regression/AnnotationOnParameterOfFunctionType.kt");
        }

        @TestMetadata("AssignmentsUnderOperators.kt")
        public void testAssignmentsUnderOperators() throws Exception {
            runTest("../idea/testData/checker/regression/AssignmentsUnderOperators.kt");
        }

        @TestMetadata("BadParseForClass.kt")
        public void testBadParseForClass() throws Exception {
            runTest("../idea/testData/checker/regression/BadParseForClass.kt");
        }

        @TestMetadata("callVariableAsFunctionWithAnonymousObjectArg.kt")
        public void testCallVariableAsFunctionWithAnonymousObjectArg() throws Exception {
            runTest("../idea/testData/checker/regression/callVariableAsFunctionWithAnonymousObjectArg.kt");
        }

        @TestMetadata("callVariableAsFunctionWithLambdaArg.kt")
        public void testCallVariableAsFunctionWithLambdaArg() throws Exception {
            runTest("../idea/testData/checker/regression/callVariableAsFunctionWithLambdaArg.kt");
        }

        @TestMetadata("ClassDeclarationAfterDot.kt")
        public void testClassDeclarationAfterDot() throws Exception {
            runTest("../idea/testData/checker/regression/ClassDeclarationAfterDot.kt");
        }

        @TestMetadata("ClassDeclarationAfterDot2.kt")
        public void testClassDeclarationAfterDot2() throws Exception {
            runTest("../idea/testData/checker/regression/ClassDeclarationAfterDot2.kt");
        }

        @TestMetadata("ClassDeclarationAsExpression.kt")
        public void testClassDeclarationAsExpression() throws Exception {
            runTest("../idea/testData/checker/regression/ClassDeclarationAsExpression.kt");
        }

        @TestMetadata("ClassDeclarationAsExpression2.kt")
        public void testClassDeclarationAsExpression2() throws Exception {
            runTest("../idea/testData/checker/regression/ClassDeclarationAsExpression2.kt");
        }

        @TestMetadata("ClassDeclarationAsExpression3.kt")
        public void testClassDeclarationAsExpression3() throws Exception {
            runTest("../idea/testData/checker/regression/ClassDeclarationAsExpression3.kt");
        }

        @TestMetadata("CoercionToUnit.kt")
        public void testCoercionToUnit() throws Exception {
            runTest("../idea/testData/checker/regression/CoercionToUnit.kt");
        }

        @TestMetadata("createInnerInstance.kt")
        public void testCreateInnerInstance() throws Exception {
            runTest("../idea/testData/checker/regression/createInnerInstance.kt");
        }

        @TestMetadata("DescructuringDeclarationInForLoop.kt")
        public void testDescructuringDeclarationInForLoop() throws Exception {
            runTest("../idea/testData/checker/regression/DescructuringDeclarationInForLoop.kt");
        }

        @TestMetadata("DestructuringDeclarationInLambda.kt")
        public void testDestructuringDeclarationInLambda() throws Exception {
            runTest("../idea/testData/checker/regression/DestructuringDeclarationInLambda.kt");
        }

        @TestMetadata("DollarsInName.kt")
        public void testDollarsInName() throws Exception {
            runTest("../idea/testData/checker/regression/DollarsInName.kt");
        }

        @TestMetadata("DoubleDefine.kt")
        public void testDoubleDefine() throws Exception {
            runTest("../idea/testData/checker/regression/DoubleDefine.kt");
        }

        @TestMetadata("extensionMemberInClassObject.kt")
        public void testExtensionMemberInClassObject() throws Exception {
            runTest("../idea/testData/checker/regression/extensionMemberInClassObject.kt");
        }

        @TestMetadata("FunDeclarationAfterDot.kt")
        public void testFunDeclarationAfterDot() throws Exception {
            runTest("../idea/testData/checker/regression/FunDeclarationAfterDot.kt");
        }

        @TestMetadata("FunctionLiteralInsideAnnotation.kt")
        public void testFunctionLiteralInsideAnnotation() throws Exception {
            runTest("../idea/testData/checker/regression/FunctionLiteralInsideAnnotation.kt");
        }

        @TestMetadata("FunctionTypes.kt")
        public void testFunctionTypes() throws Exception {
            runTest("../idea/testData/checker/regression/FunctionTypes.kt");
        }

        @TestMetadata("IncompleteClassDelegation.kt")
        public void testIncompleteClassDelegation() throws Exception {
            runTest("../idea/testData/checker/regression/IncompleteClassDelegation.kt");
        }

        @TestMetadata("InitializerInInterface.kt")
        public void testInitializerInInterface() throws Exception {
            runTest("../idea/testData/checker/regression/InitializerInInterface.kt");
        }

        @TestMetadata("InterfaceDeclarationAsExpression.kt")
        public void testInterfaceDeclarationAsExpression() throws Exception {
            runTest("../idea/testData/checker/regression/InterfaceDeclarationAsExpression.kt");
        }

        @TestMetadata("javaStyleClassLiteralInAnnotationArguments.kt")
        public void testJavaStyleClassLiteralInAnnotationArguments() throws Exception {
            runTest("../idea/testData/checker/regression/javaStyleClassLiteralInAnnotationArguments.kt");
        }

        @TestMetadata("Jet11.kt")
        public void testJet11() throws Exception {
            runTest("../idea/testData/checker/regression/Jet11.kt");
        }

        @TestMetadata("Jet121.kt")
        public void testJet121() throws Exception {
            runTest("../idea/testData/checker/regression/Jet121.kt");
        }

        @TestMetadata("Jet124.kt")
        public void testJet124() throws Exception {
            runTest("../idea/testData/checker/regression/Jet124.kt");
        }

        @TestMetadata("Jet169.kt")
        public void testJet169() throws Exception {
            runTest("../idea/testData/checker/regression/Jet169.kt");
        }

        @TestMetadata("Jet183.kt")
        public void testJet183() throws Exception {
            runTest("../idea/testData/checker/regression/Jet183.kt");
        }

        @TestMetadata("Jet183-1.kt")
        public void testJet183_1() throws Exception {
            runTest("../idea/testData/checker/regression/Jet183-1.kt");
        }

        @TestMetadata("Jet53.kt")
        public void testJet53() throws Exception {
            runTest("../idea/testData/checker/regression/Jet53.kt");
        }

        @TestMetadata("Jet67.kt")
        public void testJet67() throws Exception {
            runTest("../idea/testData/checker/regression/Jet67.kt");
        }

        @TestMetadata("Jet68.kt")
        public void testJet68() throws Exception {
            runTest("../idea/testData/checker/regression/Jet68.kt");
        }

        @TestMetadata("Jet69.kt")
        public void testJet69() throws Exception {
            runTest("../idea/testData/checker/regression/Jet69.kt");
        }

        @TestMetadata("Jet72.kt")
        public void testJet72() throws Exception {
            runTest("../idea/testData/checker/regression/Jet72.kt");
        }

        @TestMetadata("kt251.kt")
        public void testKt251() throws Exception {
            runTest("../idea/testData/checker/regression/kt251.kt");
        }

        @TestMetadata("kt303.kt")
        public void testKt303() throws Exception {
            runTest("../idea/testData/checker/regression/kt303.kt");
        }

        @TestMetadata("kt9887.kt")
        public void testKt9887() throws Exception {
            runTest("../idea/testData/checker/regression/kt9887.kt");
        }

        @TestMetadata("objectLiteralInSupertypeList.kt")
        public void testObjectLiteralInSupertypeList() throws Exception {
            runTest("../idea/testData/checker/regression/objectLiteralInSupertypeList.kt");
        }

        @TestMetadata("OverrideResolution.kt")
        public void testOverrideResolution() throws Exception {
            runTest("../idea/testData/checker/regression/OverrideResolution.kt");
        }

        @TestMetadata("PropertyDeclarationAsExpression.kt")
        public void testPropertyDeclarationAsExpression() throws Exception {
            runTest("../idea/testData/checker/regression/PropertyDeclarationAsExpression.kt");
        }

        @TestMetadata("ScopeForSecondaryConstructors.kt")
        public void testScopeForSecondaryConstructors() throws Exception {
            runTest("../idea/testData/checker/regression/ScopeForSecondaryConstructors.kt");
        }

        @TestMetadata("SpecififcityByReceiver.kt")
        public void testSpecififcityByReceiver() throws Exception {
            runTest("../idea/testData/checker/regression/SpecififcityByReceiver.kt");
        }

        @TestMetadata("WrongTraceInCallResolver.kt")
        public void testWrongTraceInCallResolver() throws Exception {
            runTest("../idea/testData/checker/regression/WrongTraceInCallResolver.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/testData/checker/recovery")
    public static class Recovery extends AbstractFirKotlinHighlightingPassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("namelessMembers.kt")
        public void testNamelessMembers() throws Exception {
            runTest("../idea/testData/checker/recovery/namelessMembers.kt");
        }

        @TestMetadata("namelessToplevelDeclarations.kt")
        public void testNamelessToplevelDeclarations() throws Exception {
            runTest("../idea/testData/checker/recovery/namelessToplevelDeclarations.kt");
        }

        @TestMetadata("returnInFileAnnotation.kt")
        public void testReturnInFileAnnotation() throws Exception {
            runTest("../idea/testData/checker/recovery/returnInFileAnnotation.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/testData/checker/rendering")
    public static class Rendering extends AbstractFirKotlinHighlightingPassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("TypeInferenceError.kt")
        public void testTypeInferenceError() throws Exception {
            runTest("../idea/testData/checker/rendering/TypeInferenceError.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/testData/checker/infos")
    public static class Infos extends AbstractFirKotlinHighlightingPassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("CapturedConstructorParameter.kt")
        public void testCapturedConstructorParameter() throws Exception {
            runTest("../idea/testData/checker/infos/CapturedConstructorParameter.kt");
        }

        @TestMetadata("CapturedInInlinedClosure.kt")
        public void testCapturedInInlinedClosure() throws Exception {
            runTest("../idea/testData/checker/infos/CapturedInInlinedClosure.kt");
        }

        @TestMetadata("multipleResolvedCalls.kt")
        public void testMultipleResolvedCalls() throws Exception {
            runTest("../idea/testData/checker/infos/multipleResolvedCalls.kt");
        }

        @TestMetadata("PropertiesWithBackingFields.kt")
        public void testPropertiesWithBackingFields() throws Exception {
            runTest("../idea/testData/checker/infos/PropertiesWithBackingFields.kt");
        }

        @TestMetadata("smartCastOnElvis.kt")
        public void testSmartCastOnElvis() throws Exception {
            runTest("../idea/testData/checker/infos/smartCastOnElvis.kt");
        }

        @TestMetadata("SmartCastOnIf.kt")
        public void testSmartCastOnIf() throws Exception {
            runTest("../idea/testData/checker/infos/SmartCastOnIf.kt");
        }

        @TestMetadata("SmartCastOnWhen.kt")
        public void testSmartCastOnWhen() throws Exception {
            runTest("../idea/testData/checker/infos/SmartCastOnWhen.kt");
        }

        @TestMetadata("SmartCastTarget.kt")
        public void testSmartCastTarget() throws Exception {
            runTest("../idea/testData/checker/infos/SmartCastTarget.kt");
        }

        @TestMetadata("SmartCastToEnum.kt")
        public void testSmartCastToEnum() throws Exception {
            runTest("../idea/testData/checker/infos/SmartCastToEnum.kt");
        }

        @TestMetadata("SmartCasts.kt")
        public void testSmartCasts() throws Exception {
            runTest("../idea/testData/checker/infos/SmartCasts.kt");
        }

        @TestMetadata("SmartCastsWithSafeAccess.kt")
        public void testSmartCastsWithSafeAccess() throws Exception {
            runTest("../idea/testData/checker/infos/SmartCastsWithSafeAccess.kt");
        }

        @TestMetadata("threeImplicitReceivers.kt")
        public void testThreeImplicitReceivers() throws Exception {
            runTest("../idea/testData/checker/infos/threeImplicitReceivers.kt");
        }

        @TestMetadata("twoImplicitReceivers.kt")
        public void testTwoImplicitReceivers() throws Exception {
            runTest("../idea/testData/checker/infos/twoImplicitReceivers.kt");
        }

        @TestMetadata("Typos.kt")
        public void testTypos() throws Exception {
            runTest("../idea/testData/checker/infos/Typos.kt");
        }

        @TestMetadata("TyposInOverrideParams.kt")
        public void testTyposInOverrideParams() throws Exception {
            runTest("../idea/testData/checker/infos/TyposInOverrideParams.kt");
        }

        @TestMetadata("WrapIntoRef.kt")
        public void testWrapIntoRef() throws Exception {
            runTest("../idea/testData/checker/infos/WrapIntoRef.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/testData/checker/diagnosticsMessage")
    public static class DiagnosticsMessage extends AbstractFirKotlinHighlightingPassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("fullPackageFQNameOnVisiblityError.kt")
        public void testFullPackageFQNameOnVisiblityError() throws Exception {
            runTest("../idea/testData/checker/diagnosticsMessage/fullPackageFQNameOnVisiblityError.kt");
        }

        @TestMetadata("incompleteTypeArgumentList.kt")
        public void testIncompleteTypeArgumentList() throws Exception {
            runTest("../idea/testData/checker/diagnosticsMessage/incompleteTypeArgumentList.kt");
        }

        @TestMetadata("instantiationOfInnerClassInQualifiedForm.kt")
        public void testInstantiationOfInnerClassInQualifiedForm() throws Exception {
            runTest("../idea/testData/checker/diagnosticsMessage/instantiationOfInnerClassInQualifiedForm.kt");
        }

        @TestMetadata("lateinitOfATypeWithNullableUpperBound.kt")
        public void testLateinitOfATypeWithNullableUpperBound() throws Exception {
            runTest("../idea/testData/checker/diagnosticsMessage/lateinitOfATypeWithNullableUpperBound.kt");
        }

        @TestMetadata("nArgumentsExpectedMessage.kt")
        public void testNArgumentsExpectedMessage() throws Exception {
            runTest("../idea/testData/checker/diagnosticsMessage/nArgumentsExpectedMessage.kt");
        }

        @TestMetadata("noSubstitutedTypeParameter.kt")
        public void testNoSubstitutedTypeParameter() throws Exception {
            runTest("../idea/testData/checker/diagnosticsMessage/noSubstitutedTypeParameter.kt");
        }

        @TestMetadata("operatorCallDiagnosticsOnInOperator.kt")
        public void testOperatorCallDiagnosticsOnInOperator() throws Exception {
            runTest("../idea/testData/checker/diagnosticsMessage/operatorCallDiagnosticsOnInOperator.kt");
        }

        @TestMetadata("valOrVarOnParameter.kt")
        public void testValOrVarOnParameter() throws Exception {
            runTest("../idea/tests/testData/checker/diagnosticsMessage/valOrVarOnParameter.kt");
        }
    }
}
