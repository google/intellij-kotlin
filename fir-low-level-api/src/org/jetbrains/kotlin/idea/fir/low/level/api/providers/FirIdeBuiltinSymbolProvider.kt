/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.low.level.api.providers

import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.caches.*
import org.jetbrains.kotlin.fir.resolve.providers.FirSymbolProviderInternals
import org.jetbrains.kotlin.fir.resolve.providers.impl.FirBuiltinSymbolProvider
import org.jetbrains.kotlin.fir.scopes.KotlinScopeProvider
import org.jetbrains.kotlin.fir.symbols.impl.FirCallableSymbol
import org.jetbrains.kotlin.fir.symbols.impl.FirNamedFunctionSymbol
import org.jetbrains.kotlin.name.CallableId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name

class FirIdeBuiltinSymbolProvider(
    session: FirSession,
    kotlinScopeProvider: KotlinScopeProvider
) : FirBuiltinSymbolProvider(session, kotlinScopeProvider) {
    @OptIn(ExperimentalStdlibApi::class)
    private val functionsCache = session.firCachesFactory.createCache { callableId: CallableId ->
        buildList {
            getTopLevelFunctionSymbolsToByPackageFragments(this, callableId.packageName, callableId.callableName)
        }
    }

    @OptIn(FirSymbolProviderInternals::class)
    override fun getTopLevelCallableSymbolsTo(destination: MutableList<FirCallableSymbol<*>>, packageFqName: FqName, name: Name) {
        // valid until FirBuiltinSymbolProvider provide property symbols
        destination += functionsCache.getValue(CallableId(packageFqName, name))
    }

    @OptIn(FirSymbolProviderInternals::class)
    override fun getTopLevelFunctionSymbolsTo(destination: MutableList<FirNamedFunctionSymbol>, packageFqName: FqName, name: Name) {
        destination += functionsCache.getValue(CallableId(packageFqName, name))
    }
}