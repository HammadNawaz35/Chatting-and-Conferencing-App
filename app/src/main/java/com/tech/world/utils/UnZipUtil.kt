package com.tech.world.utils

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tech.world.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

class UnZipUtil {

    private val _finishedBytes = MutableLiveData<Long>()
    val finishedBytes: LiveData<Long> get() = _finishedBytes

    private val appFolderName = MyApp.context().getString(R.string.app_folder_name)

    @Throws(Exception::class)
    suspend fun zipFolders(srcFolders: Array<String>, files: Array<String>, destZipFile: String?) {
        var zip: ZipOutputStream?
        var fileWriter: FileOutputStream?
        fileWriter = FileOutputStream(destZipFile)
        zip = ZipOutputStream(fileWriter)
        for (srcFolder in srcFolders) {
            val folder = File(srcFolder)
            for (fileName in folder.list()) {
                val folderName =
                    if (folder.parentFile.name == appFolderName) folder.name else folder.parentFile.name + "/" + folder.name

                addFileToZip(folderName, "$srcFolder/$fileName", zip)
            }
        }
        for (filePath in files) {

            val file = File(filePath)

            addFileToZip("", "$file", zip)

        }

        zip.flush()
        zip.close()
    }


    @Throws(Exception::class)
    private suspend fun addFileToZip(
        path: String, srcFile: String,
        zip: ZipOutputStream?
    ) {
        val folder = File(srcFile)
//        if (folder.isDirectory) {
//            addFolderToZip(path, srcFile, zip)
//        } else {
        if (folder.isDirectory) {
            return
        }
        val buf = ByteArray(1024)
        var len: Int
        val `in` = FileInputStream(srcFile)
        zip?.putNextEntry(ZipEntry("$path/${folder.name}"))
        //zip.putNextEntry(new ZipEntry(path + "/" + folder.getName()));
        while (`in`.read(buf).also { len = it } > 0) {
            zip?.write(buf, 0, len)
        }
        withContext(Dispatchers.Main) {
            _finishedBytes.value = folder.length().also {
            }
        }
    }

    @Throws(Exception::class)
    private suspend fun addFolderToZip(
        path: String, srcFolder: String,
        zip: ZipOutputStream?
    ) {
        val folder = File(srcFolder)
        for (fileName in folder.list()) {
            if (path == "") {
                val folderName = folder.parentFile.name + "/" + folder.name
                addFileToZip(folderName, "$srcFolder/$fileName", zip)
            } else {
                addFileToZip(
                    path + "/" + folder.name, srcFolder + "/"
                            + fileName, zip
                )
            }
        }
    }
}