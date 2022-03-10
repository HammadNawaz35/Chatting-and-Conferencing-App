package com.tech.world.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\bH\u0016J\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\"\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u001bH\u0014J\b\u0010-\u001a\u00020\u001bH\u0014J\b\u0010.\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006/"}, d2 = {"Lcom/tech/world/activities/ProfilePhotoActivity;", "Lcom/tech/world/activities/BaseActivity;", "()V", "IMAGE_QUALITY_COMPRESS", "", "groupManager", "Lcom/tech/world/utils/network/GroupManager;", "isBroadcast", "", "isGroup", "profileFullScreen", "Landroid/widget/ImageView;", "profilePhotoPath", "", "getProfilePhotoPath", "()Ljava/lang/String;", "setProfilePhotoPath", "(Ljava/lang/String;)V", "toolbarProfile", "Landroidx/appcompat/widget/Toolbar;", "user", "Lcom/tech/world/model/realms/User;", "getUser", "()Lcom/tech/world/model/realms/User;", "setUser", "(Lcom/tech/world/model/realms/User;)V", "editProfilePhoto", "", "enablePresence", "loadImage", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStart", "onStop", "pickImages", "app_debug"})
public final class ProfilePhotoActivity extends com.tech.world.activities.BaseActivity {
    private androidx.appcompat.widget.Toolbar toolbarProfile;
    private android.widget.ImageView profileFullScreen;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.model.realms.User user;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String profilePhotoPath;
    private final int IMAGE_QUALITY_COMPRESS = 30;
    private boolean isGroup = false;
    private boolean isBroadcast = false;
    private final com.tech.world.utils.network.GroupManager groupManager = null;
    private java.util.HashMap _$_findViewCache;
    
    public ProfilePhotoActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tech.world.model.realms.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.tech.world.model.realms.User p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProfilePhotoPath() {
        return null;
    }
    
    public final void setProfilePhotoPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadImage(java.lang.String profilePhotoPath) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void editProfilePhoto() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public boolean enablePresence() {
        return false;
    }
    
    private final void pickImages() {
    }
}