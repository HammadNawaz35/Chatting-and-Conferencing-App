package com.tech.world.utils;

import java.lang.System;

/**
 * Created by Devlomi on 13/08/2017.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u001a\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\u0010\u0010\'\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010(\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/tech/world/utils/MyApp;", "Landroid/app/Application;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "activityReferences", "", "isActivityChangingConfigurations", "", "<set-?>", "isHasMovedToForeground", "()Z", "mConfig", "Lcom/tech/world/activities/calling/model/EngineConfig;", "mEventHandler", "Lcom/tech/world/activities/calling/model/MyEngineEventHandler;", "mRtcEngine", "Lio/agora/rtc/RtcEngine;", "addEventHandler", "", "handler", "Lcom/tech/world/activities/calling/model/AGEventHandler;", "attachBaseContext", "base", "Landroid/content/Context;", "config", "createRtcEngine", "initEmojiKeyboard", "onActivityCreated", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "onCreate", "removeEventHandler", "rtcEngine", "Companion", "app_debug"})
public final class MyApp extends android.app.Application implements android.app.Application.ActivityLifecycleCallbacks {
    private boolean isHasMovedToForeground = false;
    private int activityReferences = 0;
    private boolean isActivityChangingConfigurations = false;
    private io.agora.rtc.RtcEngine mRtcEngine;
    private com.tech.world.activities.calling.model.EngineConfig mConfig;
    private com.tech.world.activities.calling.model.MyEngineEventHandler mEventHandler;
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.utils.MyApp.Companion Companion = null;
    private static com.tech.world.utils.MyApp mApp;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String currentChatId = "";
    private static boolean isChatActivityVisible = false;
    private static boolean isPhoneCallActivityVisible = false;
    private static boolean isBaseActivityVisible = false;
    private static boolean isIsCallActive = false;
    
    public MyApp() {
        super();
    }
    
    public final boolean isHasMovedToForeground() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.RtcEngine rtcEngine() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tech.world.activities.calling.model.EngineConfig config() {
        return null;
    }
    
    public final void addEventHandler(@org.jetbrains.annotations.Nullable()
    com.tech.world.activities.calling.model.AGEventHandler handler) {
    }
    
    public final void removeEventHandler(@org.jetbrains.annotations.Nullable()
    com.tech.world.activities.calling.model.AGEventHandler handler) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initEmojiKeyboard() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    @java.lang.Override()
    public void onActivityStarted(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityResumed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityPaused(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityStopped(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    @java.lang.Override()
    public void onActivityDestroyed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    private final void createRtcEngine() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getCurrentChatId() {
        return null;
    }
    
    private static final void setCurrentChatId(java.lang.String p0) {
    }
    
    public static final boolean isBaseActivityVisible() {
        return false;
    }
    
    private static final void setBaseActivityVisible(boolean p0) {
    }
    
    public static final boolean isIsCallActive() {
        return false;
    }
    
    private static final void setIsCallActive(boolean p0) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void chatActivityResumed(@org.jetbrains.annotations.NotNull()
    java.lang.String chatId) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void chatActivityPaused() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Context context() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u001bH\u0007J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0004H\u0007J\b\u0010 \u001a\u00020!H\u0007J\u0006\u0010\"\u001a\u00020\u001bJ\u0006\u0010#\u001a\u00020\u001bJ\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u000bR,\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@BX\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R,\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@BX\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0015\u0010\u0010R$\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/tech/world/utils/MyApp$Companion;", "", "()V", "<set-?>", "", "currentChatId", "getCurrentChatId$annotations", "getCurrentChatId", "()Ljava/lang/String;", "setCurrentChatId", "(Ljava/lang/String;)V", "", "isBaseActivityVisible", "isBaseActivityVisible$annotations", "()Z", "setBaseActivityVisible", "(Z)V", "isChatActivityVisible", "setChatActivityVisible", "isIsCallActive", "isIsCallActive$annotations", "setIsCallActive", "isPhoneCallActivityVisible", "setPhoneCallActivityVisible", "mApp", "Lcom/tech/world/utils/MyApp;", "baseActivityPaused", "", "baseActivityResumed", "chatActivityPaused", "chatActivityResumed", "chatId", "context", "Landroid/content/Context;", "phoneCallActivityPaused", "phoneCallActivityResumed", "setCallActive", "mCallActive", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrentChatId() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getCurrentChatId$annotations() {
        }
        
        private final void setCurrentChatId(java.lang.String p0) {
        }
        
        public final boolean isChatActivityVisible() {
            return false;
        }
        
        private final void setChatActivityVisible(boolean p0) {
        }
        
        public final boolean isPhoneCallActivityVisible() {
            return false;
        }
        
        private final void setPhoneCallActivityVisible(boolean p0) {
        }
        
        public final boolean isBaseActivityVisible() {
            return false;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void isBaseActivityVisible$annotations() {
        }
        
        private final void setBaseActivityVisible(boolean p0) {
        }
        
        public final boolean isIsCallActive() {
            return false;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void isIsCallActive$annotations() {
        }
        
        private final void setIsCallActive(boolean p0) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void chatActivityResumed(@org.jetbrains.annotations.NotNull()
        java.lang.String chatId) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void chatActivityPaused() {
        }
        
        public final void phoneCallActivityResumed() {
        }
        
        public final void phoneCallActivityPaused() {
        }
        
        public final void baseActivityResumed() {
        }
        
        public final void baseActivityPaused() {
        }
        
        public final void setCallActive(boolean mCallActive) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Context context() {
            return null;
        }
    }
}