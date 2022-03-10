package com.tech.world.activities.calling.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0011\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0011\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$\u00a8\u0006%"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState;", "", "()V", "CallEnded", "DisableSpeaker", "EnableSpeaker", "HideAnswerButtons", "HideRemoteViews", "JoinChannelSuccess", "MicMuted", "MuteOrUnmuteRemoteViewForUid", "OnCallEstablished", "PauseLocalVideo", "RemoveRemoteViewForUid", "ResumeLocalVideo", "SetupLocalView", "SetupRemoteViewForUid", "SetupRemoteViewWithSurfaceView", "UpdateCallingState", "UpdateDuration", "Lcom/tech/world/activities/calling/event/CallingViewState$UpdateDuration;", "Lcom/tech/world/activities/calling/event/CallingViewState$JoinChannelSuccess;", "Lcom/tech/world/activities/calling/event/CallingViewState$PauseLocalVideo;", "Lcom/tech/world/activities/calling/event/CallingViewState$ResumeLocalVideo;", "Lcom/tech/world/activities/calling/event/CallingViewState$EnableSpeaker;", "Lcom/tech/world/activities/calling/event/CallingViewState$DisableSpeaker;", "Lcom/tech/world/activities/calling/event/CallingViewState$MicMuted;", "Lcom/tech/world/activities/calling/event/CallingViewState$SetupRemoteViewForUid;", "Lcom/tech/world/activities/calling/event/CallingViewState$SetupRemoteViewWithSurfaceView;", "Lcom/tech/world/activities/calling/event/CallingViewState$RemoveRemoteViewForUid;", "Lcom/tech/world/activities/calling/event/CallingViewState$HideRemoteViews;", "Lcom/tech/world/activities/calling/event/CallingViewState$MuteOrUnmuteRemoteViewForUid;", "Lcom/tech/world/activities/calling/event/CallingViewState$UpdateCallingState;", "Lcom/tech/world/activities/calling/event/CallingViewState$OnCallEstablished;", "Lcom/tech/world/activities/calling/event/CallingViewState$HideAnswerButtons;", "Lcom/tech/world/activities/calling/event/CallingViewState$SetupLocalView;", "Lcom/tech/world/activities/calling/event/CallingViewState$CallEnded;", "app_debug"})
public abstract class CallingViewState {
    
