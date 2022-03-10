package com.tech.world.activities.main.status;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/activities/main/status/StatusFragmentEvent;", "", "()V", "OnActivityResultEvent", "StatusInsertedEvent", "Lcom/tech/world/activities/main/status/StatusFragmentEvent$OnActivityResultEvent;", "Lcom/tech/world/activities/main/status/StatusFragmentEvent$StatusInsertedEvent;", "app_debug"})
public abstract class StatusFragmentEvent {
    
    private StatusFragmentEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/tech/world/activities/main/status/StatusFragmentEvent$OnActivityResultEvent;", "Lcom/tech/world/activities/main/status/StatusFragmentEvent;", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "(IILandroid/content/Intent;)V", "getData", "()Landroid/content/Intent;", "getRequestCode", "()I", "getResultCode", "app_debug"})
    public static final class OnActivityResultEvent extends com.tech.world.activities.main.status.StatusFragmentEvent {
        private final int requestCode = 0;
        private final int resultCode = 0;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Intent data = null;
        
        public OnActivityResultEvent(int requestCode, int resultCode, @org.jetbrains.annotations.NotNull()
        android.content.Intent data) {
            super();
        }
        
        public final int getRequestCode() {
            return 0;
        }
        
        public final int getResultCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/activities/main/status/StatusFragmentEvent$StatusInsertedEvent;", "Lcom/tech/world/activities/main/status/StatusFragmentEvent;", "()V", "app_debug"})
    public static final class StatusInsertedEvent extends com.tech.world.activities.main.status.StatusFragmentEvent {
        
        public StatusInsertedEvent() {
            super();
        }
    }
}