/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.search;

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
@TestMetadata("testData/search/implementations")
public abstract class HLImplementationSearcherTestGenerated extends AbstractHLImplementationSearcherTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/search/implementations/classes")
    public static class Classes extends AbstractHLImplementationSearcherTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("classWithDeepHeiarchy.kt")
        public void testClassWithDeepHeiarchy() throws Exception {
            runTest("testData/search/implementations/classes/classWithDeepHeiarchy.kt");
        }

        @TestMetadata("classWithTypeParameters.kt")
        public void testClassWithTypeParameters() throws Exception {
            runTest("testData/search/implementations/classes/classWithTypeParameters.kt");
        }

        @TestMetadata("interfaces.kt")
        public void testInterfaces() throws Exception {
            runTest("testData/search/implementations/classes/interfaces.kt");
        }

        @TestMetadata("localClass.kt")
        public void testLocalClass() throws Exception {
            runTest("testData/search/implementations/classes/localClass.kt");
        }

        @TestMetadata("singleSuperClass.kt")
        public void testSingleSuperClass() throws Exception {
            runTest("testData/search/implementations/classes/singleSuperClass.kt");
        }

        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("testData/search/implementations/classes/incorrectCode")
        public static class IncorrectCode extends AbstractHLImplementationSearcherTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("extendClassWithoutSuperConstructorCall.kt")
            public void testExtendClassWithoutSuperConstructorCall() throws Exception {
                runTest("testData/search/implementations/classes/incorrectCode/extendClassWithoutSuperConstructorCall.kt");
            }
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/search/implementations/methods")
    public static class Methods extends AbstractHLImplementationSearcherTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("inLocalClass.kt")
        public void testInLocalClass() throws Exception {
            runTest("testData/search/implementations/methods/inLocalClass.kt");
        }

        @TestMetadata("singleSuperMethod.kt")
        public void testSingleSuperMethod() throws Exception {
            runTest("testData/search/implementations/methods/singleSuperMethod.kt");
        }

        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("testData/search/implementations/methods/incorrectCode")
        public static class IncorrectCode extends AbstractHLImplementationSearcherTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("overideMethodWithoutOverrideModifier.kt")
            public void testOverideMethodWithoutOverrideModifier() throws Exception {
                runTest("testData/search/implementations/methods/incorrectCode/overideMethodWithoutOverrideModifier.kt");
            }
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/search/implementations/properties")
    public static class Properties extends AbstractHLImplementationSearcherTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("inLocalClass.kt")
        public void testInLocalClass() throws Exception {
            runTest("testData/search/implementations/properties/inLocalClass.kt");
        }

        @TestMetadata("singleSuperProperty.kt")
        public void testSingleSuperProperty() throws Exception {
            runTest("testData/search/implementations/properties/singleSuperProperty.kt");
        }

        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("testData/search/implementations/properties/incorrectCode")
        public static class IncorrectCode extends AbstractHLImplementationSearcherTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("overidePropertyWithoutOverrideModifier.kt")
            public void testOveridePropertyWithoutOverrideModifier() throws Exception {
                runTest("testData/search/implementations/properties/incorrectCode/overidePropertyWithoutOverrideModifier.kt");
            }
        }
    }
}
