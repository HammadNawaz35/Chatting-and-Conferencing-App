package com.tech.world.placespicker.model;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\u000eH\u00c6\u0003JU\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\bH\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, d2 = {"Lcom/tech/world/placespicker/model/Venue;", "", "categories", "", "Lcom/tech/world/placespicker/model/Category;", "hasPerk", "", "id", "", "location", "Lcom/tech/world/placespicker/model/Location;", "name", "referralId", "venuePage", "Lcom/tech/world/placespicker/model/VenuePage;", "(Ljava/util/List;ZLjava/lang/String;Lcom/tech/world/placespicker/model/Location;Ljava/lang/String;Ljava/lang/String;Lcom/tech/world/placespicker/model/VenuePage;)V", "getCategories", "()Ljava/util/List;", "getHasPerk", "()Z", "getId", "()Ljava/lang/String;", "getLocation", "()Lcom/tech/world/placespicker/model/Location;", "getName", "getReferralId", "getVenuePage", "()Lcom/tech/world/placespicker/model/VenuePage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class Venue {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "categories")
    private final java.util.List<com.tech.world.placespicker.model.Category> categories = null;
    @com.google.gson.annotations.SerializedName(value = "hasPerk")
    private final boolean hasPerk = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "location")
    private final com.tech.world.placespicker.model.Location location = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "referralId")
    private final java.lang.String referralId = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "venuePage")
    private final com.tech.world.placespicker.model.VenuePage venuePage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.placespicker.model.Venue copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tech.world.placespicker.model.Category> categories, boolean hasPerk, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.tech.world.placespicker.model.Location location, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String referralId, @org.jetbrains.annotations.NotNull()
    com.tech.world.placespicker.model.VenuePage venuePage) {
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
    
    public Venue(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tech.world.placespicker.model.Category> categories, boolean hasPerk, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.tech.world.placespicker.model.Location location, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String referralId, @org.jetbrains.annotations.NotNull()
    com.tech.world.placespicker.model.VenuePage venuePage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.tech.world.placespicker.model.Category> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.tech.world.placespicker.model.Category> getCategories() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getHasPerk() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.placespicker.model.Location component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.placespicker.model.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReferralId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.placespicker.model.VenuePage component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.placespicker.model.VenuePage getVenuePage() {
        return null;
    }
}