/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-completion/testData/basic/multifile")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class HighLevelMultiFileJvmBasicCompletionTestGenerated extends AbstractHighLevelMultiFileJvmBasicCompletionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInMultifile() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/idea-completion/testData/basic/multifile"), Pattern.compile("^([^\\.]+)$"), null, false);
    }

    @TestMetadata("CallableReferenceNotImported")
    public void testCallableReferenceNotImported() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/CallableReferenceNotImported/");
    }

    @TestMetadata("CallableReferenceNotImportedExtension")
    public void testCallableReferenceNotImportedExtension() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/CallableReferenceNotImportedExtension/");
    }

    @TestMetadata("CallableReferenceNotImportedExtension2")
    public void testCallableReferenceNotImportedExtension2() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/CallableReferenceNotImportedExtension2/");
    }

    @TestMetadata("CallablesInExcludedPackage")
    public void testCallablesInExcludedPackage() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/CallablesInExcludedPackage/");
    }

    @TestMetadata("ClassInExcludedPackage")
    public void testClassInExcludedPackage() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ClassInExcludedPackage/");
    }

    @TestMetadata("CompleteFunctionWithNoSpecifiedType")
    public void testCompleteFunctionWithNoSpecifiedType() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/CompleteFunctionWithNoSpecifiedType/");
    }

    @TestMetadata("CompleteImportedFunction")
    public void testCompleteImportedFunction() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/CompleteImportedFunction/");
    }

    @TestMetadata("CompletionOnImportedFunction")
    public void testCompletionOnImportedFunction() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/CompletionOnImportedFunction/");
    }

    @TestMetadata("DoNotCompleteWithConstraints")
    public void testDoNotCompleteWithConstraints() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/DoNotCompleteWithConstraints/");
    }

    @TestMetadata("EnhancementFlexibleTypes")
    public void testEnhancementFlexibleTypes() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/EnhancementFlexibleTypes/");
    }

    @TestMetadata("EntriesOfNotImportedEnumFromKotlin")
    public void testEntriesOfNotImportedEnumFromKotlin() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/EntriesOfNotImportedEnumFromKotlin/");
    }

    @TestMetadata("EnumEntry")
    public void testEnumEntry() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/EnumEntry/");
    }

    @TestMetadata("ExactMatchPreferImported")
    public void testExactMatchPreferImported() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ExactMatchPreferImported/");
    }

    @TestMetadata("ExcludedClass")
    public void testExcludedClass() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ExcludedClass/");
    }

    @TestMetadata("ExcludedJavaClass")
    public void testExcludedJavaClass() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ExcludedJavaClass/");
    }

    @TestMetadata("ExtensionFunction")
    public void testExtensionFunction() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ExtensionFunction/");
    }

    @TestMetadata("ExtensionFunctionOnImportedFunction")
    public void testExtensionFunctionOnImportedFunction() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ExtensionFunctionOnImportedFunction/");
    }

    @TestMetadata("ExtensionOnNullable")
    public void testExtensionOnNullable() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ExtensionOnNullable/");
    }

    @TestMetadata("ExtensionsAndGetPrefix")
    public void testExtensionsAndGetPrefix() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ExtensionsAndGetPrefix/");
    }

    @TestMetadata("ExtensionsForSmartCast")
    public void testExtensionsForSmartCast() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ExtensionsForSmartCast/");
    }

    @TestMetadata("FileRefInStringLiteral")
    public void testFileRefInStringLiteral() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/FileRefInStringLiteral/");
    }

    @TestMetadata("FileRefInStringLiteralNoPrefix")
    public void testFileRefInStringLiteralNoPrefix() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/FileRefInStringLiteralNoPrefix/");
    }

    @TestMetadata("GroovyClassNameCompletionFromDefaultPackage")
    public void testGroovyClassNameCompletionFromDefaultPackage() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/GroovyClassNameCompletionFromDefaultPackage/");
    }

    @TestMetadata("GroovyClassNameCompletionFromNonDefaultPackage")
    public void testGroovyClassNameCompletionFromNonDefaultPackage() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/GroovyClassNameCompletionFromNonDefaultPackage/");
    }

    @TestMetadata("HiddenDeclarations")
    public void testHiddenDeclarations() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/HiddenDeclarations/");
    }

    @TestMetadata("InImport")
    public void testInImport() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/InImport/");
    }

    @TestMetadata("InImportedFunctionLiteralParameter")
    public void testInImportedFunctionLiteralParameter() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/InImportedFunctionLiteralParameter/");
    }

    @TestMetadata("IncorrectGetters")
    public void testIncorrectGetters() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/IncorrectGetters/");
    }

    @TestMetadata("JavaCallableReference")
    public void testJavaCallableReference() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/JavaCallableReference/");
    }

    @TestMetadata("JavaInnerClasses")
    public void testJavaInnerClasses() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/JavaInnerClasses/");
    }

    @TestMetadata("KT12124")
    public void testKT12124() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/KT12124/");
    }

    @TestMetadata("KT9835")
    public void testKT9835() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/KT9835/");
    }

    @TestMetadata("MoreSpecificExtensionGeneric")
    public void testMoreSpecificExtensionGeneric() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/MoreSpecificExtensionGeneric/");
    }

    @TestMetadata("MoreSpecificExtensionInDifferentPackage")
    public void testMoreSpecificExtensionInDifferentPackage() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/MoreSpecificExtensionInDifferentPackage/");
    }

    @TestMetadata("MoreSpecificExtensionIsPrivate")
    public void testMoreSpecificExtensionIsPrivate() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/MoreSpecificExtensionIsPrivate/");
    }

    @TestMetadata("NoAutoInsertionOfNotImported")
    public void testNoAutoInsertionOfNotImported() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NoAutoInsertionOfNotImported/");
    }

    @TestMetadata("NoExtForOuterFromNested")
    public void testNoExtForOuterFromNested() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NoExtForOuterFromNested/");
    }

    @TestMetadata("NoExtensionMethodDuplication")
    public void testNoExtensionMethodDuplication() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NoExtensionMethodDuplication/");
    }

    @TestMetadata("NoGenericFunDuplication")
    public void testNoGenericFunDuplication() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NoGenericFunDuplication/");
    }

    @TestMetadata("NotImportedExtensionForImplicitReceiver")
    public void testNotImportedExtensionForImplicitReceiver() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionForImplicitReceiver/");
    }

    @TestMetadata("NotImportedExtensionFunction")
    public void testNotImportedExtensionFunction() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionFunction/");
    }

    @TestMetadata("NotImportedExtensionFunction2")
    public void testNotImportedExtensionFunction2() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionFunction2/");
    }

    @TestMetadata("NotImportedExtensionFunction3")
    public void testNotImportedExtensionFunction3() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionFunction3/");
    }

    @TestMetadata("NotImportedExtensionFunctionAndAlias")
    public void testNotImportedExtensionFunctionAndAlias() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionFunctionAndAlias/");
    }

    @TestMetadata("NotImportedExtensionProperty")
    public void testNotImportedExtensionProperty() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionProperty/");
    }

    @TestMetadata("NotImportedFunction")
    public void testNotImportedFunction() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NotImportedFunction/");
    }

    @TestMetadata("NotImportedInfixExtension")
    public void testNotImportedInfixExtension() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NotImportedInfixExtension/");
    }

    @TestMetadata("NotImportedJavaClass")
    public void testNotImportedJavaClass() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NotImportedJavaClass/");
    }

    @TestMetadata("NotImportedObject")
    public void testNotImportedObject() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NotImportedObject/");
    }

    @TestMetadata("NotImportedProperty")
    public void testNotImportedProperty() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/NotImportedProperty/");
    }

    @TestMetadata("ObjectInTypePosition")
    public void testObjectInTypePosition() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ObjectInTypePosition/");
    }

    @TestMetadata("ObjectMembers")
    public void testObjectMembers() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ObjectMembers/");
    }

    @TestMetadata("ParameterNameAndTypeForNotImportedAlias")
    public void testParameterNameAndTypeForNotImportedAlias() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ParameterNameAndTypeForNotImportedAlias/");
    }

    @TestMetadata("ParameterNameAndTypeNestedClasses")
    public void testParameterNameAndTypeNestedClasses() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/ParameterNameAndTypeNestedClasses/");
    }

    @TestMetadata("PreferMemberToExtension")
    public void testPreferMemberToExtension() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/PreferMemberToExtension/");
    }

    @TestMetadata("PreferMemberToGlobal")
    public void testPreferMemberToGlobal() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/PreferMemberToGlobal/");
    }

    @TestMetadata("PreferMoreSpecificExtension1")
    public void testPreferMoreSpecificExtension1() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/PreferMoreSpecificExtension1/");
    }

    @TestMetadata("PreferMoreSpecificExtension2")
    public void testPreferMoreSpecificExtension2() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/PreferMoreSpecificExtension2/");
    }

    @TestMetadata("PreferMoreSpecificExtension3")
    public void testPreferMoreSpecificExtension3() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/PreferMoreSpecificExtension3/");
    }

    @TestMetadata("PropertyKeysEmptyString")
    public void testPropertyKeysEmptyString() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/PropertyKeysEmptyString/");
    }

    @TestMetadata("PropertyKeysNoPrefix")
    public void testPropertyKeysNoPrefix() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/PropertyKeysNoPrefix/");
    }

    @TestMetadata("PropertyKeysWithPrefix")
    public void testPropertyKeysWithPrefix() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/PropertyKeysWithPrefix/");
    }

    @TestMetadata("StaticMembersOfNotImportedClassFromJava")
    public void testStaticMembersOfNotImportedClassFromJava() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/StaticMembersOfNotImportedClassFromJava/");
    }

    @TestMetadata("StaticMembersOfNotImportedClassFromKotlin")
    public void testStaticMembersOfNotImportedClassFromKotlin() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/StaticMembersOfNotImportedClassFromKotlin/");
    }

    @TestMetadata("StaticMembersOfNotImportedClassFromKotlinObject")
    public void testStaticMembersOfNotImportedClassFromKotlinObject() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/StaticMembersOfNotImportedClassFromKotlinObject/");
    }

    @TestMetadata("StaticMembersOfNotImportedClassNameConflict")
    public void testStaticMembersOfNotImportedClassNameConflict() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/StaticMembersOfNotImportedClassNameConflict/");
    }

    @TestMetadata("SuspensionPointInMonitor")
    public void testSuspensionPointInMonitor() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/SuspensionPointInMonitor/");
    }

    @TestMetadata("SyntheticExtensionDeprecated")
    public void testSyntheticExtensionDeprecated() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/SyntheticExtensionDeprecated/");
    }

    @TestMetadata("SyntheticExtensionForGenericClass")
    public void testSyntheticExtensionForGenericClass() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/SyntheticExtensionForGenericClass/");
    }

    @TestMetadata("SyntheticExtensionNonVoidSetter")
    public void testSyntheticExtensionNonVoidSetter() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/SyntheticExtensionNonVoidSetter/");
    }

    @TestMetadata("SyntheticPrimitiveJavaProperty")
    public void testSyntheticPrimitiveJavaProperty() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/SyntheticPrimitiveJavaProperty/");
    }

    @TestMetadata("TopLevelFunction")
    public void testTopLevelFunction() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/TopLevelFunction/");
    }

    @TestMetadata("TypeAliases")
    public void testTypeAliases() throws Exception {
        runTest("idea/idea-completion/testData/basic/multifile/TypeAliases/");
    }
}
