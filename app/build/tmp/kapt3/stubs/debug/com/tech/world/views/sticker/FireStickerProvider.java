package com.tech.world.views.sticker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H\u0016\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/tech/world/views/sticker/FireStickerProvider;", "Lcom/aghajari/emojiview/sticker/StickerProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getCategories", "", "Lcom/aghajari/emojiview/sticker/StickerCategory;", "()[Lcom/aghajari/emojiview/sticker/StickerCategory;", "getLoader", "Lcom/aghajari/emojiview/sticker/StickerLoader;", "isRecentEnabled", "", "app_debug"})
public final class FireStickerProvider implements com.aghajari.emojiview.sticker.StickerProvider {
    private final android.content.Context context = null;
    
    public FireStickerProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.aghajari.emojiview.sticker.StickerCategory<?>[] getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.aghajari.emojiview.sticker.StickerLoader getLoader() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRecentEnabled() {
        return false;
    }
}