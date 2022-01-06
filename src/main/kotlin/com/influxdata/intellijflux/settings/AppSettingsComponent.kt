package com.influxdata.intellijflux.settings

import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBTextField
import com.intellij.util.ui.FormBuilder
import org.jetbrains.annotations.NotNull
import javax.swing.JComponent
import javax.swing.JPanel


class AppSettingsComponent {
    val panel: JPanel
    private val lspPathField = JBTextField("flux-lsp")

    init {
        panel = FormBuilder.createFormBuilder()
            .addLabeledComponent(JBLabel("Enter path to flux-lsp: "), lspPathField, 1, false)
            .addComponentFillVertically(JPanel(), 0)
            .panel
    }

    val preferredFocusedComponent: JComponent
        get() = lspPathField

    @get:NotNull
    var lspPath: String?
        get() = lspPathField.text
        set(newText) {
            lspPathField.text = newText
        }
}
