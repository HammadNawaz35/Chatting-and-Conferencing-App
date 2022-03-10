package com.tech.world.utils.mediastore

import android.content.ContentValues
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import androidx.annotation.RequiresApi
import com.tech.world.extensions.writeFromFile
import com.tech.world.model.constants.MessageType
import com.tech.world.utils.DirManager
import com.tech.world.utils.MyApp
import java.io.File

@RequiresApi(Build.VERSION_CODES.Q)
object MediaStoreSaver {

    fun saveImage(imageName: String, imageFile: File): Uri? {
        val imageCollection =
            MediaStore.Images.Media.getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY)

        val contentValues = ContentValues().apply {
            put(MediaStore.Images.Media.DISPLAY_NAME, imageName)
            put(
                MediaStore.Images.Media.RELATIVE_PATH,
                Environment.DIRECTORY_DCIM + "/" + DirManager.getRelativePath(MessageType.RECEIVED_IMAGE)
            )
        }

        val contentResolver = MyApp.context().contentResolver
        contentResolver.insert(imageCollection, contentValues)?.also { uri ->
            contentResolver.openOutputStream(uri)?.use { outputStream ->
                outputStream.writeFromFile(imageFile)
                return uri
            }
        }
        return null

    }

    fun saveVideo(videoName: String, videoFile: File): Uri? {
        val videoCollection =
            MediaStore.Video.Media.getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY)

        val contentValues = ContentValues().apply {
            put(MediaStore.Video.Media.DISPLAY_NAME, videoName)
            put(
                MediaStore.Video.Media.RELATIVE_PATH,
                Environment.DIRECTORY_DCIM + "/" + DirManager.getRelativePath(MessageType.RECEIVED_VIDEO)
            )
        }

        val contentResolver = MyApp.context().contentResolver
        contentResolver.insert(videoCollection, contentValues)?.also { uri ->
            contentResolver.openOutputStream(uri)?.use { outputStream ->
                outputStream.writeFromFile(videoFile)
                return uri
            }
        }
        return null
    }

    fun saveAudio(audioFileName: String, audioFile: File): Uri? {
        val audioCollection =
            MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY)

        val contentValues = ContentValues().apply {
            put(MediaStore.Audio.Media.DISPLAY_NAME, audioFileName)
            put(
                MediaStore.Audio.Media.RELATIVE_PATH,
                Environment.DIRECTORY_MUSIC + "/" + DirManager.getRelativePath(MessageType.RECEIVED_AUDIO)
            )
        }

        val contentResolver = MyApp.context().contentResolver
        contentResolver.insert(audioCollection, contentValues)?.also { uri ->
            contentResolver.openOutputStream(uri)?.use { outputStream ->
                outputStream.writeFromFile(audioFile)
                return uri
            }
        }
        return null
    }

    fun saveFile(fileName: String, file: File): Uri? {
        val downloadsCollection =
            MediaStore.Downloads.getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY)

        val contentValues = ContentValues().apply {
            put(MediaStore.Audio.Media.DISPLAY_NAME, fileName)
            put(
                MediaStore.Audio.Media.RELATIVE_PATH,
                Environment.DIRECTORY_DOWNLOADS + "/" + DirManager.getRelativePath(MessageType.RECEIVED_FILE)
            )
        }

        val contentResolver = MyApp.context().contentResolver
        contentResolver.insert(downloadsCollection, contentValues)?.also { uri ->
            contentResolver.openOutputStream(uri)?.use { outputStream ->
                outputStream.writeFromFile(file)
                return uri
            }
        }
        return null
    }
}