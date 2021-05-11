/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight.hints;

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
@TestMetadata("testData/codeInsight/hints/types")
public class KotlinReferenceTypeHintsProviderTestGenerated extends AbstractKotlinReferenceTypeHintsProviderTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("AnonymousObject.kt")
    public void testAnonymousObject() throws Exception {
        runTest("testData/codeInsight/hints/types/AnonymousObject.kt");
    }

    @TestMetadata("AnonymousObjectNoBaseType.kt")
    public void testAnonymousObjectNoBaseType() throws Exception {
        runTest("testData/codeInsight/hints/types/AnonymousObjectNoBaseType.kt");
    }

    @TestMetadata("ConstInitializerType.kt")
    public void testConstInitializerType() throws Exception {
        runTest("testData/codeInsight/hints/types/ConstInitializerType.kt");
    }

    @TestMetadata("ConstructorWithExplicitTypeParametersType.kt")
    public void testConstructorWithExplicitTypeParametersType() throws Exception {
        runTest("testData/codeInsight/hints/types/ConstructorWithExplicitTypeParametersType.kt");
    }

    @TestMetadata("ConstructorWithoutExplicitTypeParametersType.kt")
    public void testConstructorWithoutExplicitTypeParametersType() throws Exception {
        runTest("testData/codeInsight/hints/types/ConstructorWithoutExplicitTypeParametersType.kt");
    }

    @TestMetadata("ConstructorWithoutTypeParametersType.kt")
    public void testConstructorWithoutTypeParametersType() throws Exception {
        runTest("testData/codeInsight/hints/types/ConstructorWithoutTypeParametersType.kt");
    }

    @TestMetadata("DestructingType.kt")
    public void testDestructingType() throws Exception {
        runTest("testData/codeInsight/hints/types/DestructingType.kt");
    }

    @TestMetadata("Destructuring.kt")
    public void testDestructuring() throws Exception {
        runTest("testData/codeInsight/hints/types/Destructuring.kt");
    }

    @TestMetadata("EnumEntry.kt")
    public void testEnumEntry() throws Exception {
        runTest("testData/codeInsight/hints/types/EnumEntry.kt");
    }

    @TestMetadata("EnumEntryCompanion.kt")
    public void testEnumEntryCompanion() throws Exception {
        runTest("testData/codeInsight/hints/types/EnumEntryCompanion.kt");
    }

    @TestMetadata("EnumEntryLikeFunction.kt")
    public void testEnumEntryLikeFunction() throws Exception {
        runTest("testData/codeInsight/hints/types/EnumEntryLikeFunction.kt");
    }

    @TestMetadata("EnumEntryLikeProperty.kt")
    public void testEnumEntryLikeProperty() throws Exception {
        runTest("testData/codeInsight/hints/types/EnumEntryLikeProperty.kt");
    }

    @TestMetadata("EnumEntryQualified.kt")
    public void testEnumEntryQualified() throws Exception {
        runTest("testData/codeInsight/hints/types/EnumEntryQualified.kt");
    }

    @TestMetadata("ErrorType.kt")
    public void testErrorType() throws Exception {
        runTest("testData/codeInsight/hints/types/ErrorType.kt");
    }

    @TestMetadata("ExpandedTypeAlias.kt")
    public void testExpandedTypeAlias() throws Exception {
        runTest("testData/codeInsight/hints/types/ExpandedTypeAlias.kt");
    }

    @TestMetadata("ImportedEnumEntry.kt")
    public void testImportedEnumEntry() throws Exception {
        runTest("testData/codeInsight/hints/types/ImportedEnumEntry.kt");
    }

    @TestMetadata("LocalVariable.kt")
    public void testLocalVariable() throws Exception {
        runTest("testData/codeInsight/hints/types/LocalVariable.kt");
    }

    @TestMetadata("LoopParameter.kt")
    public void testLoopParameter() throws Exception {
        runTest("testData/codeInsight/hints/types/LoopParameter.kt");
    }

    @TestMetadata("LoopParameterWithExplicitType.kt")
    public void testLoopParameterWithExplicitType() throws Exception {
        runTest("testData/codeInsight/hints/types/LoopParameterWithExplicitType.kt");
    }

    @TestMetadata("NestedClassImports.kt")
    public void testNestedClassImports() throws Exception {
        runTest("testData/codeInsight/hints/types/NestedClassImports.kt");
    }

    @TestMetadata("NestedClassWithoutImport.kt")
    public void testNestedClassWithoutImport() throws Exception {
        runTest("testData/codeInsight/hints/types/NestedClassWithoutImport.kt");
    }

    @TestMetadata("ParameterType.kt")
    public void testParameterType() throws Exception {
        runTest("testData/codeInsight/hints/types/ParameterType.kt");
    }

    @TestMetadata("PropertyType.kt")
    public void testPropertyType() throws Exception {
        runTest("testData/codeInsight/hints/types/PropertyType.kt");
    }

    @TestMetadata("QualifiedReferences.kt")
    public void testQualifiedReferences() throws Exception {
        runTest("testData/codeInsight/hints/types/QualifiedReferences.kt");
    }

    @TestMetadata("SAMConstructor.kt")
    public void testSAMConstructor() throws Exception {
        runTest("testData/codeInsight/hints/types/SAMConstructor.kt");
    }

    @TestMetadata("TypeInCompanion.kt")
    public void testTypeInCompanion() throws Exception {
        runTest("testData/codeInsight/hints/types/TypeInCompanion.kt");
    }

    @TestMetadata("TypeInNonDefaultCompanion.kt")
    public void testTypeInNonDefaultCompanion() throws Exception {
        runTest("testData/codeInsight/hints/types/TypeInNonDefaultCompanion.kt");
    }

    @TestMetadata("UnaryConstInitializerType.kt")
    public void testUnaryConstInitializerType() throws Exception {
        runTest("testData/codeInsight/hints/types/UnaryConstInitializerType.kt");
    }

    @TestMetadata("UnitLocalVariable.kt")
    public void testUnitLocalVariable() throws Exception {
        runTest("testData/codeInsight/hints/types/UnitLocalVariable.kt");
    }

    @TestMetadata("UnitLocalVariable2.kt")
    public void testUnitLocalVariable2() throws Exception {
        runTest("testData/codeInsight/hints/types/UnitLocalVariable2.kt");
    }

    @TestMetadata("UnitLocalVariable3.kt")
    public void testUnitLocalVariable3() throws Exception {
        runTest("testData/codeInsight/hints/types/UnitLocalVariable3.kt");
    }
}
