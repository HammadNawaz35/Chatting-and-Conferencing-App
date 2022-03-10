package com.tech.world.views.sticker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0018\u00010\u0012J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\tJ\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/tech/world/views/sticker/StickerLoader;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "copyAssets", "", "destinationPath", "", "copyFile", "in", "Ljava/io/InputStream;", "out", "Ljava/io/OutputStream;", "getStickers", "", "Lcom/aghajari/emojiview/sticker/Sticker;", "getStickersVersion", "", "hasLoadedStickers", "", "loadStickersIntoFilesDir", "setStickersLoaded", "boolean", "setStickersVersion", "stickerVersion", "Companion", "app_debug"})
public final class StickerLoader {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.views.sticker.StickerLoader.Companion Companion = null;
    private static final int STICKERS_VERSION = 1;
    private final android.content.SharedPreferences sharedPreferences = null;
    
    public StickerLoader(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final boolean hasLoadedStickers() {
        return false;
    }
    
    private final void setStickersLoaded(boolean p0_32355860) {
    }
    
    private final int getStickersVersion() {
        return 0;
    }
    
    private final void setStickersVersion(int stickerVersion) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.aghajari.emojiview.sticker.Sticker<java.lang.String>> getStickers() {
        return null;
    }
    
    public final void loadStickersIntoFilesDir() {
    }
    
    private final void copyAssets(java.lang.String destinationPath) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final void copyFile(java.io.InputStream in, java.io.OutputStream out) throws java.io.IOException {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tech/world/views/sticker/StickerLoader$Companion;", "", "()V", "STICKERS_VERSION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}