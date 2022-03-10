package com.tech.world.activities.calling;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00f6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010A\u001a\u00020BH\u0002J\u0018\u0010C\u001a\u00020B2\u0006\u0010:\u001a\u00020\u00052\u0006\u0010D\u001a\u00020$H\u0002J\b\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020BH\u0002J\b\u0010H\u001a\u00020BH\u0002J\n\u0010I\u001a\u0004\u0018\u00010JH\u0002J\b\u0010K\u001a\u00020BH\u0002J\b\u0010L\u001a\u00020@H\u0016J\b\u0010M\u001a\u00020BH\u0002J\b\u0010N\u001a\u00020BH\u0002J\b\u0010O\u001a\u000202H\u0002J\u0018\u0010P\u001a\u00020@2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010U\u001a\u00020B2\u0006\u0010V\u001a\u00020@H\u0003J\u0010\u0010W\u001a\u00020B2\u0006\u0010X\u001a\u00020@H\u0002J\b\u0010Y\u001a\u00020BH\u0002J\b\u0010Z\u001a\u00020@H\u0002J\u0018\u0010[\u001a\u00020B2\u0006\u0010:\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020@H\u0002J\u0012\u0010]\u001a\u00020B2\b\u0010^\u001a\u0004\u0018\u00010_H\u0014J\b\u0010`\u001a\u00020BH\u0014J\u001a\u0010a\u001a\u00020@2\u0006\u0010b\u001a\u00020\u00052\b\u0010Q\u001a\u0004\u0018\u00010cH\u0016J\u0012\u0010d\u001a\u00020B2\b\u0010e\u001a\u0004\u0018\u00010fH\u0014J\u0018\u0010g\u001a\u00020B2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020kH\u0016J\u0010\u0010l\u001a\u00020B2\u0006\u0010h\u001a\u00020iH\u0016J\b\u0010m\u001a\u00020BH\u0016J\b\u0010n\u001a\u00020BH\u0016J\u0010\u0010o\u001a\u00020B2\u0006\u0010p\u001a\u00020@H\u0016J\b\u0010q\u001a\u00020BH\u0002J\"\u0010r\u001a\u00020B2\u0006\u0010s\u001a\u00020@2\b\u0010S\u001a\u0004\u0018\u00010$2\u0006\u0010:\u001a\u00020\u0005H\u0002J\b\u0010t\u001a\u00020BH\u0002J\u0010\u0010u\u001a\u00020B2\u0006\u0010:\u001a\u00020\u0005H\u0002J\u0010\u0010v\u001a\u00020B2\u0006\u0010:\u001a\u00020\u0005H\u0002J\b\u0010w\u001a\u00020BH\u0002J\n\u0010x\u001a\u0004\u0018\u00010yH\u0002J\u0010\u0010z\u001a\u00020B2\u0006\u0010{\u001a\u00020|H\u0002J\u0018\u0010}\u001a\u00020B2\u0006\u0010S\u001a\u00020T2\u0006\u0010~\u001a\u00020@H\u0002J\b\u0010\u007f\u001a\u00020BH\u0002J\u0013\u0010\u0080\u0001\u001a\u00020B2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0002J\t\u0010\u0083\u0001\u001a\u00020BH\u0002J\u0013\u0010\u0084\u0001\u001a\u00020B2\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0007J\t\u0010\u0087\u0001\u001a\u00020BH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0018\u00010\u0017R\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000207X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000207X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010=\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020@0?0>X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0088\u0001"}, d2 = {"Lcom/tech/world/activities/calling/CallingActivity;", "Lcom/tech/world/activities/BaseActivity;", "Landroid/content/ServiceConnection;", "()V", "action", "", "bottomHolder", "Landroid/widget/ImageView;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "btnAnswer", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "btnFlipCamera", "Landroid/widget/ImageButton;", "btnHangup", "btnMic", "btnReject", "btnSpeaker", "btnVideo", "callDirection", "callType", "Lcom/tech/world/activities/calling/model/CallType;", "callingServiceInterface", "Lcom/tech/world/services/CallingService$CallingServiceInterface;", "Lcom/tech/world/services/CallingService;", "constraint", "Landroidx/constraintlayout/widget/ConstraintLayout;", "dx", "", "dy", "groupManager", "Lcom/tech/world/utils/network/GroupManager;", "imgUser", "lastX", "lastY", "localSurfaceView", "Landroid/view/SurfaceView;", "getLocalSurfaceView", "()Landroid/view/SurfaceView;", "setLocalSurfaceView", "(Landroid/view/SurfaceView;)V", "localViewGroup", "Landroid/widget/FrameLayout;", "getLocalViewGroup", "()Landroid/widget/FrameLayout;", "setLocalViewGroup", "(Landroid/widget/FrameLayout;)V", "localViewGroupHeight", "localViewGroupWidth", "mCallId", "", "phoneNumber", "rootHeight", "rootWidth", "tvCallType", "Landroid/widget/TextView;", "tvStatus", "tvUsername", "uid", "user", "Lcom/tech/world/model/realms/User;", "videoUids", "Ljava/util/HashMap;", "Lkotlin/Pair;", "", "addLocalView", "", "addRemoteView", "surfaceV", "application", "Lcom/tech/world/utils/MyApp;", "bindService", "calculateViewsSizes", "config", "Lcom/tech/world/activities/calling/model/EngineConfig;", "disableSpeaker", "enablePresence", "enableSpeaker", "endCall", "getCallTypeText", "handleLvgTouchEvent", "event", "Landroid/view/MotionEvent;", "view", "Landroid/view/View;", "hideOrShowButtons", "showHangup", "hideOrShowTopBottomHolders", "setHidden", "initViews", "isVideoCall", "muteOrUnMuteRemoteView", "setMuted", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "keyCode", "Landroid/view/KeyEvent;", "onNewIntent", "intent", "Landroid/content/Intent;", "onServiceConnected", "componentName", "Landroid/content/ComponentName;", "iBinder", "Landroid/os/IBinder;", "onServiceDisconnected", "onStart", "onStop", "onWindowFocusChanged", "hasFocus", "pauseLocalVideo", "preview", "start", "removeLocalView", "removeRemoteView", "renderRemoteVideo", "resumeLocalVideo", "rtcEngine", "Lio/agora/rtc/RtcEngine;", "setCallingState", "callingState", "Lcom/tech/world/activities/calling/model/CallingState;", "setIconBg", "show", "setScreenOnFlags", "setStateEvent", "stateEvent", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "setVideoStuff", "updateState", "callingViewState", "Lcom/tech/world/activities/calling/event/CallingViewState;", "updateUI", "app_debug"})
public final class CallingActivity extends com.tech.world.activities.BaseActivity implements android.content.ServiceConnection {
    private android.widget.ImageView imgUser;
    private android.widget.TextView tvUsername;
    private android.widget.TextView tvStatus;
    private android.widget.TextView tvCallType;
    private com.google.android.material.floatingactionbutton.FloatingActionButton btnAnswer;
    private com.google.android.material.floatingactionbutton.FloatingActionButton btnReject;
    private com.google.android.material.floatingactionbutton.FloatingActionButton btnHangup;
    private android.widget.ImageButton btnSpeaker;
    private android.widget.ImageButton btnMic;
    private android.widget.ImageButton btnVideo;
    private androidx.constraintlayout.widget.ConstraintLayout constraint;
    private android.widget.ImageButton btnFlipCamera;
    private android.widget.ImageView bottomHolder;
    public android.widget.FrameLayout localViewGroup;
    private float dx = 0.0F;
    private float dy = 0.0F;
    private int localViewGroupWidth = 0;
    private int localViewGroupHeight = 0;
    private int rootWidth = 0;
    private int rootHeight = 0;
    private float lastX = 0.0F;
    private float lastY = 0.0F;
    private int callDirection = 0;
    private com.tech.world.activities.calling.model.CallType callType = com.tech.world.activities.calling.model.CallType.VOICE;
    private com.tech.world.model.realms.User user;
    private java.lang.String uid;
    private java.lang.String phoneNumber;
    private java.lang.String mCallId;
    private com.tech.world.services.CallingService.CallingServiceInterface callingServiceInterface;
    private java.util.HashMap<java.lang.Integer, kotlin.Pair<android.view.SurfaceView, java.lang.Boolean>> videoUids;
    @org.jetbrains.annotations.Nullable()
    private android.view.SurfaceView localSurfaceView;
    private int action;
    private final com.tech.world.utils.network.GroupManager groupManager = null;
    private android.content.BroadcastReceiver broadcastReceiver;
    private java.util.HashMap _$_findViewCache;
    
    public CallingActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.FrameLayout getLocalViewGroup() {
        return null;
    }
    
    public final void setLocalViewGroup(@org.jetbrains.annotations.NotNull()
    android.widget.FrameLayout p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.SurfaceView getLocalSurfaceView() {
        return null;
    }
    
    public final void setLocalSurfaceView(@org.jetbrains.annotations.Nullable()
    android.view.SurfaceView p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void calculateViewsSizes() {
    }
    
    private final boolean handleLvgTouchEvent(android.view.MotionEvent event, android.view.View view) {
        return false;
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final java.lang.String getCallTypeText() {
        return null;
    }
    
    private final void setCallingState(com.tech.world.activities.calling.model.CallingState callingState) {
    }
    
    private final void hideOrShowTopBottomHolders(boolean setHidden) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void updateState(@org.jetbrains.annotations.NotNull()
    com.tech.world.activities.calling.event.CallingViewState callingViewState) {
    }
    
    private final void disableSpeaker() {
    }
    
    private final void enableSpeaker() {
    }
    
    private final void pauseLocalVideo() {
    }
    
    private final void resumeLocalVideo() {
    }
    
    private final void setVideoStuff() {
    }
    
    private final boolean isVideoCall() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void hideOrShowButtons(boolean showHangup) {
    }
    
    private final void endCall() {
    }
    
    private final void initViews() {
    }
    
    @java.lang.Override()
    public boolean enablePresence() {
        return false;
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void addLocalView() {
    }
    
    private final void removeLocalView() {
    }
    
    private final void removeRemoteView(int uid) {
    }
    
    private final void muteOrUnMuteRemoteView(int uid, boolean setMuted) {
    }
    
    private final void updateUI() {
    }
    
    private final void setIconBg(android.view.View view, boolean show) {
    }
    
    private final void setScreenOnFlags() {
    }
    
    @java.lang.Override()
    public void onServiceConnected(@org.jetbrains.annotations.NotNull()
    android.content.ComponentName componentName, @org.jetbrains.annotations.NotNull()
    android.os.IBinder iBinder) {
    }
    
    @java.lang.Override()
    public void onServiceDisconnected(@org.jetbrains.annotations.NotNull()
    android.content.ComponentName componentName) {
    }
    
    private final void bindService() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void renderRemoteVideo(int uid) {
    }
    
    private final void addRemoteView(int uid, android.view.SurfaceView surfaceV) {
    }
    
    private final void setStateEvent(com.tech.world.activities.calling.event.CallingStateEvent stateEvent) {
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
    
    private final void preview(boolean start, android.view.SurfaceView view, int uid) {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
}