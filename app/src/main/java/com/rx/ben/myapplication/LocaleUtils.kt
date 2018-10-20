package com.rx.ben.myapplication

import android.content.res.Resources
import android.support.v4.os.ConfigurationCompat

class LocaleUtils {
    companion object {
        fun getLocale(): String {
            return ConfigurationCompat.getLocales(Resources.getSystem().configuration).get(0).toString()
        }
    }
}