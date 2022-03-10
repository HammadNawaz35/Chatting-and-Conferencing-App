package com.tech.world.utils.mediastore

import android.content.Context
import android.net.Uri
import android.provider.OpenableColumns
import android.util.Log
import android.webkit.MimeTypeMap
import com.tech.world.utils.MyApp
import com.tech.world.utils.Util


object MediaStoreFileInfo {

    fun getMimeTypeByUri(context: Context, uri: Uri): String? {
        return context.contentResolver.getType(uri)
    }

    fun isImageType(context: Context, uri: Uri) =
        getMimeTypeByUri(context, uri)?.startsWith("image/")

    fun getFileExtensionUsingMimeType(context: Context, uri: Uri): String? {
        var fileTypeByUri = getMimeTypeByUri(context, uri)
        return MimeTypeMap.getSingleton()
            .getExtensionFromMimeType(fileTypeByUri)
    }

    fun getFileExtensionByFileName( uri: Uri): String? {
        return getFileName(uri)?.let { fileName ->
            Util.getFileExtensionFromPath(fileName)
        } ?: null
    }

    fun getFileSize(fileUri: Uri): Long {
        val cursor = MyApp.context().contentResolver.query(fileUri, null, null, null, null)
        val sizeIndex = cursor?.getColumnIndex(OpenableColumns.SIZE)
        cursor?.moveToFirst()
        return sizeIndex?.let { sizeIndex ->
            return cursor?.getLong(sizeIndex)
        } ?: 0
    }

    fun getFileName(fileUri: Uri): String? {
        val cursor = MyApp.context().contentResolver.query(fileUri, null, null, null, null)
        val sizeIndex = cursor?.getColumnIndex(OpenableColumns.DISPLAY_NAME)
        cursor?.moveToFirst()
        return sizeIndex?.let { sizeIndex ->
            return cursor?.getString(sizeIndex)
        } ?: null
    }
}