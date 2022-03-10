package com.tech.world.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u008d\u0001\u008e\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020*H\u0002J\b\u0010G\u001a\u00020HH\u0002J0\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010\u001a2\b\u0010P\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010Q\u001a\u00020JH\u0002J\u000e\u0010R\u001a\u00020J2\u0006\u0010S\u001a\u00020TJ\b\u0010U\u001a\u000203H\u0002J\u0018\u0010V\u001a\u0002032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010W\u001a\u000203H\u0002J\b\u0010X\u001a\u00020JH\u0002J\u0010\u0010Y\u001a\u00020J2\u0006\u0010Z\u001a\u000203H\u0016J\u0012\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010]\u001a\u00020^H\u0016J\b\u0010_\u001a\u00020JH\u0002J\b\u0010`\u001a\u00020JH\u0016J\u0018\u0010a\u001a\u00020J2\u0006\u0010W\u001a\u0002032\u0006\u0010b\u001a\u000203H\u0016J\b\u0010c\u001a\u00020JH\u0016J%\u0010d\u001a\u00020J2\u0006\u0010e\u001a\u0002032\u000e\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010h0gH\u0016\u00a2\u0006\u0002\u0010iJ\"\u0010j\u001a\u00020J2\b\u0010k\u001a\u0004\u0018\u00010\u001a2\u0006\u0010W\u001a\u0002032\u0006\u0010b\u001a\u000203H\u0016J\b\u0010l\u001a\u00020JH\u0016J\b\u0010m\u001a\u00020JH\u0016J \u0010n\u001a\u0002032\u0006\u0010]\u001a\u00020^2\u0006\u0010o\u001a\u0002032\u0006\u0010p\u001a\u000203H\u0016J\u0012\u0010q\u001a\u00020J2\b\u0010r\u001a\u0004\u0018\u00010^H\u0016J\u0010\u0010s\u001a\u00020J2\u0006\u0010W\u001a\u000203H\u0016J\u0018\u0010t\u001a\u00020J2\u0006\u0010W\u001a\u0002032\u0006\u0010S\u001a\u000203H\u0016J\u000e\u0010u\u001a\u00020J2\u0006\u0010v\u001a\u00020wJ\b\u0010x\u001a\u00020JH\u0002J\u0010\u0010y\u001a\u00020J2\u0006\u0010z\u001a\u000203H\u0002J\b\u0010{\u001a\u00020|H\u0002J\u0010\u0010}\u001a\u00020J2\u0006\u0010~\u001a\u00020*H\u0002J\u0011\u0010\u007f\u001a\u00020J2\u0007\u0010\u0080\u0001\u001a\u00020*H\u0002J#\u0010\u0081\u0001\u001a\u00020J2\u0007\u0010\u0082\u0001\u001a\u00020\u001a2\u0007\u0010\u0083\u0001\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020*H\u0002J\u0011\u0010\u0084\u0001\u001a\u00020J2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0085\u0001\u001a\u00020J2\u0007\u0010\u0086\u0001\u001a\u00020*J\u0017\u0010\u0087\u0001\u001a\u00020J2\u0006\u0010!\u001a\u00020\"2\u0006\u0010-\u001a\u00020*J\t\u0010\u0088\u0001\u001a\u00020JH\u0002J\t\u0010\u0089\u0001\u001a\u00020JH\u0002J\t\u0010\u008a\u0001\u001a\u00020JH\u0002J\t\u0010\u008b\u0001\u001a\u00020JH\u0003J\t\u0010\u008c\u0001\u001a\u00020JH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00060\u0016R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0010\u0010@\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020*0BX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020*0BX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u008f\u0001"}, d2 = {"Lcom/tech/world/services/CallingService;", "Landroid/app/Service;", "Lcom/tech/world/utils/ProximitySensor$Delegate;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "Lcom/tech/world/activities/calling/model/DuringCallEventHandler;", "()V", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "setAudioManager", "(Landroid/media/AudioManager;)V", "callDuration", "", "callManager", "Lcom/tech/world/utils/network/CallsManager;", "callTimeoutDeferDisposable", "Lio/reactivex/disposables/Disposable;", "callTimeoutDuration", "callingServiceInterface", "Lcom/tech/world/services/CallingService$CallingServiceInterface;", "callingState", "Lcom/tech/world/activities/calling/model/CallingState;", "channelName", "", "getChannelName", "()Ljava/lang/String;", "setChannelName", "(Ljava/lang/String;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "fireCall", "Lcom/tech/world/model/realms/FireCall;", "fireManager", "Lcom/tech/world/utils/network/FireManager;", "getFireManager", "()Lcom/tech/world/utils/network/FireManager;", "setFireManager", "(Lcom/tech/world/utils/network/FireManager;)V", "hasAnswered", "", "isCallActive", "isCallActivityVisible", "isIncoming", "isLocalVideoEnabled", "isMicMuted", "isSpeakerEnabled", "isVideoCall", "notificationId", "", "proximitySensor", "Lcom/tech/world/utils/ProximitySensor;", "getProximitySensor", "()Lcom/tech/world/utils/ProximitySensor;", "setProximitySensor", "(Lcom/tech/world/utils/ProximitySensor;)V", "ringtonePlayer", "Lcom/tech/world/utils/RingtonePlayer;", "getRingtonePlayer", "()Lcom/tech/world/utils/RingtonePlayer;", "setRingtonePlayer", "(Lcom/tech/world/utils/RingtonePlayer;)V", "timeObservable", "usersUids", "Ljava/util/HashMap;", "videoUids", "application", "Lcom/tech/world/utils/MyApp;", "areAllUsersMuted", "config", "Lcom/tech/world/activities/calling/model/EngineConfig;", "configEngine", "", "videoDimension", "Lio/agora/rtc/video/VideoEncoderConfiguration$VideoDimensions;", "fps", "Lio/agora/rtc/video/VideoEncoderConfiguration$FRAME_RATE;", "encryptionKey", "encryptionMode", "doConfigEngine", "endCall", "reason", "Lcom/tech/world/activities/calling/model/CallEndedReason;", "getNotificationId", "joinChannel", "uid", "leaveChannel", "onAudioFocusChange", "i", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCallEstablished", "onCreate", "onDecodingRemoteVideo", "elapsed", "onDestroy", "onExtraCallback", "type", "data", "", "", "(I[Ljava/lang/Object;)V", "onJoinChannelSuccess", "channel", "onProximitySensorFar", "onProximitySensorNear", "onStartCommand", "flags", "startId", "onTaskRemoved", "rootIntent", "onUserJoined", "onUserOffline", "postViewEvent", "viewEvent", "Lcom/tech/world/activities/calling/event/CallingViewState;", "rejectCall", "requestAudioFocus", "streamType", "rtcEngine", "Lio/agora/rtc/RtcEngine;", "setBluetoothHeadset", "enable", "setCallActive", "mCallActive", "setCallEnded", "callId", "otherUid", "setCallingState", "setSpeakerEnabled", "isEnabled", "startCall", "startDefer", "startForeground", "startListenForSensor", "stop", "stopListenForSensor", "CallingServiceInterface", "Companion", "app_debug"})
public final class CallingService extends android.app.Service implements com.tech.world.utils.ProximitySensor.Delegate, android.media.AudioManager.OnAudioFocusChangeListener, com.tech.world.activities.calling.model.DuringCallEventHandler {
    private com.tech.world.activities.calling.model.CallingState callingState = com.tech.world.activities.calling.model.CallingState.NONE;
    private boolean isCallActivityVisible = false;
    private boolean isSpeakerEnabled = false;
    private boolean isMicMuted = false;
    private boolean isLocalVideoEnabled = false;
    private boolean isCallActive = false;
    private boolean isIncoming = false;
    private final com.tech.world.services.CallingService.CallingServiceInterface callingServiceInterface = null;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.utils.ProximitySensor proximitySensor;
    @org.jetbrains.annotations.Nullable()
    private android.media.AudioManager audioManager;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.utils.RingtonePlayer ringtonePlayer;
    private int notificationId = -1;
    private boolean hasAnswered = false;
    private io.reactivex.disposables.Disposable timeObservable;
    private io.reactivex.disposables.Disposable callTimeoutDeferDisposable;
    @org.jetbrains.annotations.NotNull()
    private com.tech.world.utils.network.FireManager fireManager;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String channelName = "";
    private long callDuration = 0L;
    private com.tech.world.model.realms.FireCall fireCall;
    private java.util.HashMap<java.lang.Integer, java.lang.Boolean> videoUids;
    private final java.util.HashMap<java.lang.Integer, java.lang.Boolean> usersUids = null;
    private boolean isVideoCall = false;
    private final long callTimeoutDuration = 30L;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final com.tech.world.utils.network.CallsManager callManager = null;
    private android.media.AudioFocusRequest audioFocusRequest;
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.services.CallingService.Companion Companion = null;
    
    public CallingService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tech.world.utils.ProximitySensor getProximitySensor() {
        return null;
    }
    
    public final void setProximitySensor(@org.jetbrains.annotations.Nullable()
    com.tech.world.utils.ProximitySensor p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.media.AudioManager getAudioManager() {
        return null;
    }
    
    public final void setAudioManager(@org.jetbrains.annotations.Nullable()
    android.media.AudioManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tech.world.utils.RingtonePlayer getRingtonePlayer() {
        return null;
    }
    
    public final void setRingtonePlayer(@org.jetbrains.annotations.Nullable()
    com.tech.world.utils.RingtonePlayer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.utils.network.FireManager getFireManager() {
        return null;
    }
    
    public final void setFireManager(@org.jetbrains.annotations.NotNull()
    com.tech.world.utils.network.FireManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChannelName() {
        return null;
    }
    
    public final void setChannelName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void setCallEnded(java.lang.String callId, java.lang.String otherUid, boolean isIncoming) {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void stop() {
    }
    
    private final void setCallActive(boolean mCallActive) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    private final void requestAudioFocus(int streamType) {
    }
    
    private final void startForeground() {
    }
    
    private final void setBluetoothHeadset(boolean enable) {
    }
    
    @java.lang.Override()
    public void onProximitySensorNear() {
    }
    
    @java.lang.Override()
    public void onProximitySensorFar() {
    }
    
    private final void setCallingState(com.tech.world.activities.calling.model.CallingState callingState) {
    }
    
    private final void onCallEstablished() {
    }
    
    @java.lang.Override()
    public void onExtraCallback(int type, @org.jetbrains.annotations.NotNull()
    java.lang.Object[] data) {
    }
    
    @java.lang.Override()
    public void onJoinChannelSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.String channel, int uid, int elapsed) {
    }
    
    @java.lang.Override()
    public void onUserJoined(int uid) {
    }
    
    @java.lang.Override()
    public void onDecodingRemoteVideo(int uid, int elapsed) {
    }
    
    @java.lang.Override()
    public void onUserOffline(int uid, int reason) {
    }
    
    private final boolean areAllUsersMuted() {
        return false;
    }
    
    public final void endCall(@org.jetbrains.annotations.NotNull()
    com.tech.world.activities.calling.model.CallEndedReason reason) {
    }
    
    public final void setSpeakerEnabled(boolean isEnabled) {
    }
    
    @java.lang.Override()
    public void onAudioFocusChange(int i) {
    }
    
    private final void doConfigEngine() {
    }
    
    private final int joinChannel(java.lang.String channelName, int uid) {
        return 0;
    }
    
    private final void startDefer() {
    }
    
    private final void leaveChannel() {
    }
    
    public final void postViewEvent(@org.jetbrains.annotations.NotNull()
    com.tech.world.activities.calling.event.CallingViewState viewEvent) {
    }
    
    private final void configEngine(io.agora.rtc.video.VideoEncoderConfiguration.VideoDimensions videoDimension, io.agora.rtc.video.VideoEncoderConfiguration.FRAME_RATE fps, java.lang.String encryptionKey, java.lang.String encryptionMode) {
    }
    
    private final void stopListenForSensor() {
    }
    
    private final com.tech.world.utils.MyApp application() {
        return null;
    }
    
    private final io.agora.rtc.RtcEngine rtcEngine() {
        return null;
    }
    
    private final com.tech.world.activities.calling.model.EngineConfig config() {
        return null;
    }
    
    private final void startListenForSensor() {
    }
    
    private final int getNotificationId() {
        return 0;
    }
    
    public final void startCall(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.FireCall fireCall, boolean isIncoming) {
    }
    
    private final void rejectCall() {
    }
    
    @java.lang.Override()
    public void onTaskRemoved(@org.jetbrains.annotations.Nullable()
    android.content.Intent rootIntent) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/services/CallingService$CallingServiceInterface;", "Landroid/os/Binder;", "(Lcom/tech/world/services/CallingService;)V", "setStateEvent", "", "stateEvent", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "app_debug"})
    public final class CallingServiceInterface extends android.os.Binder {
        
        public CallingServiceInterface() {
            super();
        }
        
        public final void setStateEvent(@org.jetbrains.annotations.NotNull()
        com.tech.world.activities.calling.event.CallingStateEvent stateEvent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/tech/world/services/CallingService$Companion;", "", "()V", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "fireCall", "Lcom/tech/world/model/realms/FireCall;", "actionType", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getStartIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.tech.world.model.realms.FireCall fireCall, int actionType) {
            return null;
        }
    }
}