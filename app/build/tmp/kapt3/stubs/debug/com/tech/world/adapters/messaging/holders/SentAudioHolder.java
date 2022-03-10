package com.tech.world.adapters.messaging.holders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0018\u00010\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u00069"}, d2 = {"Lcom/tech/world/adapters/messaging/holders/SentAudioHolder;", "Lcom/tech/world/adapters/messaging/holders/base/BaseSentHolder;", "Lcom/tech/world/adapters/messaging/AudibleBase;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "audibleInteraction", "Lcom/tech/world/adapters/messaging/AudibleInteraction;", "getAudibleInteraction", "()Lcom/tech/world/adapters/messaging/AudibleInteraction;", "setAudibleInteraction", "(Lcom/tech/world/adapters/messaging/AudibleInteraction;)V", "audibleState", "Landroidx/lifecycle/LiveData;", "", "", "Lcom/tech/world/model/AudibleState;", "getAudibleState", "()Landroidx/lifecycle/LiveData;", "setAudibleState", "(Landroidx/lifecycle/LiveData;)V", "imgHeadset", "Landroid/widget/ImageView;", "getImgHeadset", "()Landroid/widget/ImageView;", "setImgHeadset", "(Landroid/widget/ImageView;)V", "playBtn", "getPlayBtn", "setPlayBtn", "seekBar", "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "setSeekBar", "(Landroid/widget/SeekBar;)V", "tvAudioSize", "Landroid/widget/TextView;", "tvDuration", "getTvDuration", "()Landroid/widget/TextView;", "setTvDuration", "(Landroid/widget/TextView;)V", "waveView", "Lak/sh/ay/musicwave/MusicWave;", "getWaveView", "()Lak/sh/ay/musicwave/MusicWave;", "setWaveView", "(Lak/sh/ay/musicwave/MusicWave;)V", "bind", "", "message", "Lcom/tech/world/model/realms/Message;", "user", "Lcom/tech/world/model/realms/User;", "app_debug"})
public final class SentAudioHolder extends com.tech.world.adapters.messaging.holders.base.BaseSentHolder implements com.tech.world.adapters.messaging.AudibleBase {
    @org.jetbrains.annotations.NotNull()
    private ak.sh.ay.musicwave.MusicWave waveView;
    @org.jetbrains.annotations.NotNull()
    private android.widget.ImageView playBtn;
    @org.jetbrains.annotations.NotNull()
    private android.widget.SeekBar seekBar;
    private final android.widget.TextView tvAudioSize = null;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView tvDuration;
    @org.jetbrains.annotations.NotNull()
    private android.widget.ImageView imgHeadset;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> audibleState;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.adapters.messaging.AudibleInteraction audibleInteraction;
    
    public SentAudioHolder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ak.sh.ay.musicwave.MusicWave getWaveView() {
        return null;
    }
    
    public final void setWaveView(@org.jetbrains.annotations.NotNull()
    ak.sh.ay.musicwave.MusicWave p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImgHeadset() {
        return null;
    }
    
    public final void setImgHeadset(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
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