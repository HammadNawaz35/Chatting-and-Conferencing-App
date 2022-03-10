package com.tech.world.utils

import java.io.File

object GetFolderSize {
    @Throws(Exception::class)
    fun getSize(srcFolder: String): Long {
        return getFileSize(srcFolder)
    }


    @Throws(Exception::class)
    private fun getFileSize(
        folder: String
    ): Long {
        val folder = File(folder)
        if (folder.isDirectory) {
            return folder.listFiles().sumOf { it.length() }
        }
        return 0
    }


}