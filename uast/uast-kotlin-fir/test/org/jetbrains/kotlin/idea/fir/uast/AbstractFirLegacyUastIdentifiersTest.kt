/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.uast

import org.jetbrains.uast.UFile
import org.jetbrains.uast.test.common.kotlin.LegacyUastIdentifiersTestBase
import java.nio.file.Paths
import kotlin.io.path.ExperimentalPathApi
import kotlin.io.path.absolute

abstract class AbstractFirLegacyUastIdentifiersTest : AbstractFirUastIdentifiersTest(), LegacyUastIdentifiersTestBase {
    @OptIn(ExperimentalPathApi::class)
    private val whitelist : Set<String> = setOf(
        // TODO: Also failed with FE1.0 UAST
        "uast-kotlin/testData/DestructuringDeclaration.kt",
        "uast-kotlin/testData/LambdaReturn.kt",
        "uast-kotlin/testData/WhenAndDestructing.kt",
        // TODO: incorrect parent chain for annotations?
        "uast-kotlin/testData/ParameterPropertyWithAnnotation.kt",
        "uast-kotlin/testData/PropertyWithAnnotation.kt",
        "uast-kotlin/testData/SimpleAnnotated.kt",
        "uast-kotlin/testData/ReceiverFun.kt",
        // TODO: remaining property accessor conversion in KotlinUSimpleReferenceExpression
        "uast-kotlin/testData/PropertyInitializer.kt",
    ).mapTo(mutableSetOf()) { Paths.get("..").resolve(it).absolute().normalize().toString() }

    override fun isExpectedToFail(filePath: String): Boolean {
        return filePath in whitelist
    }

    override fun check(filePath: String, file: UFile) {
        super<LegacyUastIdentifiersTestBase>.check(filePath, file)
    }
}
