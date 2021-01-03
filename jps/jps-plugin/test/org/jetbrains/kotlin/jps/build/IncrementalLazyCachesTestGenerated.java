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
public class IncrementalLazyCachesTestGenerated extends AbstractIncrementalLazyCachesTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/incremental/lazyKotlinCaches")
    public static class LazyKotlinCaches extends AbstractIncrementalLazyCachesTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("class")
        public void testClass() throws Exception {
            runTest("testData/incremental/lazyKotlinCaches/class/");
        }

        @TestMetadata("classInheritance")
        public void testClassInheritance() throws Exception {
            runTest("testData/incremental/lazyKotlinCaches/classInheritance/");
        }

        @TestMetadata("constant")
        public void testConstant() throws Exception {
            runTest("testData/incremental/lazyKotlinCaches/constant/");
        }

        @TestMetadata("function")
        public void testFunction() throws Exception {
            runTest("testData/incremental/lazyKotlinCaches/function/");
        }

        @TestMetadata("inlineFunctionWithUsage")
        public void testInlineFunctionWithUsage() throws Exception {
            runTest("testData/incremental/lazyKotlinCaches/inlineFunctionWithUsage/");
        }

        @TestMetadata("inlineFunctionWithoutUsage")
        public void testInlineFunctionWithoutUsage() throws Exception {
            runTest("testData/incremental/lazyKotlinCaches/inlineFunctionWithoutUsage/");
        }

        @TestMetadata("noKotlin")
        public void testNoKotlin() throws Exception {
            runTest("testData/incremental/lazyKotlinCaches/noKotlin/");
        }

        @TestMetadata("topLevelPropertyAccess")
        public void testTopLevelPropertyAccess() throws Exception {
            runTest("testData/incremental/lazyKotlinCaches/topLevelPropertyAccess/");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/incremental/changeIncrementalOption")
    public static class ChangeIncrementalOption extends AbstractIncrementalLazyCachesTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("incrementalOff")
        public void testIncrementalOff() throws Exception {
            runTest("testData/incremental/changeIncrementalOption/incrementalOff/");
        }

        @TestMetadata("incrementalOffOn")
        public void testIncrementalOffOn() throws Exception {
            runTest("testData/incremental/changeIncrementalOption/incrementalOffOn/");
        }

        @TestMetadata("incrementalOffOnJavaChanged")
        public void testIncrementalOffOnJavaChanged() throws Exception {
            runTest("testData/incremental/changeIncrementalOption/incrementalOffOnJavaChanged/");
        }

        @TestMetadata("incrementalOffOnJavaOnly")
        public void testIncrementalOffOnJavaOnly() throws Exception {
            runTest("testData/incremental/changeIncrementalOption/incrementalOffOnJavaOnly/");
        }
    }
}
