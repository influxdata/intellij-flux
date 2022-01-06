package com.influxdata.intellijflux

import com.github.gtache.lsp.client.languageserver.serverdefinition.ExeLanguageServerDefinition
import com.github.gtache.lsp.client.languageserver.serverdefinition.LanguageServerDefinition
import com.intellij.openapi.application.PreloadingActivity
import com.intellij.openapi.progress.ProgressIndicator

class FluxPreloadingActivity : PreloadingActivity() {
    override fun preload(indicator: ProgressIndicator) {
        LanguageServerDefinition.register(
            ExeLanguageServerDefinition(
                "flux",
                // FIXME: read from settings instead of hard-coding (requiring the bin to be in PATH).
                //  A wrinkle is we'd need a way to re-register the server
                //  definition when the settings change.
                "flux-lsp",
                arrayOf()
            )
        )
    }
}
