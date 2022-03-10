package com.tech.world.model;

import java.lang.System;

/**
 * Created by Devlomi on 23/08/2017.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J?\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\tH\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\'"}, d2 = {"Lcom/tech/world/model/AudibleState;", "", "isPlaying", "", "currentDuration", "", "waves", "", "progress", "", "max", "(ZLjava/lang/String;[BII)V", "getCurrentDuration", "()Ljava/lang/String;", "setCurrentDuration", "(Ljava/lang/String;)V", "()Z", "setPlaying", "(Z)V", "getMax", "()I", "setMax", "(I)V", "getProgress", "setProgress", "getWaves", "()[B", "setWaves", "([B)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class AudibleState {
    private boolean isPlaying;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentDuration;
    @org.jetbrains.annotations.Nullable()
    private byte[] waves;
    private int progress;
    private int max;
    
    /**
     * Created by Devlomi on 23/08/2017.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.model.AudibleState copy(boolean isPlaying, @org.jetbrains.annotations.Nullable()
    java.lang.String currentDuration, @org.jetbrains.annotations.Nullable()
    byte[] waves, int progress, int max) {
        return null;
    }
    
    /**
     * Created by Devlomi on 23/08/2017.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Created by Devlomi on 23/08/2017.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Devlomi on 23/08/2017.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AudibleState() {
        super();
    }
    
    public AudibleState(boolean isPlaying, @org.jetbrains.annotations.Nullable()
    java.lang.String currentDuration, @org.jetbrains.annotations.Nullable()
    byte[] waves, int progress, int max) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isPlaying() {
        return false;
    }
    
    public final void setPlaying(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentDuration() {
        return null;
    }
    
    public final void setCurrentDuration(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getWaves() {
        return null;
    }
    
    public final void setWaves(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getProgress() {
        return 0;
    }
    
    public final void setProgress(int p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getMax() {
        return 0;
    }
    
    public final void setMax(int p0) {
    }
}