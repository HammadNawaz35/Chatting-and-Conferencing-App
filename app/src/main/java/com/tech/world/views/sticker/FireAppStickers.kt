package com.tech.world.views.sticker

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.aghajari.emojiview.sticker.Sticker
import com.aghajari.emojiview.sticker.StickerCategory
import com.tech.world.R

class FireAppStickers(private val context: Context) : StickerCategory<Int> {
    private val stickerLoader = StickerLoader(context)

    override fun getStickers(): Array<Sticker<*>> {
        return stickerLoader.getStickers()?.toTypedArray() ?: arrayOf()
    }

    override fun getCategoryData(): Int {
        return R.drawable.ic_sticker
    }

    override fun useCustomView(): Boolean {
        return false
    }

    override fun getView(viewGroup: ViewGroup): View? {
        return null
    }

    override fun bindView(view: View) {}
    override fun getEmptyView(viewGroup: ViewGroup): View? {
        return null
    }
}