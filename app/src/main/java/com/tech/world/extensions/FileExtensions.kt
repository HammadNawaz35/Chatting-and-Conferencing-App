package com.tech.world.extensions

import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipFile



fun InputStream.writeToFile(file: File) {
    this.use { inputStream ->
        file.outputStream().use { inputStream.copyTo(it) }
    }
}

fun OutputStream.writeFromFile(file: File) {
    this.use { outputStream ->
        file.inputStream().use { inputStream ->
            inputStream.copyTo(outputStream)
        }
    }
}



data class ZipIO(val entry: ZipEntry, val output: File)

suspend fun File.unzip(unzipLocationRoot: File? = null, listener: (size: Long) -> Unit) {

    val rootFolder =
        unzipLocationRoot ?: File(parentFile.absolutePath + File.separator + nameWithoutExtension)
    if (!rootFolder.exists()) {
        rootFolder.mkdirs()
    }

    ZipFile(this).use { zip ->
        zip
            .entries()
            .asSequence()
            .map {
                val outputFile = File(rootFolder.absolutePath + File.separator + it.name)
                ZipIO(it, outputFile)
            }
            .map {
                it.output.parentFile?.run {
                    if (!exists()) mkdirs()
                }
                it
            }
            .filter { !it.entry.isDirectory }
            .forEach { (entry, output) ->
                zip.getInputStream(entry).use { input ->
                    output.outputStream().use { output ->
                        input.copyTo(output)
                    }
                    listener(entry.size)
                }
            }
    }

}
