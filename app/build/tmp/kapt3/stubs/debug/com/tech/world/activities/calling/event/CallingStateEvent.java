package com.tech.world.activities.calling.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u000e\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent;", "", "()V", "AnswerIncoming", "BtnVideoClicked", "EndCall", "FlipCameraClicked", "MicClicked", "OnStart", "OnStop", "OnWindowFocusChanged", "RejectIncoming", "SpeakerClicked", "StartCall", "SurfaceViewAddedForUid", "UpdateMe", "VolumeKeyPressed", "Lcom/tech/world/activities/calling/event/CallingStateEvent$SpeakerClicked;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$MicClicked;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$BtnVideoClicked;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$FlipCameraClicked;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$EndCall;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$UpdateMe;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$OnStop;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$OnStart;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$OnWindowFocusChanged;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$SurfaceViewAddedForUid;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$AnswerIncoming;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$RejectIncoming;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$VolumeKeyPressed;", "Lcom/tech/world/activities/calling/event/CallingStateEvent$StartCall;", "app_debug"})
public abstract class CallingStateEvent {
    
    private CallingStateEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$SpeakerClicked;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "()V", "app_debug"})
    public static final class SpeakerClicked extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingStateEvent.SpeakerClicked INSTANCE = null;
        
        private SpeakerClicked() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$MicClicked;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "()V", "app_debug"})
    public static final class MicClicked extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingStateEvent.MicClicked INSTANCE = null;
        
        private MicClicked() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$BtnVideoClicked;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "()V", "app_debug"})
    public static final class BtnVideoClicked extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingStateEvent.BtnVideoClicked INSTANCE = null;
        
        private BtnVideoClicked() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$FlipCameraClicked;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "()V", "app_debug"})
    public static final class FlipCameraClicked extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingStateEvent.FlipCameraClicked INSTANCE = null;
        
        private FlipCameraClicked() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$EndCall;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "()V", "app_debug"})
    public static final class EndCall extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingStateEvent.EndCall INSTANCE = null;
        
        private EndCall() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$UpdateMe;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "()V", "app_debug"})
    public static final class UpdateMe extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingStateEvent.UpdateMe INSTANCE = null;
        
        private UpdateMe() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$OnStop;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "()V", "app_debug"})
    public static final class OnStop extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingStateEvent.OnStop INSTANCE = null;
        
        private OnStop() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$OnStart;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "()V", "app_debug"})
    public static final class OnStart extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingStateEvent.OnStart INSTANCE = null;
        
        private OnStart() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$OnWindowFocusChanged;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "hasFocus", "", "(Z)V", "getHasFocus", "()Z", "app_debug"})
    public static final class OnWindowFocusChanged extends com.tech.world.activities.calling.event.CallingStateEvent {
        private final boolean hasFocus = false;
        
        public OnWindowFocusChanged(boolean hasFocus) {
            super();
        }
        
        public final boolean getHasFocus() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$SurfaceViewAddedForUid;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "uid", "", "surfaceV", "Landroid/view/SurfaceView;", "(ILandroid/view/SurfaceView;)V", "getSurfaceV", "()Landroid/view/SurfaceView;", "getUid", "()I", "app_debug"})
    public static final class SurfaceViewAddedForUid extends com.tech.world.activities.calling.event.CallingStateEvent {
        private final int uid = 0;
        @org.jetbrains.annotations.NotNull()
        private final android.view.SurfaceView surfaceV = null;
        
        public SurfaceViewAddedForUid(int uid, @org.jetbrains.annotations.NotNull()
        android.view.SurfaceView surfaceV) {
            super();
        }
        
        public final int getUid() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.SurfaceView getSurfaceV() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$AnswerIncoming;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "()V", "app_debug"})
    public static final class AnswerIncoming extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingStateEvent.AnswerIncoming INSTANCE = null;
        
        private AnswerIncoming() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$RejectIncoming;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "()V", "app_debug"})
    public static final class RejectIncoming extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingStateEvent.RejectIncoming INSTANCE = null;
        
        private RejectIncoming() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$VolumeKeyPressed;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "()V", "app_debug"})
    public static final class VolumeKeyPressed extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.activities.calling.event.CallingStateEvent.VolumeKeyPressed INSTANCE = null;
        
        private VolumeKeyPressed() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/tech/world/activities/calling/event/CallingStateEvent$StartCall;", "Lcom/tech/world/activities/calling/event/CallingStateEvent;", "fireCall", "Lcom/tech/world/model/realms/FireCall;", "isIncoming", "", "(Lcom/tech/world/model/realms/FireCall;Z)V", "getFireCall", "()Lcom/tech/world/model/realms/FireCall;", "()Z", "app_debug"})
    public static final class StartCall extends com.tech.world.activities.calling.event.CallingStateEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.tech.world.model.realms.FireCall fireCall = null;
        private final boolean isIncoming = false;
        
        public StartCall(@org.jetbrains.annotations.NotNull()
        com.tech.world.model.realms.FireCall fireCall, boolean isIncoming) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tech.world.model.realms.FireCall getFireCall() {
            return null;
        }
        
        public final boolean isIncoming() {
            return false;
        }
    }
}