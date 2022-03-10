package com.tech.world.utils.mediastore

import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Build
import androidx.annotation.RequiresApi
import com.tech.world.model.constants.MessageType
import com.tech.world.model.realms.Message
import java.io.File

object MessageMediaStore {
    @RequiresApi(Build.VERSION_CODES.Q)
    fun saveToMediaStore(message: Message, fileName: String): Uri? {
        return when (message.type) {

            MessageType.RECEIVED_IMAGE -> {
                MediaStoreSaver.saveImage(fileName, File(message.localPath))
            }

            MessageType.RECEIVED_VIDEO -> {
                MediaStoreSaver.saveVideo(fileName, File(message.localPath))
            }

            MessageType.RECEIVED_AUDIO -> {
                MediaStoreSaver.saveAudio(fileName, File(message.localPath))
            }

            MessageType.RECEIVED_FILE -> {
                MediaStoreSaver.saveFile(fileName, File(message.localPath))
            }
            else -> null
        }
    }
}