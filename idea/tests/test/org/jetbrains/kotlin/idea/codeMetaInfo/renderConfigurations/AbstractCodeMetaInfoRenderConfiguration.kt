/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeMetaInfo.renderConfigurations

import com.intellij.lang.annotation.HighlightSeverity
import org.jetbrains.kotlin.codeMetaInfo.model.CodeMetaInfo
import org.jetbrains.kotlin.codeMetaInfo.renderConfigurations.AbstractCodeMetaInfoRenderConfiguration
import org.jetbrains.kotlin.idea.codeMetaInfo.models.HighlightingCodeMetaInfo
import org.jetbrains.kotlin.idea.codeMetaInfo.models.LineMarkerCodeMetaInfo


open class LineMarkerRenderConfiguration(var renderDescription: Boolean = true) : AbstractCodeMetaInfoRenderConfiguration() {
    override fun asString(codeMetaInfo: CodeMetaInfo): String {
        if (codeMetaInfo !is LineMarkerCodeMetaInfo) return ""
        return getTag() + getPlatformsString(codeMetaInfo) + getParamsString(codeMetaInfo)
    }

    fun getTag() = "LINE_MARKER"

    private fun getParamsString(lineMarkerCodeMetaInfo: LineMarkerCodeMetaInfo): String {
        if (!renderParams) return ""
        val params = mutableListOf<String>()

        if (renderDescription && lineMarkerCodeMetaInfo.lineMarker.lineMarkerTooltip != null) {
            params.add("descr='${sanitizeLineMarkerTooltip(lineMarkerCodeMetaInfo.lineMarker.lineMarkerTooltip)}'")
        }

        params.add(getAdditionalParams(lineMarkerCodeMetaInfo))

        val paramsString = params.filter { it.isNotEmpty() }.joinToString("; ")
        return if (paramsString.isEmpty()) "" else "(\"$paramsString\")"
    }

    protected fun getPlatformsString(codeMetaInfo: CodeMetaInfo): String {
        if (codeMetaInfo.attributes.isEmpty()) return ""
        return "{${codeMetaInfo.attributes.joinToString(";")}}"
    }
}

open class HighlightingRenderConfiguration(
    val descriptionRenderingOption: DescriptionRenderingOption = DescriptionRenderingOption.ALWAYS,
    val renderTextAttributesKey: Boolean = true,
    val renderSeverityOption: SeverityRenderingOption = SeverityRenderingOption.ALWAYS,
) : AbstractCodeMetaInfoRenderConfiguration() {

    enum class DescriptionRenderingOption {
        ALWAYS, NEVER, IF_NOT_NULL
    }

    /**
     * Allows to customize rendering of highlightings' severities if some severities are not interesting
     * or considered "default". Use predefined values for convenience.
     */
    fun interface SeverityRenderingOption {
        fun shouldRender(severity: HighlightSeverity): Boolean

        companion object {
            val ALWAYS = SeverityRenderingOption { true }
            val NEVER = SeverityRenderingOption { false }

            val ONLY_NON_INFO = SeverityRenderingOption { it != HighlightSeverity.INFORMATION }
        }
    }

    override fun asString(codeMetaInfo: CodeMetaInfo): String {
        if (codeMetaInfo !is HighlightingCodeMetaInfo) return ""
        return getTag() + getParamsString(codeMetaInfo)
    }

    fun getTag() = "HIGHLIGHTING"

    private fun getParamsString(highlightingCodeMetaInfo: HighlightingCodeMetaInfo): String {
        if (!renderParams) return ""

        val params = mutableListOf<String>()

        if (renderSeverityOption.shouldRender(highlightingCodeMetaInfo.highlightingInfo.severity)) {
            params.add("severity='${highlightingCodeMetaInfo.highlightingInfo.severity}'")
        }

        when (descriptionRenderingOption) {
            DescriptionRenderingOption.NEVER -> {}

            DescriptionRenderingOption.ALWAYS, DescriptionRenderingOption.IF_NOT_NULL -> {
                val description = highlightingCodeMetaInfo.highlightingInfo.description

                if (description != null) {
                    params.add("descr='${sanitizeLineBreaks(description)}'")
                } else if (descriptionRenderingOption == DescriptionRenderingOption.ALWAYS) {
                    params.add("descr='null'")
                }
            }
        }

        if (renderTextAttributesKey) {
            params.add("textAttributesKey='${highlightingCodeMetaInfo.highlightingInfo.forcedTextAttributesKey}'")
        }

        params.add(getAdditionalParams(highlightingCodeMetaInfo))
        val paramsString = params.filter { it.isNotEmpty() }.joinToString("; ")

        return if (paramsString.isEmpty()) "" else "(\"$paramsString\")"
    }
}
