package com.tech.world.utils.mediastore;

import java.lang.System;

@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b\u00a8\u0006\u0012"}, d2 = {"Lcom/tech/world/utils/mediastore/MediaStoreSaver;", "", "()V", "saveAudio", "Landroid/net/Uri;", "audioFileName", "", "audioFile", "Ljava/io/File;", "saveFile", "fileName", "file", "saveImage", "imageName", "imageFile", "saveVideo", "videoName", "videoFile", "app_debug"})
public final class MediaStoreSaver {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.utils.mediastore.MediaStoreSaver INSTANCE = null;
    
    private MediaStoreSaver() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri saveImage(@org.jetbrains.annotations.NotNull()
    java.lang.String imageName, @org.jetbrains.annotations.NotNull()
    java.io.File imageFile) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri saveVideo(@org.jetbrains.annotations.NotNull()
    java.lang.String videoName, @org.jetbrains.annotations.NotNull()
    java.io.File videoFile) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri saveAudio(@org.jetbrains.annotations.NotNull()
    java.lang.String audioFileName, @org.jetbrains.annotations.NotNull()
    java.io.File audioFile) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
}