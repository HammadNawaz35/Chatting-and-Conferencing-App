package com.tech.world.views.sticker

import android.content.Context
import android.content.res.AssetManager
import android.util.Log
import androidx.core.content.edit
import com.aghajari.emojiview.sticker.Sticker
import java.io.*

class StickerLoader(private val context: Context) {


    companion object {
        //if you update stickers in assets you have to increase this version
        private const val STICKERS_VERSION = 1
    }

    private val sharedPreferences = context.getSharedPreferences("stickers", Context.MODE_PRIVATE)

    private fun hasLoadedStickers() = sharedPreferences.getBoolean("stickers_loaded", false)
    private fun setStickersLoaded(boolean: Boolean) {
        sharedPreferences.edit {
            putBoolean("stickers_loaded", boolean)
        }
    }

    private fun getStickersVersion() = sharedPreferences.getInt("stickers_version", -1)
    private fun setStickersVersion(stickerVersion: Int) {
        sharedPreferences.edit {
            putInt("stickers_version", stickerVersion)
        }
    }


    fun getStickers(): List<Sticker<String>>? {
        val file = File(context.filesDir, "stickers")
        val list = file.listFiles()
        return list?.map { Sticker<String>(it.path) }
    }

    fun loadStickersIntoFilesDir() {
        if (!hasLoadedStickers() || getStickersVersion() != STICKERS_VERSION) {
            val destDir = File(context.filesDir, "stickers")
            destDir.delete()
            copyAssets( destDir.path)
            setStickersLoaded(true)
            setStickersVersion(STICKERS_VERSION)
        }

    }


    private fun copyAssets( destinationPath: String) {
        val assetManager: AssetManager = context.assets


        val stickersAssets = assetManager.list("stickers")
        stickersAssets?.forEach { stickerAsset ->
            var `in`: InputStream? = null
            var out: OutputStream? = null
            try {


                `in` = assetManager.open("stickers/$stickerAsset")
                val outFileDir = File("$destinationPath")
                outFileDir.mkdir()
                val outFile = File(outFileDir, stickerAsset)

                outFile.createNewFile()
                out = FileOutputStream(outFile)
                copyFile(`in`, out)


            } catch (e: IOException) {
            }
            finally {
                `in`?.close()
                out?.flush()
                out?.close()
            }
        }
    }

    @Throws(IOException::class)
    private fun copyFile(`in`: InputStream, out: OutputStream) {
        val buffer = ByteArray(1024)
        var read: Int = 0
        while (`in`.read(buffer).also({ read = it }) != -1) {
            out.write(buffer, 0, read)
        }
    }


}