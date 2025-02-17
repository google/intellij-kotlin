/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.intentions

import com.google.common.collect.Lists
import com.intellij.codeInsight.intention.IntentionAction
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.progress.Task
import com.intellij.openapi.progress.util.ProgressIndicatorBase
import com.intellij.openapi.util.Computable
import com.intellij.openapi.util.SystemInfo
import com.intellij.openapi.util.io.FileUtil
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.PsiFile
import com.intellij.refactoring.BaseRefactoringProcessor
import com.intellij.refactoring.util.CommonRefactoringUtil
import junit.framework.ComparisonFailure
import junit.framework.TestCase
import org.jetbrains.kotlin.formatter.FormatSettingsUtil
import org.jetbrains.kotlin.idea.test.*
import org.jetbrains.kotlin.idea.util.application.executeCommand
import org.jetbrains.kotlin.idea.util.application.executeWriteCommand
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.idea.test.InTextDirectivesUtils
import org.jetbrains.kotlin.idea.test.KotlinTestUtils
import org.junit.Assert
import java.io.File
import java.util.*
import java.util.concurrent.CompletableFuture
import java.util.concurrent.TimeUnit

abstract class AbstractIntentionTest : KotlinLightCodeInsightFixtureTestCase() {
    protected open fun intentionFileName(): String = ".intention"

    protected open fun afterFileNameSuffix(ktFilePath: File): String = ".after"

    protected open fun isApplicableDirectiveName(): String = "IS_APPLICABLE"

    protected open fun intentionTextDirectiveName(): String = "INTENTION_TEXT"

    @Throws(Exception::class)
    private fun createIntention(testDataFile: File): IntentionAction {
        val candidateFiles = Lists.newArrayList<File>()

        var current: File? = testDataFile.parentFile
        while (current != null) {
            val candidate = File(current, intentionFileName())
            if (candidate.exists()) {
                candidateFiles.add(candidate)
            }
            current = current.parentFile
        }

        if (candidateFiles.isEmpty()) {
            throw AssertionError(
                ".intention file is not found for " + testDataFile +
                        "\nAdd it to base directory of test data. It should contain fully-qualified name of intention class."
            )
        }
        if (candidateFiles.size > 1) {
            throw AssertionError(
                "Several .intention files are available for " + testDataFile +
                        "\nPlease remove some of them\n" + candidateFiles
            )
        }

        val className = FileUtil.loadFile(candidateFiles[0]).trim { it <= ' ' }
        return Class.forName(className).newInstance() as IntentionAction
    }

    @Throws(Exception::class)
    protected fun doTest(path: String) {
        val mainFile = File(path)
        val mainFileName = FileUtil.getNameWithoutExtension(mainFile)
        val intentionAction = createIntention(mainFile)
        val sourceFilePaths = ArrayList<String>()
        val parentDir = mainFile.parentFile
        var i = 1
        sourceFilePaths.add(mainFile.name)
        extraFileLoop@ while (true) {
            for (extension in EXTENSIONS) {
                val extraFile = File(parentDir, "$mainFileName.$i$extension")
                if (extraFile.exists()) {
                    sourceFilePaths.add(extraFile.name)
                    i++
                    continue@extraFileLoop
                }
            }
            break
        }

        val fileText = FileUtil.loadFile(mainFile, true)
        withCustomCompilerOptions(fileText, project, module) {
            val psiFiles = myFixture.configureByFiles(*sourceFilePaths.toTypedArray())
            val pathToFiles = mapOf(*(sourceFilePaths zip psiFiles).toTypedArray())

            ConfigLibraryUtil.configureLibrariesByDirective(module, fileText)
            configureCodeStyleAndRun(project, { FormatSettingsUtil.createConfigurator(fileText, it).configureSettings() }) {
                configureRegistryAndRun(fileText) {
                    try {
                        TestCase.assertTrue("\"<caret>\" is missing in file \"$mainFile\"", fileText.contains("<caret>"))

                        val minJavaVersion = InTextDirectivesUtils.findStringWithPrefixes(fileText, "// MIN_JAVA_VERSION: ")
                        if (minJavaVersion != null && !SystemInfo.isJavaVersionAtLeast(minJavaVersion)) return@configureRegistryAndRun

                        checkForErrorsBefore(fileText)

                        doTestFor(mainFile, pathToFiles, intentionAction, fileText)

                        checkForErrorsAfter(fileText)
                    } finally {
                        ConfigLibraryUtil.unconfigureLibrariesByDirective(module, fileText)
                    }
                }
            }
        }
    }

