/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.frontend.api.components

import org.jetbrains.kotlin.idea.fir.executeOnPooledThreadInReadAction
import org.jetbrains.kotlin.idea.fir.test.framework.AbstractKtIdeaTestWithSingleTestFileTest
import org.jetbrains.kotlin.idea.fir.test.framework.expressionMarkerProvider
import org.jetbrains.kotlin.idea.frontend.api.analyse
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.test.services.TestModuleStructure
import org.jetbrains.kotlin.test.services.TestServices
import org.jetbrains.kotlin.test.services.assertions

abstract class AbstractExpectedExpressionTypeTest : AbstractKtIdeaTestWithSingleTestFileTest() {
    override fun doTestByFileStructure(ktFile: KtFile, moduleStructure: TestModuleStructure, testServices: TestServices) {
        val expressionAtCaret = testServices.expressionMarkerProvider.getElementOfTypAtCaret(ktFile) as KtExpression

        val actualExpectedTypeText: String? = executeOnPooledThreadInReadAction {
            analyse(ktFile) {
                expressionAtCaret.getExpectedType()?.asStringForDebugging()
            }
        }

        val actual = buildString {
            appendLine("expression: ${expressionAtCaret.text}")
            appendLine("expected type: $actualExpectedTypeText")
        }

        testServices.assertions.assertEqualsToFile(testDataFileSibling(".txt"), actual)
    }
}
