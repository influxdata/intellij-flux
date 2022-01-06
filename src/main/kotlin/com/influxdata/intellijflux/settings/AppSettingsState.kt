package com.influxdata.intellijflux.settings

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable


@State(
    name = "com.influxdata.intellijflux.settings.AppSettingsState",
    storages = [Storage("FluxPluginAppSettings.xml")]
)
class AppSettingsState : PersistentStateComponent<AppSettingsState> {
    var lspPath = "flux-lsp"

    @Nullable
    override fun getState(): AppSettingsState {
        return this
    }

    override fun loadState(@NotNull state: AppSettingsState) {
        XmlSerializerUtil.copyBean(state, this)
    }

    companion object {
        val instance: AppSettingsState
            get() = ApplicationManager.getApplication().getService(AppSettingsState::class.java)
    }
}
