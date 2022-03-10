package com.tech.world.utils.mediastore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/tech/world/utils/mediastore/MediaStoreFileInfo;", "", "()V", "getFileExtensionByFileName", "", "uri", "Landroid/net/Uri;", "getFileExtensionUsingMimeType", "context", "Landroid/content/Context;", "getFileName", "fileUri", "getFileSize", "", "getMimeTypeByUri", "isImageType", "", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/Boolean;", "app_debug"})
public final class MediaStoreFileInfo {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.utils.mediastore.MediaStoreFileInfo INSTANCE = null;
    
    private MediaStoreFileInfo() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMimeTypeByUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isImageType(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFileExtensionUsingMimeType(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFileExtensionByFileName(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    public final long getFileSize(@org.jetbrains.annotations.NotNull()
    android.net.Uri fileUri) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFileName(@org.jetbrains.annotations.NotNull()
    android.net.Uri fileUri) {
        return null;
    }
}