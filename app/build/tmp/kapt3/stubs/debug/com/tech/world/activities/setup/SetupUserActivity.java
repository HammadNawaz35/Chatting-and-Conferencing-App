package com.tech.world.activities.setup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002\u00a8\u0006\u000b"}, d2 = {"Lcom/tech/world/activities/setup/SetupUserActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showSnackbar", "startMainActivity", "Companion", "app_debug"})
public final class SetupUserActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.activities.setup.SetupUserActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public SetupUserActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showSnackbar() {
    }
    
    private final void startMainActivity() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String pickedPhotoLocalPath, @org.jetbrains.annotations.Nullable()
    java.lang.String backupUri, @org.jetbrains.annotations.Nullable()
    java.lang.String dbUri) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/tech/world/activities/setup/SetupUserActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "userName", "", "pickedPhotoLocalPath", "backupUri", "dbUri", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String userName, @org.jetbrains.annotations.Nullable()
        java.lang.String pickedPhotoLocalPath, @org.jetbrains.annotations.Nullable()
        java.lang.String backupUri, @org.jetbrains.annotations.Nullable()
        java.lang.String dbUri) {
        }
    }
}