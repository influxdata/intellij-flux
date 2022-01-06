package com.influxdata.intellijflux.settings

import com.intellij.openapi.options.Configurable
import javax.swing.JComponent

class AppSettingsConfigurable : Configurable {
    private var settingsComponent: AppSettingsComponent? = null

    override fun getDisplayName(): String {
        return "Flux Language"
    }

    override fun getPreferredFocusedComponent(): JComponent {
        return settingsComponent!!.preferredFocusedComponent
    }

    override fun createComponent(): JComponent {
        settingsComponent = AppSettingsComponent()
        return settingsComponent!!.panel
    }

    override fun isModified(): Boolean {
        val settings = AppSettingsState.instance
        return settingsComponent?.lspPath != settings.lspPath
    }

    override fun apply() {
        val settings = AppSettingsState.instance
        settings.lspPath = settingsComponent?.lspPath.orEmpty()
    }

    override fun reset() {
        val settings = AppSettingsState.instance
        settingsComponent?.lspPath = settings.lspPath
    }

    override fun disposeUIResources() {
        settingsComponent = null
    }

}
