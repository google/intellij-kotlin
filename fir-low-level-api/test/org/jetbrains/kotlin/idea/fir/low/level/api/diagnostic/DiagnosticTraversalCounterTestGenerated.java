/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.low.level.api.diagnostic;

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
@TestRoot("fir-low-level-api")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testdata/diagnosticTraversalCounter")
public class DiagnosticTraversalCounterTestGenerated extends AbstractDiagnosticTraversalCounterTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("constructor.kt")
    public void testConstructor() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/constructor.kt");
    }

    @TestMetadata("declarationsInPropertyInit.kt")
    public void testDeclarationsInPropertyInit() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/declarationsInPropertyInit.kt");
    }

    @TestMetadata("enumClass.kt")
    public void testEnumClass() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/enumClass.kt");
    }

    @TestMetadata("enumClassWithBody.kt")
    public void testEnumClassWithBody() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/enumClassWithBody.kt");
    }

    @TestMetadata("functionalType.kt")
    public void testFunctionalType() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/functionalType.kt");
    }

    @TestMetadata("initBlock.kt")
    public void testInitBlock() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/initBlock.kt");
    }

    @TestMetadata("lambda.kt")
    public void testLambda() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/diagnosticTraversalCounter/lambda.kt");
    }

    @TestMetadata("localDeclarationsInAccessor.kt")
    public void testLocalDeclarationsInAccessor() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/localDeclarationsInAccessor.kt");
    }

    @TestMetadata("localFunctionWithImplicitType.kt")
    public void testLocalFunctionWithImplicitType() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/localFunctionWithImplicitType.kt");
    }

    @TestMetadata("localUnitFunction.kt")
    public void testLocalUnitFunction() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/localUnitFunction.kt");
    }

    @TestMetadata("memberFunctions.kt")
    public void testMemberFunctions() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/memberFunctions.kt");
    }

    @TestMetadata("memberProperties.kt")
    public void testMemberProperties() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/memberProperties.kt");
    }

    @TestMetadata("memberTypeAlias.kt")
    public void testMemberTypeAlias() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/memberTypeAlias.kt");
    }

    @TestMetadata("multipleTopLevelClasses.kt")
    public void testMultipleTopLevelClasses() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/multipleTopLevelClasses.kt");
    }

    @TestMetadata("multipleTopLevelFunctionsWithImplicitTypes.kt")
    public void testMultipleTopLevelFunctionsWithImplicitTypes() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/multipleTopLevelFunctionsWithImplicitTypes.kt");
    }

    @TestMetadata("multipleTopLevelUnitFunctions.kt")
    public void testMultipleTopLevelUnitFunctions() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/multipleTopLevelUnitFunctions.kt");
    }

    @TestMetadata("nestedClases.kt")
    public void testNestedClases() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/nestedClases.kt");
    }

    @TestMetadata("nestedClasesWithFun.kt")
    public void testNestedClasesWithFun() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/nestedClasesWithFun.kt");
    }

    @TestMetadata("propertyAccessors.kt")
    public void testPropertyAccessors() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/propertyAccessors.kt");
    }

    @TestMetadata("propertyWithGetterAndSetter.kt")
    public void testPropertyWithGetterAndSetter() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/propertyWithGetterAndSetter.kt");
    }

    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/secondaryConstructor.kt");
    }

    @TestMetadata("typeAlias.kt")
    public void testTypeAlias() throws Exception {
        runTest("testdata/diagnosticTraversalCounter/typeAlias.kt");
    }
}
