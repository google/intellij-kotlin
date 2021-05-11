/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.resolve;

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
@TestMetadata("testData/resolve/additionalLazyResolve")
public class AdditionalResolveDescriptorRendererTestGenerated extends AbstractAdditionalResolveDescriptorRendererTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("anonymousObjectInBaseConstructor.kt")
    public void testAnonymousObjectInBaseConstructor() throws Exception {
        runTest("testData/resolve/additionalLazyResolve/anonymousObjectInBaseConstructor.kt");
    }

    @TestMetadata("anonymousObjectInClassInitializer.kt")
    public void testAnonymousObjectInClassInitializer() throws Exception {
        runTest("testData/resolve/additionalLazyResolve/anonymousObjectInClassInitializer.kt");
    }

    @TestMetadata("anonymousObjectInClassParameterInitializer.kt")
    public void testAnonymousObjectInClassParameterInitializer() throws Exception {
        runTest("testData/resolve/additionalLazyResolve/anonymousObjectInClassParameterInitializer.kt");
    }

    @TestMetadata("functionLiteralInBaseConstructor.kt")
    public void testFunctionLiteralInBaseConstructor() throws Exception {
        runTest("testData/resolve/additionalLazyResolve/functionLiteralInBaseConstructor.kt");
    }

    @TestMetadata("localClassInClassInitializer.kt")
    public void testLocalClassInClassInitializer() throws Exception {
        runTest("testData/resolve/additionalLazyResolve/localClassInClassInitializer.kt");
    }

    @TestMetadata("localClassInClosureInClassParameterInitializer.kt")
    public void testLocalClassInClosureInClassParameterInitializer() throws Exception {
        runTest("testData/resolve/additionalLazyResolve/localClassInClosureInClassParameterInitializer.kt");
    }

    @TestMetadata("localObjectInClassInitializer.kt")
    public void testLocalObjectInClassInitializer() throws Exception {
        runTest("testData/resolve/additionalLazyResolve/localObjectInClassInitializer.kt");
    }

    @TestMetadata("localObjectInClosureInClassParameterInitializer.kt")
    public void testLocalObjectInClosureInClassParameterInitializer() throws Exception {
        runTest("testData/resolve/additionalLazyResolve/localObjectInClosureInClassParameterInitializer.kt");
    }
}
