package com.tech.world.activities.calling.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J%\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH&\u00a2\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&\u00a8\u0006\u0013"}, d2 = {"Lcom/tech/world/activities/calling/model/DuringCallEventHandler;", "Lcom/tech/world/activities/calling/model/AGEventHandler;", "onDecodingRemoteVideo", "", "uid", "", "elapsed", "onExtraCallback", "type", "data", "", "", "(I[Ljava/lang/Object;)V", "onJoinChannelSuccess", "channel", "", "onUserJoined", "onUserOffline", "reason", "app_debug"})
public abstract interface DuringCallEventHandler extends com.tech.world.activities.calling.model.AGEventHandler {
    
    public abstract void onUserJoined(int uid);
    
    public abstract void onDecodingRemoteVideo(int uid, int elapsed);
    
    public abstract void onJoinChannelSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.String channel, int uid, int elapsed);
    
    public abstract void onUserOffline(int uid, int reason);
    
    public abstract void onExtraCallback(int type, @org.jetbrains.annotations.NotNull()
    java.lang.Object[] data);
}