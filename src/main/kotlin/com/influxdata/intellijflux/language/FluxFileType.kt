package com.influxdata.intellijflux.language

import com.intellij.openapi.fileTypes.LanguageFileType

object FluxFileType : LanguageFileType(FluxLanguage.INSTANCE) {
    override fun getName() = "Flux file"

    override fun getDescription() = "Flux language file"

    override fun getDefaultExtension() = "flux"

    override fun getIcon() = FluxIcons.file
}
