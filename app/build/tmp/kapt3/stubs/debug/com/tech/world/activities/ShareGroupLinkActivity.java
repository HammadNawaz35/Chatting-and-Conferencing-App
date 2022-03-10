package com.tech.world.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\"\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/tech/world/activities/ShareGroupLinkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "group", "Lcom/tech/world/model/realms/Group;", "link", "", "getLink", "()Ljava/lang/String;", "progressBar", "Landroid/widget/ProgressBar;", "shareLinkLayout", "Landroid/widget/LinearLayout;", "tvCopyLink", "Lcom/tech/world/views/TextViewDrawableCompat;", "tvGroupLink", "Landroid/widget/TextView;", "tvRevokeLink", "tvSendLinkViaFireapp", "tvShareLink", "disableClicks", "", "enableClicks", "hideOrShowProgress", "showProgress", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setLinkText", "groupLink", "Companion", "app_debug"})
public final class ShareGroupLinkActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.LinearLayout shareLinkLayout;
    private android.widget.TextView tvGroupLink;
    private com.tech.world.views.TextViewDrawableCompat tvSendLinkViaFireapp;
    private com.tech.world.views.TextViewDrawableCompat tvCopyLink;
    private com.tech.world.views.TextViewDrawableCompat tvShareLink;
    private com.tech.world.views.TextViewDrawableCompat tvRevokeLink;
    private android.widget.ProgressBar progressBar;
    private com.tech.world.model.realms.Group group;
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.activities.ShareGroupLinkActivity.Companion Companion = null;
    private static final int REQUEST_SHARE_VIA_FIREAPP = 23;
    private java.util.HashMap _$_findViewCache;
    
    public ShareGroupLinkActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setLinkText(java.lang.String groupLink) {
    }
    
    private final java.lang.String getLink() {
        return null;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void disableClicks() {
    }
    
    private final void hideOrShowProgress(boolean showProgress) {
    }
    
    private final void enableClicks() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tech/world/activities/ShareGroupLinkActivity$Companion;", "", "()V", "REQUEST_SHARE_VIA_FIREAPP", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}