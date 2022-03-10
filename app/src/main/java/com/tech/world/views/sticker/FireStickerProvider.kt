package com.tech.world.views.sticker

import android.content.Context
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import com.aghajari.emojiview.sticker.Sticker
import com.aghajari.emojiview.sticker.StickerCategory
import com.aghajari.emojiview.sticker.StickerLoader
import com.aghajari.emojiview.sticker.StickerProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FireStickerProvider(private val context: Context) : StickerProvider {

    override fun getCategories(): Array<StickerCategory<*>> {
        return arrayOf(
                FireAppStickers(context)
        )
    }

    override fun getLoader(): StickerLoader {
        return object : StickerLoader {
            override fun onLoadSticker(view: View, sticker: Sticker<*>) {
                try {
                    Glide.with(view).load(sticker.data).apply(RequestOptions.fitCenterTransform()).into((view as AppCompatImageView))
                } catch (e: Exception) {
                }
            }

            override fun onLoadStickerCategory(view: View, stickerCategory: StickerCategory<*>, selected: Boolean) {
                try {
                    Glide.with(view).load(stickerCategory.categoryData.toString().toInt()).apply(RequestOptions.fitCenterTransform()).into((view as AppCompatImageView))
                } catch (ignore: Exception) {
                }
            }
        }
    }

    override fun isRecentEnabled(): Boolean {
        return true
    }
}