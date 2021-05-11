/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.internal;

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
@TestRoot("idea/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/internal/toolWindow")
public class BytecodeToolWindowTestGenerated extends AbstractBytecodeToolWindowTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("componentInlineFun")
    public void testComponentInlineFun() throws Exception {
        runTest("testData/internal/toolWindow/componentInlineFun/");
    }

    @TestMetadata("inlineFunctionBodyResolve")
    public void testInlineFunctionBodyResolve() throws Exception {
        runTest("testData/internal/toolWindow/inlineFunctionBodyResolve/");
    }

    @TestMetadata("inlineFunctionDeep1")
    public void testInlineFunctionDeep1() throws Exception {
        runTest("testData/internal/toolWindow/inlineFunctionDeep1/");
    }

    @TestMetadata("inlineFunctionDeep2")
    public void testInlineFunctionDeep2() throws Exception {
        runTest("testData/internal/toolWindow/inlineFunctionDeep2/");
    }

    @TestMetadata("inlineFunctionInfixCall")
    public void testInlineFunctionInfixCall() throws Exception {
        runTest("testData/internal/toolWindow/inlineFunctionInfixCall/");
    }

    @TestMetadata("inlineFunctionReifiedParam")
    public void testInlineFunctionReifiedParam() throws Exception {
        runTest("testData/internal/toolWindow/inlineFunctionReifiedParam/");
    }

    @TestMetadata("inlineProperty")
    public void testInlineProperty() throws Exception {
        runTest("testData/internal/toolWindow/inlineProperty/");
    }

    @TestMetadata("iteratorFun")
    public void testIteratorFun() throws Exception {
        runTest("testData/internal/toolWindow/iteratorFun/");
    }

    @TestMetadata("multipleInlineFunctionCalls")
    public void testMultipleInlineFunctionCalls() throws Exception {
        runTest("testData/internal/toolWindow/multipleInlineFunctionCalls/");
    }

    @TestMetadata("objectInInlineFun")
    public void testObjectInInlineFun() throws Exception {
        runTest("testData/internal/toolWindow/objectInInlineFun/");
    }
}
