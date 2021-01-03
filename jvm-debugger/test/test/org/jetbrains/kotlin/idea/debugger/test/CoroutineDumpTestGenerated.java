/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.debugger.test;

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
@TestRoot("jvm-debugger/test")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/coroutines")
public class CoroutineDumpTestGenerated extends AbstractCoroutineDumpTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("noCoroutines.kt")
    public void testNoCoroutines() throws Exception {
        runTest("testData/coroutines/noCoroutines.kt");
    }

    @TestMetadata("threeCoroutines.kt")
    public void testThreeCoroutines() throws Exception {
        runTest("testData/coroutines/threeCoroutines.kt");
    }

    @TestMetadata("twoDumps.kt")
    public void testTwoDumps() throws Exception {
        runTest("testData/coroutines/twoDumps.kt");
    }
}
