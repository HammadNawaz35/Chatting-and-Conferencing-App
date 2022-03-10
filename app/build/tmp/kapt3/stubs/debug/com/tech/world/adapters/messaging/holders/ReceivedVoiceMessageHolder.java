package com.tech.world.adapters.messaging.holders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J \u00102\u001a\u00020-2\u0006\u00100\u001a\u0002012\u0006\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u001aH\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0018\u00010\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/tech/world/adapters/messaging/holders/ReceivedVoiceMessageHolder;", "Lcom/tech/world/adapters/messaging/holders/base/BaseReceivedHolder;", "Lcom/tech/world/adapters/messaging/AudibleBase;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "audibleInteraction", "Lcom/tech/world/adapters/messaging/AudibleInteraction;", "getAudibleInteraction", "()Lcom/tech/world/adapters/messaging/AudibleInteraction;", "setAudibleInteraction", "(Lcom/tech/world/adapters/messaging/AudibleInteraction;)V", "audibleState", "Landroidx/lifecycle/LiveData;", "", "", "Lcom/tech/world/model/AudibleState;", "getAudibleState", "()Landroidx/lifecycle/LiveData;", "setAudibleState", "(Landroidx/lifecycle/LiveData;)V", "circleImg", "Lde/hdodenhof/circleimageview/CircleImageView;", "playBtn", "Landroid/widget/ImageView;", "getPlayBtn", "()Landroid/widget/ImageView;", "setPlayBtn", "(Landroid/widget/ImageView;)V", "seekBar", "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "setSeekBar", "(Landroid/widget/SeekBar;)V", "tvDuration", "Landroid/widget/TextView;", "getTvDuration", "()Landroid/widget/TextView;", "setTvDuration", "(Landroid/widget/TextView;)V", "voiceMessageStat", "bind", "", "message", "Lcom/tech/world/model/realms/Message;", "user", "Lcom/tech/world/model/realms/User;", "loadUserPhoto", "fromId", "imageView", "app_debug"})
public final class ReceivedVoiceMessageHolder extends com.tech.world.adapters.messaging.holders.base.BaseReceivedHolder implements com.tech.world.adapters.messaging.AudibleBase {
    @org.jetbrains.annotations.NotNull()
    private android.widget.ImageView playBtn;
    @org.jetbrains.annotations.NotNull()
    private android.widget.SeekBar seekBar;
    private final de.hdodenhof.circleimageview.CircleImageView circleImg = null;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView tvDuration;
    private final android.widget.ImageView voiceMessageStat = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> audibleState;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.adapters.messaging.AudibleInteraction audibleInteraction;
    
    public ReceivedVoiceMessageHolder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getPlayBtn() {
        return null;
    }
    
    public final void setPlayBtn(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.SeekBar getSeekBar() {
        return null;
    }
    
    public final void setSeekBar(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvDuration() {
        return null;
    }
    
    public final void setTvDuration(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> getAudibleState() {
        return null;
    }
    
    @java.lang.Override()
    public void setAudibleState(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.tech.world.adapters.messaging.AudibleInteraction getAudibleInteraction() {
        return null;
    }
    
    @java.lang.Override()
    public void setAudibleInteraction(@org.jetbrains.annotations.Nullable()
    com.tech.world.adapters.messaging.AudibleInteraction p0) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message, @org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.User user) {
    }
    
    private final void loadUserPhoto(com.tech.world.model.realms.User user, java.lang.String fromId, android.widget.ImageView imageView) {
    }
}