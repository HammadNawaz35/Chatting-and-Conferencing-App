package com.tech.world.placespicker.model;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/tech/world/placespicker/model/Response;", "", "confident", "", "venues", "", "Lcom/tech/world/placespicker/model/Venue;", "(ZLjava/util/List;)V", "getConfident", "()Z", "getVenues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Response {
    @com.google.gson.annotations.SerializedName(value = "confident")
    private final boolean confident = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "venues")
    private final java.util.List<com.tech.world.placespicker.model.Venue> venues = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.placespicker.model.Response copy(boolean confident, @org.jetbrains.annotations.NotNull()
    java.util.List<com.tech.world.placespicker.model.Venue> venues) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Response(boolean confident, @org.jetbrains.annotations.NotNull()
    java.util.List<com.tech.world.placespicker.model.Venue> venues) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getConfident() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.tech.world.placespicker.model.Venue> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.tech.world.placespicker.model.Venue> getVenues() {
        return null;
    }
}