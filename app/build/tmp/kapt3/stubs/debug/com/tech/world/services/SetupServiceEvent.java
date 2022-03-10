package com.tech.world.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/tech/world/services/SetupServiceEvent;", "", "()V", "RestoreStarted", "SetupCancelled", "SetupError", "SetupFinalizing", "SetupFinished", "SetupStarted", "Lcom/tech/world/services/SetupServiceEvent$SetupStarted;", "Lcom/tech/world/services/SetupServiceEvent$RestoreStarted;", "Lcom/tech/world/services/SetupServiceEvent$SetupFinished;", "Lcom/tech/world/services/SetupServiceEvent$SetupFinalizing;", "Lcom/tech/world/services/SetupServiceEvent$SetupCancelled;", "Lcom/tech/world/services/SetupServiceEvent$SetupError;", "app_debug"})
public abstract class SetupServiceEvent {
    
    private SetupServiceEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/services/SetupServiceEvent$SetupStarted;", "Lcom/tech/world/services/SetupServiceEvent;", "()V", "app_debug"})
    public static final class SetupStarted extends com.tech.world.services.SetupServiceEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.services.SetupServiceEvent.SetupStarted INSTANCE = null;
        
        private SetupStarted() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/services/SetupServiceEvent$RestoreStarted;", "Lcom/tech/world/services/SetupServiceEvent;", "()V", "app_debug"})
    public static final class RestoreStarted extends com.tech.world.services.SetupServiceEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.services.SetupServiceEvent.RestoreStarted INSTANCE = null;
        
        private RestoreStarted() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/services/SetupServiceEvent$SetupFinished;", "Lcom/tech/world/services/SetupServiceEvent;", "()V", "app_debug"})
    public static final class SetupFinished extends com.tech.world.services.SetupServiceEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.services.SetupServiceEvent.SetupFinished INSTANCE = null;
        
        private SetupFinished() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/services/SetupServiceEvent$SetupFinalizing;", "Lcom/tech/world/services/SetupServiceEvent;", "()V", "app_debug"})
    public static final class SetupFinalizing extends com.tech.world.services.SetupServiceEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.services.SetupServiceEvent.SetupFinalizing INSTANCE = null;
        
        private SetupFinalizing() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/services/SetupServiceEvent$SetupCancelled;", "Lcom/tech/world/services/SetupServiceEvent;", "()V", "app_debug"})
    public static final class SetupCancelled extends com.tech.world.services.SetupServiceEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.services.SetupServiceEvent.SetupCancelled INSTANCE = null;
        
        private SetupCancelled() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/tech/world/services/SetupServiceEvent$SetupError;", "Lcom/tech/world/services/SetupServiceEvent;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SetupError extends com.tech.world.services.SetupServiceEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.tech.world.services.SetupServiceEvent.SetupError copy(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
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
        
        public SetupError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getError() {
            return null;
        }
    }
}