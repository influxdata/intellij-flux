package com.influxdata.intellijflux.language

import com.intellij.lang.PsiBuilder


// FIXME: maybe we can leverage the rust parser here?

class FluxParserUtil {

    fun isHexDigit(builder: PsiBuilder, level: Int): Boolean {
        return false
    }

    fun isUnicodeChar(builder: PsiBuilder, level: Int): Boolean {
        return false
    }

    fun isLetter(builder: PsiBuilder, level: Int): Boolean {
        return false
    }

    fun eof(builder: PsiBuilder, level: Int): Boolean {
        return builder.eof()
    }
}