    protected open fun checkForErrorsAfter(fileText: String) {
        if (file is KtFile && !InTextDirectivesUtils.isDirectiveDefined(fileText, "// SKIP_ERRORS_AFTER")) {
            DirectiveBasedActionUtils.checkForUnexpectedErrors(file as KtFile)
        }
    }

    protected open fun checkForErrorsBefore(fileText: String) {
        if (file is KtFile && !InTextDirectivesUtils.isDirectiveDefined(fileText, "// SKIP_ERRORS_BEFORE")) {
            DirectiveBasedActionUtils.checkForUnexpectedErrors(file as KtFile)
        }
    }

    private fun <T> computeUnderProgressIndicatorAndWait(compute: () -> T): T {
        val result = CompletableFuture<T>()
        val progressIndicator = ProgressIndicatorBase()
        var exceptionDuringCompute: Throwable? = null
        try {
            val task = object : Task.Backgroundable(project, "isApplicable", false) {
                override fun run(indicator: ProgressIndicator) {
                    try {
                        result.complete(compute())
                    } catch(e: Throwable) {
                        exceptionDuringCompute = e
                    }
                }
            }
            ProgressManager.getInstance().runProcessWithProgressAsynchronously(task, progressIndicator)
            return result.get(10, TimeUnit.SECONDS)
        } finally {
            progressIndicator.cancel()
            exceptionDuringCompute?.let { throw it }
        }
    }

    @Throws(Exception::class)
    protected open fun doTestFor(mainFile: File, pathToFiles: Map<String, PsiFile>, intentionAction: IntentionAction, fileText: String) {
        val mainFilePath = mainFile.name
        val isApplicableString = InTextDirectivesUtils.findStringWithPrefixes(fileText, "// ${isApplicableDirectiveName()}: ")
        val isApplicableExpected = isApplicableString == null || isApplicableString == "true"

        val isApplicableOnPooled = computeUnderProgressIndicatorAndWait {
            ApplicationManager.getApplication().runReadAction(Computable { intentionAction.isAvailable(project, editor, file) })
        }

        val isApplicableOnEdt = intentionAction.isAvailable(project, editor, file)

        Assert.assertEquals(
            "There should not be any difference what thread isApplicable is called from",
            isApplicableOnPooled,
            isApplicableOnEdt
        )

        Assert.assertTrue(
            "isAvailable() for " + intentionAction.javaClass + " should return " + isApplicableExpected,
            isApplicableExpected == isApplicableOnEdt
        )

        val intentionTextString = InTextDirectivesUtils.findStringWithPrefixes(fileText, "// " + intentionTextDirectiveName() + ": ")

        if (intentionTextString != null) {
            TestCase.assertEquals("Intention text mismatch.", intentionTextString, intentionAction.text)
        }

        val shouldFailString = StringUtil.join(InTextDirectivesUtils.findListWithPrefixes(fileText, "// SHOULD_FAIL_WITH: "), ", ")

        try {
            if (isApplicableExpected) {
                val action = { intentionAction.invoke(project, editor, file) }
                if (intentionAction.startInWriteAction())
                    project.executeWriteCommand(intentionAction.text, action)
                else
                    project.executeCommand(intentionAction.text, null, action)

                // Don't bother checking if it should have failed.
                if (shouldFailString.isEmpty()) {
                    for ((filePath, value) in pathToFiles) {
                        val canonicalPathToExpectedFile = filePath + afterFileNameSuffix(mainFile)
                        if (filePath == mainFilePath) {
                            try {
                                myFixture.checkResultByFile(canonicalPathToExpectedFile)
                            } catch (e: ComparisonFailure) {
                                KotlinTestUtils
                                    .assertEqualsToFile(File(testDataPath, canonicalPathToExpectedFile), editor.document.text)
                            }

                        } else {
                            KotlinTestUtils.assertEqualsToFile(File(testDataPath, canonicalPathToExpectedFile), value.text)
                        }
                    }
                }
            }
            TestCase.assertEquals("Expected test to fail.", "", shouldFailString)
        } catch (e: BaseRefactoringProcessor.ConflictsInTestsException) {
            TestCase.assertEquals("Failure message mismatch.", shouldFailString, StringUtil.join(e.messages.sorted(), ", "))
        } catch (e: CommonRefactoringUtil.RefactoringErrorHintException) {
            TestCase.assertEquals("Failure message mismatch.", shouldFailString, e.message?.replace('\n', ' '))
        }
    }

    companion object {
        private val EXTENSIONS = arrayOf(".kt", ".kts", ".java", ".groovy")
    }
}

