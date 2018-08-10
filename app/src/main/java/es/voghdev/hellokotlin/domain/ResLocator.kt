package es.voghdev.hellokotlin.domain

import android.support.annotation.StringRes

interface ResLocator {
    fun getString(@StringRes resId: Int): String
    fun getStringArray(@StringRes resId: Int): List<String>
}
