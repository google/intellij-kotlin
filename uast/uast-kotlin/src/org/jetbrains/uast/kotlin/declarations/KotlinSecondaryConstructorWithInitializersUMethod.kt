/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.uast.kotlin

import org.jetbrains.kotlin.asJava.elements.KtLightMethod
import org.jetbrains.kotlin.psi.KtCallElement
import org.jetbrains.kotlin.psi.KtClassOrObject
import org.jetbrains.uast.UElement
import org.jetbrains.uast.UExpression

class KotlinSecondaryConstructorWithInitializersUMethod(
    ktClass: KtClassOrObject?,
    psi: KtLightMethod,
    givenParent: UElement?
) : BaseKotlinSecondaryConstructorWithInitializersUMethod(ktClass, psi, givenParent), KotlinUMethodParametersProducer {

    override val uastParameters by lz { produceUastParameters(this, receiverTypeReference) }

    override fun buildDelegationCall(delegationCall: KtCallElement, uastParent: UElement): UExpression {
        return KotlinUFunctionCallExpression(delegationCall, uastParent)
    }
}
