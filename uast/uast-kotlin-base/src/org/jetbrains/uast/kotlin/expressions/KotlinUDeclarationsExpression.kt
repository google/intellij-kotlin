/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.uast

import com.intellij.psi.PsiElement
import org.jetbrains.uast.kotlin.KotlinAbstractUExpression

open class KotlinUDeclarationsExpression(
    override val psi: PsiElement?,
    givenParent: UElement?,
    val psiAnchor: PsiElement? = null,
) : KotlinAbstractUExpression(givenParent), UDeclarationsExpression {

    override val sourcePsi: PsiElement?
        get() = psiAnchor

    override fun convertParent(): UElement? =
        psiAnchor?.let { baseResolveProviderService.convertParent(this, it.parent) } ?: super.convertParent()

    constructor(uastParent: UElement?) : this(null, uastParent)

    override lateinit var declarations: List<UDeclaration>
}
