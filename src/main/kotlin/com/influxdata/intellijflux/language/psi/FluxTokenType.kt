package com.influxdata.intellijflux.language.psi

import com.influxdata.intellijflux.language.FluxLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls


class FluxTokenType(debugName: @NonNls String) :
    IElementType(debugName, FluxLanguage.INSTANCE) {
    override fun toString(): String {
        return "FluxTokenType." + super.toString()
    }
}