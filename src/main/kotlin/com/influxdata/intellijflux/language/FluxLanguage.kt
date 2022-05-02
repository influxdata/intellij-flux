package com.influxdata.intellijflux.language

import com.intellij.lang.Language

class FluxLanguage : Language("Flux") {
    companion object {
        val INSTANCE = FluxLanguage()
    }
}
