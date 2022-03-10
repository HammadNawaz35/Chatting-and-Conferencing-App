package com.tech.world.adapters.messaging.holders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0018\u00010\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\'\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u00a8\u00060"}, d2 = {"Lcom/tech/world/adapters/messaging/holders/ReceivedAudioHolder;", "Lcom/tech/world/adapters/messaging/holders/base/BaseReceivedHolder;", "Lcom/tech/world/adapters/messaging/AudibleBase;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "audibleInteraction", "Lcom/tech/world/adapters/messaging/AudibleInteraction;", "getAudibleInteraction", "()Lcom/tech/world/adapters/messaging/AudibleInteraction;", "setAudibleInteraction", "(Lcom/tech/world/adapters/messaging/AudibleInteraction;)V", "audibleState", "Landroidx/lifecycle/LiveData;", "", "", "Lcom/tech/world/model/AudibleState;", "getAudibleState", "()Landroidx/lifecycle/LiveData;", "setAudibleState", "(Landroidx/lifecycle/LiveData;)V", "imgHeadset", "Landroid/widget/ImageView;", "getImgHeadset", "()Landroid/widget/ImageView;", "playBtn", "getPlayBtn", "seekBar", "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "tvAudioSize", "Landroid/widget/TextView;", "tvDuration", "getTvDuration", "()Landroid/widget/TextView;", "waveView", "Lak/sh/ay/musicwave/MusicWave;", "getWaveView", "()Lak/sh/ay/musicwave/MusicWave;", "bind", "", "message", "Lcom/tech/world/model/realms/Message;", "user", "Lcom/tech/world/model/realms/User;", "app_debug"})
public final class ReceivedAudioHolder extends com.tech.world.adapters.messaging.holders.base.BaseReceivedHolder implements com.tech.world.adapters.messaging.AudibleBase {
    @org.jetbrains.annotations.NotNull()
    private final ak.sh.ay.musicwave.MusicWave waveView = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.ImageView playBtn = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.SeekBar seekBar = null;
    private final android.widget.TextView tvAudioSize = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.TextView tvDuration = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.ImageView imgHeadset = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> audibleState;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.adapters.messaging.AudibleInteraction audibleInteraction;
    
    public ReceivedAudioHolder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ak.sh.ay.musicwave.MusicWave getWaveView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getPlayBtn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.SeekBar getSeekBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImgHeadset() {
        return null;
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
}