/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.pacelize.ide.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/parcelize/parcelize-ide/testData/checker")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ParcelizeCheckerTestGenerated extends AbstractParcelizeCheckerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("constructors.kt")
    public void testConstructors() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/constructors.kt");
    }

    @TestMetadata("customCreator.kt")
    public void testCustomCreator() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/customCreator.kt");
    }

    @TestMetadata("customParcelers.kt")
    public void testCustomParcelers() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/customParcelers.kt");
    }

    @TestMetadata("customWriteToParcel.kt")
    public void testCustomWriteToParcel() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/customWriteToParcel.kt");
    }

    @TestMetadata("delegate.kt")
    public void testDelegate() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/delegate.kt");
    }

    @TestMetadata("emptyPrimaryConstructor.kt")
    public void testEmptyPrimaryConstructor() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/emptyPrimaryConstructor.kt");
    }

    @TestMetadata("kt20062.kt")
    public void testKt20062() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/kt20062.kt");
    }

    @TestMetadata("modality.kt")
    public void testModality() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/modality.kt");
    }

    @TestMetadata("notMagicParcel.kt")
    public void testNotMagicParcel() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/notMagicParcel.kt");
    }

    @TestMetadata("properties.kt")
    public void testProperties() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/properties.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/simple.kt");
    }

    @TestMetadata("unsupportedType.kt")
    public void testUnsupportedType() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/unsupportedType.kt");
    }

    @TestMetadata("withoutParcelableSupertype.kt")
    public void testWithoutParcelableSupertype() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/withoutParcelableSupertype.kt");
    }

    @TestMetadata("wrongAnnotationTarget.kt")
    public void testWrongAnnotationTarget() throws Exception {
        runTest("plugins/parcelize/parcelize-ide/testData/checker/wrongAnnotationTarget.kt");
    }
}