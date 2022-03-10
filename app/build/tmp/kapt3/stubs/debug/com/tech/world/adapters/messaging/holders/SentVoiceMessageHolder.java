package com.tech.world.adapters.messaging.holders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J(\u00107\u001a\u0002022\u0006\u00105\u001a\u0002062\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001fH\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0010\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/tech/world/adapters/messaging/holders/SentVoiceMessageHolder;", "Lcom/tech/world/adapters/messaging/holders/base/BaseSentHolder;", "Lcom/tech/world/adapters/messaging/AudibleBase;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "myThumbImg", "", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V", "audibleInteraction", "Lcom/tech/world/adapters/messaging/AudibleInteraction;", "getAudibleInteraction", "()Lcom/tech/world/adapters/messaging/AudibleInteraction;", "setAudibleInteraction", "(Lcom/tech/world/adapters/messaging/AudibleInteraction;)V", "audibleState", "Landroidx/lifecycle/LiveData;", "", "Lcom/tech/world/model/AudibleState;", "getAudibleState", "()Landroidx/lifecycle/LiveData;", "setAudibleState", "(Landroidx/lifecycle/LiveData;)V", "circleImg", "Lde/hdodenhof/circleimageview/CircleImageView;", "getCircleImg", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setCircleImg", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "playBtn", "Landroid/widget/ImageView;", "getPlayBtn", "()Landroid/widget/ImageView;", "setPlayBtn", "(Landroid/widget/ImageView;)V", "seekBar", "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "setSeekBar", "(Landroid/widget/SeekBar;)V", "tvDuration", "Landroid/widget/TextView;", "getTvDuration", "()Landroid/widget/TextView;", "setTvDuration", "(Landroid/widget/TextView;)V", "voiceMessageStat", "bind", "", "message", "Lcom/tech/world/model/realms/Message;", "user", "Lcom/tech/world/model/realms/User;", "loadUserPhoto", "fromId", "isSentType", "", "imageView", "app_debug"})
public final class SentVoiceMessageHolder extends com.tech.world.adapters.messaging.holders.base.BaseSentHolder implements com.tech.world.adapters.messaging.AudibleBase {
    private final java.lang.String myThumbImg = null;
    @org.jetbrains.annotations.NotNull()
    private android.widget.ImageView playBtn;
    @org.jetbrains.annotations.NotNull()
    private android.widget.SeekBar seekBar;
    @org.jetbrains.annotations.NotNull()
    private de.hdodenhof.circleimageview.CircleImageView circleImg;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView tvDuration;
    private final android.widget.ImageView voiceMessageStat = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> audibleState;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.adapters.messaging.AudibleInteraction audibleInteraction;
    
    public SentVoiceMessageHolder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.NotNull()
    java.lang.String myThumbImg) {
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
    public final de.hdodenhof.circleimageview.CircleImageView getCircleImg() {
        return null;
    }
    
    public final void setCircleImg(@org.jetbrains.annotations.NotNull()
    de.hdodenhof.circleimageview.CircleImageView p0) {
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
    
    private final void loadUserPhoto(com.tech.world.model.realms.User user, java.lang.String fromId, boolean isSentType, android.widget.ImageView imageView) {
    }
}