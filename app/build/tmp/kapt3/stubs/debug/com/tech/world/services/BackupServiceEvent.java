package com.tech.world.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/tech/world/services/BackupServiceEvent;", "", "()V", "BackupCancelled", "BackupError", "BackupFinished", "BackupStarted", "Lcom/tech/world/services/BackupServiceEvent$BackupStarted;", "Lcom/tech/world/services/BackupServiceEvent$BackupFinished;", "Lcom/tech/world/services/BackupServiceEvent$BackupCancelled;", "Lcom/tech/world/services/BackupServiceEvent$BackupError;", "app_debug"})
public abstract class BackupServiceEvent {
    
    private BackupServiceEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/services/BackupServiceEvent$BackupStarted;", "Lcom/tech/world/services/BackupServiceEvent;", "()V", "app_debug"})
    public static final class BackupStarted extends com.tech.world.services.BackupServiceEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.services.BackupServiceEvent.BackupStarted INSTANCE = null;
        
        private BackupStarted() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/services/BackupServiceEvent$BackupFinished;", "Lcom/tech/world/services/BackupServiceEvent;", "()V", "app_debug"})
    public static final class BackupFinished extends com.tech.world.services.BackupServiceEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.services.BackupServiceEvent.BackupFinished INSTANCE = null;
        
        private BackupFinished() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/services/BackupServiceEvent$BackupCancelled;", "Lcom/tech/world/services/BackupServiceEvent;", "()V", "app_debug"})
    public static final class BackupCancelled extends com.tech.world.services.BackupServiceEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.services.BackupServiceEvent.BackupCancelled INSTANCE = null;
        
        private BackupCancelled() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/tech/world/services/BackupServiceEvent$BackupError;", "Lcom/tech/world/services/BackupServiceEvent;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class BackupError extends com.tech.world.services.BackupServiceEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.tech.world.services.BackupServiceEvent.BackupError copy(@org.jetbrains.annotations.NotNull()
        java.lang.Exception error) {
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
        
        public BackupError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getError() {
            return null;
        }
    }
}