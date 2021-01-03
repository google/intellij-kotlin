/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.editor;

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
@TestRoot("idea")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/editor/enterHandler/multilineString")
public abstract class MultiLineStringIndentTestGenerated extends AbstractMultiLineStringIndentTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/editor/enterHandler/multilineString/spaces")
    public static class Spaces extends AbstractMultiLineStringIndentTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("dontAddMarginCharWhenMultilineWithoutMargins.kt")
        public void testDontAddMarginCharWhenMultilineWithoutMargins() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/dontAddMarginCharWhenMultilineWithoutMargins.kt");
        }

        @TestMetadata("dontAddMarginWhenItIsUnused.kt")
        public void testDontAddMarginWhenItIsUnused() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/dontAddMarginWhenItIsUnused.kt");
        }

        @TestMetadata("dontAddMarginWhenItIsUnusedWithEmptyPrevious.kt")
        public void testDontAddMarginWhenItIsUnusedWithEmptyPrevious() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/dontAddMarginWhenItIsUnusedWithEmptyPrevious.kt");
        }

        @TestMetadata("dontAddTrimCallWhenAlreadyMultiline.kt")
        public void testDontAddTrimCallWhenAlreadyMultiline() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/dontAddTrimCallWhenAlreadyMultiline.kt");
        }

        @TestMetadata("dontAddTrimCallWhenAlreadyMultilineFirstLine.kt")
        public void testDontAddTrimCallWhenAlreadyMultilineFirstLine() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/dontAddTrimCallWhenAlreadyMultilineFirstLine.kt");
        }

        @TestMetadata("dontInsertTrimMargin1.kt")
        public void testDontInsertTrimMargin1() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/dontInsertTrimMargin1.kt");
        }

        @TestMetadata("dontInsertTrimMargin2.kt")
        public void testDontInsertTrimMargin2() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/dontInsertTrimMargin2.kt");
        }

        @TestMetadata("dontInsertTrimMargin3.kt")
        public void testDontInsertTrimMargin3() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/dontInsertTrimMargin3.kt");
        }

        @TestMetadata("dontInsertTrimMargin4.kt")
        public void testDontInsertTrimMargin4() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/dontInsertTrimMargin4.kt");
        }

        @TestMetadata("enterAfterOpenningBrace.kt")
        public void testEnterAfterOpenningBrace() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterAfterOpenningBrace.kt");
        }

        @TestMetadata("enterBeforeLongEntryOneLine.kt")
        public void testEnterBeforeLongEntryOneLine() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterBeforeLongEntryOneLine.kt");
        }

        @TestMetadata("enterBeforeMarginChar.kt")
        public void testEnterBeforeMarginChar() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterBeforeMarginChar.kt");
        }

        @TestMetadata("enterBeforeShortEntryOneLine.kt")
        public void testEnterBeforeShortEntryOneLine() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterBeforeShortEntryOneLine.kt");
        }

        @TestMetadata("enterInInfixMargin.kt")
        public void testEnterInInfixMargin() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterInInfixMargin.kt");
        }

        @TestMetadata("enterInInjectedFragment.kt")
        public void testEnterInInjectedFragment() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterInInjectedFragment.kt");
        }

        @TestMetadata("enterInLineWithMarginOnNotMargedLine.kt")
        public void testEnterInLineWithMarginOnNotMargedLine() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterInLineWithMarginOnNotMargedLine.kt");
        }

        @TestMetadata("enterInMethodCallMargin.kt")
        public void testEnterInMethodCallMargin() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterInMethodCallMargin.kt");
        }

        @TestMetadata("enterInOneLineAfterSpaces.kt")
        public void testEnterInOneLineAfterSpaces() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterInOneLineAfterSpaces.kt");
        }

        @TestMetadata("enterInTwoLinesNoMarginCall.kt")
        public void testEnterInTwoLinesNoMarginCall() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterInTwoLinesNoMarginCall.kt");
        }

        @TestMetadata("enterInsideBraces.kt")
        public void testEnterInsideBraces() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterInsideBraces.kt");
        }

        @TestMetadata("enterInsideBraces1.kt")
        public void testEnterInsideBraces1() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterInsideBraces1.kt");
        }

        @TestMetadata("enterInsideBraces2.kt")
        public void testEnterInsideBraces2() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterInsideBraces2.kt");
        }

        @TestMetadata("enterInsideTextMargin.kt")
        public void testEnterInsideTextMargin() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterInsideTextMargin.kt");
        }

        @TestMetadata("enterMLSimpleMargin.kt")
        public void testEnterMLSimpleMargin() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterMLSimpleMargin.kt");
        }

        @TestMetadata("enterMLStartOnSameLineMargin.kt")
        public void testEnterMLStartOnSameLineMargin() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterMLStartOnSameLineMargin.kt");
        }

        @TestMetadata("enterOnFirstLineWithPresentTrimMargin.kt")
        public void testEnterOnFirstLineWithPresentTrimMargin() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterOnFirstLineWithPresentTrimMargin.kt");
        }

        @TestMetadata("enterOnFirstLineWithPresentTrimMarginAndLine.kt")
        public void testEnterOnFirstLineWithPresentTrimMarginAndLine() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterOnFirstLineWithPresentTrimMarginAndLine.kt");
        }

        @TestMetadata("enterOnFirstNonEmptyLineWithPresentTrimMargin.kt")
        public void testEnterOnFirstNonEmptyLineWithPresentTrimMargin() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterOnFirstNonEmptyLineWithPresentTrimMargin.kt");
        }

        @TestMetadata("enterOnNewLine.kt")
        public void testEnterOnNewLine() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterOnNewLine.kt");
        }

        @TestMetadata("enterSimple.kt")
        public void testEnterSimple() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterSimple.kt");
        }

        @TestMetadata("enterWithTextMargin.kt")
        public void testEnterWithTextMargin() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterWithTextMargin.kt");
        }

        @TestMetadata("enterWithTextOnNewLineMargin.kt")
        public void testEnterWithTextOnNewLineMargin() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/enterWithTextOnNewLineMargin.kt");
        }

        @TestMetadata("insertCustomMargin.kt")
        public void testInsertCustomMargin() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/insertCustomMargin.kt");
        }

        @TestMetadata("insertCustomMarginInLineStart.kt")
        public void testInsertCustomMarginInLineStart() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/insertCustomMarginInLineStart.kt");
        }

        @TestMetadata("insertDefaultMargin.kt")
        public void testInsertDefaultMargin() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/insertDefaultMargin.kt");
        }

        @TestMetadata("noTrimIndentInAnnotations.kt")
        public void testNoTrimIndentInAnnotations() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/noTrimIndentInAnnotations.kt");
        }

        @TestMetadata("noTrimIndentInConst.kt")
        public void testNoTrimIndentInConst() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/noTrimIndentInConst.kt");
        }

        @TestMetadata("restoreIndentFromEmptyLine.kt")
        public void testRestoreIndentFromEmptyLine() throws Exception {
            runTest("testData/editor/enterHandler/multilineString/spaces/restoreIndentFromEmptyLine.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/editor/enterHandler/multilineString/withTabs")
    public abstract static class WithTabs extends AbstractMultiLineStringIndentTest {
        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("testData/editor/enterHandler/multilineString/withTabs/tabs2")
        public static class Tabs2 extends AbstractMultiLineStringIndentTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("dontInsertTrimMarginCall.kt")
            public void testDontInsertTrimMarginCall() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs2/dontInsertTrimMarginCall.kt");
            }

            @TestMetadata("enterInMethodCallMargin.kt")
            public void testEnterInMethodCallMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs2/enterInMethodCallMargin.kt");
            }

            @TestMetadata("enterInTwoLinesNoMarginCall.kt")
            public void testEnterInTwoLinesNoMarginCall() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs2/enterInTwoLinesNoMarginCall.kt");
            }

            @TestMetadata("enterInsideBraces.kt")
            public void testEnterInsideBraces() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs2/enterInsideBraces.kt");
            }

            @TestMetadata("enterInsideText.kt")
            public void testEnterInsideText() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs2/enterInsideText.kt");
            }

            @TestMetadata("enterMLSimpleMargin.kt")
            public void testEnterMLSimpleMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs2/enterMLSimpleMargin.kt");
            }

            @TestMetadata("enterMLStartOnSameLineMargin.kt")
            public void testEnterMLStartOnSameLineMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs2/enterMLStartOnSameLineMargin.kt");
            }

            @TestMetadata("enterOnNewLineMargin.kt")
            public void testEnterOnNewLineMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs2/enterOnNewLineMargin.kt");
            }

            @TestMetadata("enterSimpleMargin.kt")
            public void testEnterSimpleMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs2/enterSimpleMargin.kt");
            }

            @TestMetadata("enterWithTextMargin.kt")
            public void testEnterWithTextMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs2/enterWithTextMargin.kt");
            }

            @TestMetadata("enterWithTextOnNewLineMargin.kt")
            public void testEnterWithTextOnNewLineMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs2/enterWithTextOnNewLineMargin.kt");
            }
        }

        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("testData/editor/enterHandler/multilineString/withTabs/tabs4")
        public static class Tabs4 extends AbstractMultiLineStringIndentTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("dontInsertTrimMarginCall.kt")
            public void testDontInsertTrimMarginCall() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs4/dontInsertTrimMarginCall.kt");
            }

            @TestMetadata("enterInMethodCallMargin.kt")
            public void testEnterInMethodCallMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs4/enterInMethodCallMargin.kt");
            }

            @TestMetadata("enterInsideBraces.kt")
            public void testEnterInsideBraces() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs4/enterInsideBraces.kt");
            }

            @TestMetadata("enterInsideText.kt")
            public void testEnterInsideText() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs4/enterInsideText.kt");
            }

            @TestMetadata("enterMLSimpleMargin.kt")
            public void testEnterMLSimpleMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs4/enterMLSimpleMargin.kt");
            }

            @TestMetadata("enterMLStartOnSameLineMargin.kt")
            public void testEnterMLStartOnSameLineMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs4/enterMLStartOnSameLineMargin.kt");
            }

            @TestMetadata("enterOnNewLineMargin.kt")
            public void testEnterOnNewLineMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs4/enterOnNewLineMargin.kt");
            }

            @TestMetadata("enterSimpleMargin.kt")
            public void testEnterSimpleMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs4/enterSimpleMargin.kt");
            }

            @TestMetadata("enterWithTabsAfterMarginChar.kt")
            public void testEnterWithTabsAfterMarginChar() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs4/enterWithTabsAfterMarginChar.kt");
            }

            @TestMetadata("enterWithTextMargin.kt")
            public void testEnterWithTextMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs4/enterWithTextMargin.kt");
            }

            @TestMetadata("enterWithTextOnNewLineMargin.kt")
            public void testEnterWithTextOnNewLineMargin() throws Exception {
                runTest("testData/editor/enterHandler/multilineString/withTabs/tabs4/enterWithTextOnNewLineMargin.kt");
            }
        }
    }
}
