package com.tech.world.utils

import android.os.Build

object BuildVerUtil {
    @JvmStatic
    fun isOreoOrAbove(): Boolean {
        return Build.VERSION.SDK_INT >= 26
    }

    @JvmStatic
    fun isApi29OrAbove(): Boolean {
        return Build.VERSION.SDK_INT >= 29
    }

}