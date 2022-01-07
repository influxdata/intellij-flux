package com.influxdata.intellijflux

import com.intellij.openapi.application.PreloadingActivity
import com.intellij.openapi.progress.ProgressIndicator
import org.wso2.lsp4intellij.IntellijLanguageClient
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.RawCommandServerDefinition

class FluxPreloadingActivity : PreloadingActivity() {
    override fun preload(indicator: ProgressIndicator) {
        IntellijLanguageClient.addServerDefinition(
            RawCommandServerDefinition(
                "flux",
                // FIXME: read from settings instead of hard-coding (requiring the bin to be in PATH).
                //  A wrinkle is we'd need a way to re-register the server
                //  definition when the settings change.
                arrayOf("flux-lsp", "--log-file", ".flux-lsp.log"),
            )
        )
    }
}
