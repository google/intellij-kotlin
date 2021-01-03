/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jps.build;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("jps/jps-plugin")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/incremental/multiModule/common")
public class IncrementalJsJpsTestGenerated extends AbstractIncrementalJsJpsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("classAdded")
    public void testClassAdded() throws Exception {
        runTest("testData/incremental/multiModule/common/classAdded/");
    }

    @TestMetadata("classRemoved")
    public void testClassRemoved() throws Exception {
        runTest("testData/incremental/multiModule/common/classRemoved/");
    }

    @TestMetadata("constantValueChanged")
    public void testConstantValueChanged() throws Exception {
        runTest("testData/incremental/multiModule/common/constantValueChanged/");
    }

    @TestMetadata("copyFileToAnotherModule")
    public void testCopyFileToAnotherModule() throws Exception {
        runTest("testData/incremental/multiModule/common/copyFileToAnotherModule/");
    }

    @TestMetadata("defaultArgumentInConstructorRemoved")
    public void testDefaultArgumentInConstructorRemoved() throws Exception {
        runTest("testData/incremental/multiModule/common/defaultArgumentInConstructorRemoved/");
    }

    @TestMetadata("defaultParameterAdded")
    public void testDefaultParameterAdded() throws Exception {
        runTest("testData/incremental/multiModule/common/defaultParameterAdded/");
    }

    @TestMetadata("defaultParameterAddedForTopLevelFun")
    public void testDefaultParameterAddedForTopLevelFun() throws Exception {
        runTest("testData/incremental/multiModule/common/defaultParameterAddedForTopLevelFun/");
    }

    @TestMetadata("defaultParameterRemoved")
    public void testDefaultParameterRemoved() throws Exception {
        runTest("testData/incremental/multiModule/common/defaultParameterRemoved/");
    }

    @TestMetadata("defaultParameterRemovedForTopLevelFun")
    public void testDefaultParameterRemovedForTopLevelFun() throws Exception {
        runTest("testData/incremental/multiModule/common/defaultParameterRemovedForTopLevelFun/");
    }

    @TestMetadata("defaultValueInConstructorRemoved")
    public void testDefaultValueInConstructorRemoved() throws Exception {
        runTest("testData/incremental/multiModule/common/defaultValueInConstructorRemoved/");
    }

    @TestMetadata("duplicatedClass")
    public void testDuplicatedClass() throws Exception {
        runTest("testData/incremental/multiModule/common/duplicatedClass/");
    }

    @TestMetadata("exportedDependency")
    public void testExportedDependency() throws Exception {
        runTest("testData/incremental/multiModule/common/exportedDependency/");
    }

    @TestMetadata("functionFromDifferentPackageChanged")
    public void testFunctionFromDifferentPackageChanged() throws Exception {
        runTest("testData/incremental/multiModule/common/functionFromDifferentPackageChanged/");
    }

    @TestMetadata("inlineFunctionInlined")
    public void testInlineFunctionInlined() throws Exception {
        runTest("testData/incremental/multiModule/common/inlineFunctionInlined/");
    }

    @TestMetadata("inlineFunctionTwoPackageParts")
    public void testInlineFunctionTwoPackageParts() throws Exception {
        runTest("testData/incremental/multiModule/common/inlineFunctionTwoPackageParts/");
    }

    @TestMetadata("moveFileToAnotherModule")
    public void testMoveFileToAnotherModule() throws Exception {
        runTest("testData/incremental/multiModule/common/moveFileToAnotherModule/");
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        runTest("testData/incremental/multiModule/common/simple/");
    }

    @TestMetadata("simpleDependency")
    public void testSimpleDependency() throws Exception {
        runTest("testData/incremental/multiModule/common/simpleDependency/");
    }

    @TestMetadata("simpleDependencyErrorOnAccessToInternal1")
    public void testSimpleDependencyErrorOnAccessToInternal1() throws Exception {
        runTest("testData/incremental/multiModule/common/simpleDependencyErrorOnAccessToInternal1/");
    }

    @TestMetadata("simpleDependencyErrorOnAccessToInternal2")
    public void testSimpleDependencyErrorOnAccessToInternal2() throws Exception {
        runTest("testData/incremental/multiModule/common/simpleDependencyErrorOnAccessToInternal2/");
    }

    @TestMetadata("simpleDependencyUnchanged")
    public void testSimpleDependencyUnchanged() throws Exception {
        runTest("testData/incremental/multiModule/common/simpleDependencyUnchanged/");
    }

    @TestMetadata("transitiveDependency")
    public void testTransitiveDependency() throws Exception {
        runTest("testData/incremental/multiModule/common/transitiveDependency/");
    }

    @TestMetadata("transitiveInlining")
    public void testTransitiveInlining() throws Exception {
        runTest("testData/incremental/multiModule/common/transitiveInlining/");
    }

    @TestMetadata("twoDependants")
    public void testTwoDependants() throws Exception {
        runTest("testData/incremental/multiModule/common/twoDependants/");
    }
}