    private CallingViewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$UpdateDuration;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "duration", "", "(J)V", "getDuration", "()J", "app_debug"})
    public static final class UpdateDuration extends com.tech.world.activities.calling.event.CallingViewState {
        private final long duration = 0L;
        
        public UpdateDuration(long duration) {
            super();
        }
        
        public final long getDuration() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$JoinChannelSuccess;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "uid", "", "(I)V", "getUid", "()I", "app_debug"})
    public static final class JoinChannelSuccess extends com.tech.world.activities.calling.event.CallingViewState {
        private final int uid = 0;
        
        public JoinChannelSuccess(int uid) {
            super();
        }
        
        public final int getUid() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$PauseLocalVideo;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "()V", "app_debug"})
    public static final class PauseLocalVideo extends com.tech.world.activities.calling.event.CallingViewState {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingViewState.PauseLocalVideo INSTANCE = null;
        
        private PauseLocalVideo() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$ResumeLocalVideo;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "()V", "app_debug"})
    public static final class ResumeLocalVideo extends com.tech.world.activities.calling.event.CallingViewState {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingViewState.ResumeLocalVideo INSTANCE = null;
        
        private ResumeLocalVideo() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$EnableSpeaker;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "()V", "app_debug"})
    public static final class EnableSpeaker extends com.tech.world.activities.calling.event.CallingViewState {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingViewState.EnableSpeaker INSTANCE = null;
        
        private EnableSpeaker() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$DisableSpeaker;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "()V", "app_debug"})
    public static final class DisableSpeaker extends com.tech.world.activities.calling.event.CallingViewState {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingViewState.DisableSpeaker INSTANCE = null;
        
        private DisableSpeaker() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$MicMuted;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "setMuted", "", "(Z)V", "getSetMuted", "()Z", "app_debug"})
    public static final class MicMuted extends com.tech.world.activities.calling.event.CallingViewState {
        private final boolean setMuted = false;
        
        public MicMuted(boolean setMuted) {
            super();
        }
        
        public final boolean getSetMuted() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$SetupRemoteViewForUid;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "uid", "", "(I)V", "getUid", "()I", "app_debug"})
    public static final class SetupRemoteViewForUid extends com.tech.world.activities.calling.event.CallingViewState {
        private final int uid = 0;
        
        public SetupRemoteViewForUid(int uid) {
            super();
        }
        
        public final int getUid() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$SetupRemoteViewWithSurfaceView;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "uid", "", "surfaceView", "Landroid/view/SurfaceView;", "(ILandroid/view/SurfaceView;)V", "getSurfaceView", "()Landroid/view/SurfaceView;", "getUid", "()I", "app_debug"})
    public static final class SetupRemoteViewWithSurfaceView extends com.tech.world.activities.calling.event.CallingViewState {
        private final int uid = 0;
        @org.jetbrains.annotations.NotNull()
        private final android.view.SurfaceView surfaceView = null;
        
        public SetupRemoteViewWithSurfaceView(int uid, @org.jetbrains.annotations.NotNull()
        android.view.SurfaceView surfaceView) {
            super();
        }
        
        public final int getUid() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.SurfaceView getSurfaceView() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$RemoveRemoteViewForUid;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "uid", "", "(I)V", "getUid", "()I", "app_debug"})
    public static final class RemoveRemoteViewForUid extends com.tech.world.activities.calling.event.CallingViewState {
        private final int uid = 0;
        
        public RemoveRemoteViewForUid(int uid) {
            super();
        }
        
        public final int getUid() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$HideRemoteViews;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "()V", "app_debug"})
    public static final class HideRemoteViews extends com.tech.world.activities.calling.event.CallingViewState {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingViewState.HideRemoteViews INSTANCE = null;
        
        private HideRemoteViews() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$MuteOrUnmuteRemoteViewForUid;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "uid", "", "mute", "", "(IZ)V", "getMute", "()Z", "getUid", "()I", "app_debug"})
    public static final class MuteOrUnmuteRemoteViewForUid extends com.tech.world.activities.calling.event.CallingViewState {
        private final int uid = 0;
        private final boolean mute = false;
        
        public MuteOrUnmuteRemoteViewForUid(int uid, boolean mute) {
            super();
        }
        
        public final int getUid() {
            return 0;
        }
        
        public final boolean getMute() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$UpdateCallingState;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "callingState", "Lcom/tech/world/activities/calling/model/CallingState;", "(Lcom/tech/world/activities/calling/model/CallingState;)V", "getCallingState", "()Lcom/tech/world/activities/calling/model/CallingState;", "app_debug"})
    public static final class UpdateCallingState extends com.tech.world.activities.calling.event.CallingViewState {
        @org.jetbrains.annotations.NotNull()
        private final com.tech.world.activities.calling.model.CallingState callingState = null;
        
        public UpdateCallingState(@org.jetbrains.annotations.NotNull()
        com.tech.world.activities.calling.model.CallingState callingState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tech.world.activities.calling.model.CallingState getCallingState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$OnCallEstablished;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "()V", "app_debug"})
    public static final class OnCallEstablished extends com.tech.world.activities.calling.event.CallingViewState {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingViewState.OnCallEstablished INSTANCE = null;
        
        private OnCallEstablished() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$HideAnswerButtons;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "()V", "app_debug"})
    public static final class HideAnswerButtons extends com.tech.world.activities.calling.event.CallingViewState {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingViewState.HideAnswerButtons INSTANCE = null;
        
        private HideAnswerButtons() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$SetupLocalView;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "()V", "app_debug"})
    public static final class SetupLocalView extends com.tech.world.activities.calling.event.CallingViewState {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingViewState.SetupLocalView INSTANCE = null;
        
        private SetupLocalView() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingViewState$CallEnded;", "Lcom/tech/world/activities/calling/event/CallingViewState;", "reason", "Lcom/tech/world/activities/calling/model/CallEndedReason;", "(Lcom/tech/world/activities/calling/model/CallEndedReason;)V", "getReason", "()Lcom/tech/world/activities/calling/model/CallEndedReason;", "app_debug"})
    public static final class CallEnded extends com.tech.world.activities.calling.event.CallingViewState {
        @org.jetbrains.annotations.NotNull()
        private final com.tech.world.activities.calling.model.CallEndedReason reason = null;
        
        public CallEnded(@org.jetbrains.annotations.NotNull()
        com.tech.world.activities.calling.model.CallEndedReason reason) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tech.world.activities.calling.model.CallEndedReason getReason() {
            return null;
        }
    }
}