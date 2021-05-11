/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.low.level.api.file.structure;

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
@TestMetadata("testdata/fileStructure")
public class FileStructureTestGenerated extends AbstractFileStructureTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("class.kt")
    public void testClass() throws Exception {
        runTest("testdata/fileStructure/class.kt");
    }

    @TestMetadata("classMemberProperty.kt")
    public void testClassMemberProperty() throws Exception {
        runTest("testdata/fileStructure/classMemberProperty.kt");
    }

    @TestMetadata("declarationsInPropertyInit.kt")
    public void testDeclarationsInPropertyInit() throws Exception {
        runTest("testdata/fileStructure/declarationsInPropertyInit.kt");
    }

    @TestMetadata("enumClass.kt")
    public void testEnumClass() throws Exception {
        runTest("testdata/fileStructure/enumClass.kt");
    }

    @TestMetadata("enumClassWithBody.kt")
    public void testEnumClassWithBody() throws Exception {
        runTest("testdata/fileStructure/enumClassWithBody.kt");
    }

    @TestMetadata("initBlock.kt")
    public void testInitBlock() throws Exception {
        runTest("testdata/fileStructure/initBlock.kt");
    }

    @TestMetadata("localClass.kt")
    public void testLocalClass() throws Exception {
        runTest("testdata/fileStructure/localClass.kt");
    }

    @TestMetadata("localFun.kt")
    public void testLocalFun() throws Exception {
        runTest("testdata/fileStructure/localFun.kt");
    }

    @TestMetadata("localProperty.kt")
    public void testLocalProperty() throws Exception {
        runTest("testdata/fileStructure/localProperty.kt");
    }

    @TestMetadata("memberTypeAlias.kt")
    public void testMemberTypeAlias() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/fileStructure/memberTypeAlias.kt");
    }

    @TestMetadata("nestedClasses.kt")
    public void testNestedClasses() throws Exception {
        runTest("testdata/fileStructure/nestedClasses.kt");
    }

    @TestMetadata("propertyAccessors.kt")
    public void testPropertyAccessors() throws Exception {
        runTest("testdata/fileStructure/propertyAccessors.kt");
    }

    @TestMetadata("topLevelExpressionBodyFunWithType.kt")
    public void testTopLevelExpressionBodyFunWithType() throws Exception {
        runTest("testdata/fileStructure/topLevelExpressionBodyFunWithType.kt");
    }

    @TestMetadata("topLevelExpressionBodyFunWithoutType.kt")
    public void testTopLevelExpressionBodyFunWithoutType() throws Exception {
        runTest("testdata/fileStructure/topLevelExpressionBodyFunWithoutType.kt");
    }

    @TestMetadata("topLevelFunWithType.kt")
    public void testTopLevelFunWithType() throws Exception {
        runTest("testdata/fileStructure/topLevelFunWithType.kt");
    }

    @TestMetadata("topLevelProperty.kt")
    public void testTopLevelProperty() throws Exception {
        runTest("testdata/fileStructure/topLevelProperty.kt");
    }

    @TestMetadata("topLevelUnitFun.kt")
    public void testTopLevelUnitFun() throws Exception {
        runTest("testdata/fileStructure/topLevelUnitFun.kt");
    }

    @TestMetadata("typeAlias.kt")
    public void testTypeAlias() throws Exception {
        runTest("testdata/fileStructure/typeAlias.kt");
    }
}
