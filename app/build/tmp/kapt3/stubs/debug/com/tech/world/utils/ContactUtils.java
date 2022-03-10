package com.tech.world.utils;

import java.lang.System;

/**
 * Created by Devlomi on 03/08/2017.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fH\u0007J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u001b0\u000fH\u0007J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0007J\b\u0010 \u001a\u00020!H\u0007\u00a8\u0006\""}, d2 = {"Lcom/tech/world/utils/ContactUtils;", "", "()V", "contactExists", "", "context", "Landroid/content/Context;", "number", "", "fetchContacts", "Lio/reactivex/Observable;", "Lcom/tech/world/model/realms/User;", "formatNumber", "countryCode", "getContactAsVcard", "", "Lezvcard/VCard;", "uri", "Landroid/net/Uri;", "getContactNamesFromVcard", "Lcom/tech/world/model/ExpandableContact;", "vcards", "getContactsFromContactResult", "results", "Lcom/wafflecopter/multicontactpicker/ContactResult;", "getContactsFromExpandableGroups", "groups", "Lcom/thoughtbot/expandablerecyclerview/models/ExpandableGroup;", "getRawContactsObservable", "Lcom/tech/world/model/PhoneContact;", "queryForNameByNumber", "phone", "syncContacts", "Lio/reactivex/Completable;", "app_debug"})
public final class ContactUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.utils.ContactUtils INSTANCE = null;
    
    private ContactUtils() {
        super();
    }
    
    private final io.reactivex.Observable<com.tech.world.model.PhoneContact> getRawContactsObservable(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String formatNumber(java.lang.String countryCode, java.lang.String number) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String queryForNameByNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean contactExists(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String number) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final io.reactivex.Completable syncContacts() {
        return null;
    }
    
    private final io.reactivex.Observable<com.tech.world.model.realms.User> fetchContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.List<ezvcard.VCard> getContactAsVcard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.List<com.tech.world.model.ExpandableContact> getContactNamesFromVcard(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends ezvcard.VCard> vcards) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.List<com.tech.world.model.ExpandableContact> getContactsFromContactResult(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.wafflecopter.multicontactpicker.ContactResult> results) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.List<com.tech.world.model.ExpandableContact> getContactsFromExpandableGroups(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.thoughtbot.expandablerecyclerview.models.ExpandableGroup<?>> groups) {
        return null;
    }
}