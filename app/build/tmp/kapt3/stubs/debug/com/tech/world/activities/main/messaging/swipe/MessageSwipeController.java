package com.tech.world.activities.main.messaging.swipe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\nH\u0016J@\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0005H\u0016J \u0010.\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0016J\u0018\u00100\u001a\u00020\"2\u0006\u0010(\u001a\u00020\n2\u0006\u00101\u001a\u00020\u001cH\u0016J\u0018\u00102\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\nH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/tech/world/activities/main/messaging/swipe/MessageSwipeController;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "context", "Landroid/content/Context;", "isGroupActive", "", "swipeControllerActions", "Lcom/tech/world/activities/main/messaging/swipe/SwipeControllerActions;", "(Landroid/content/Context;ZLcom/tech/world/activities/main/messaging/swipe/SwipeControllerActions;)V", "currentItemViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dX", "", "imageDrawable", "Landroid/graphics/drawable/Drawable;", "()Z", "setGroupActive", "(Z)V", "isVibrate", "lastReplyButtonAnimationTime", "", "mView", "Landroid/view/View;", "replyButtonProgress", "shareRound", "startTracking", "swipeBack", "convertToAbsoluteDirection", "", "flags", "layoutDirection", "convertTodp", "pixel", "drawReplyButton", "", "canvas", "Landroid/graphics/Canvas;", "getMovementFlags", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "onChildDraw", "c", "dY", "actionState", "isCurrentlyActive", "onMove", "target", "onSwiped", "direction", "setTouchListener", "app_debug"})
public final class MessageSwipeController extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
    private final android.content.Context context = null;
    private boolean isGroupActive;
    private final com.tech.world.activities.main.messaging.swipe.SwipeControllerActions swipeControllerActions = null;
    private android.graphics.drawable.Drawable imageDrawable;
    private android.graphics.drawable.Drawable shareRound;
    private androidx.recyclerview.widget.RecyclerView.ViewHolder currentItemViewHolder;
    private android.view.View mView;
    private float dX = 0.0F;
    private float replyButtonProgress = 0.0F;
    private long lastReplyButtonAnimationTime = 0L;
    private boolean swipeBack = false;
    private boolean isVibrate = false;
    private boolean startTracking = false;
    
    public MessageSwipeController(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isGroupActive, @org.jetbrains.annotations.NotNull()
    com.tech.world.activities.main.messaging.swipe.SwipeControllerActions swipeControllerActions) {
        super();
    }
    
    public final boolean isGroupActive() {
        return false;
    }
    
    public final void setGroupActive(boolean p0) {
    }
    
    @java.lang.Override()
    public int getMovementFlags(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    @java.lang.Override()
    public int convertToAbsoluteDirection(int flags, int layoutDirection) {
        return 0;
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setTouchListener(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    private final void drawReplyButton(android.graphics.Canvas canvas) {
    }
    
    private final int convertTodp(int pixel) {
        return 0;
    }
}