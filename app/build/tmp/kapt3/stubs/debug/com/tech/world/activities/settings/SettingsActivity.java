package com.tech.world.activities.settings;

import java.lang.System;

/**
 * A [PreferenceActivity] that presents a set of application settings. On
 * handset devices, settings are presented as a single list. On tablets,
 * settings are split by category, with category headers shown to the left of
 * the list of settings.
 *
 *
 * See [
 * * Android Design: Settings](http://developer.android.com/design/patterns/settings.html) for design guidelines and the [Settings
 * * API Guide](http://developer.android.com/guide/topics/ui/settings.html) for more information on developing a Settings UI.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002\u00a8\u0006\u000e"}, d2 = {"Lcom/tech/world/activities/settings/SettingsActivity;", "Lcom/tech/world/activities/BaseActivity;", "()V", "enablePresence", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setupActionBar", "Companion", "app_debug"})
public final class SettingsActivity extends com.tech.world.activities.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.activities.settings.SettingsActivity.Companion Companion = null;
    
    /**
     * A preference value change listener that updates the preference's summary
     * to reflect its new value.
     */
    private static final androidx.preference.Preference.OnPreferenceChangeListener sBindPreferenceSummaryToValueListener = null;
    private java.util.HashMap _$_findViewCache;
    
    public SettingsActivity() {
        super();
    }
    
    @java.lang.Override()
    public boolean enablePresence() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Set up the [android.app.ActionBar], if the API is available.
     */
    private final void setupActionBar() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/tech/world/activities/settings/SettingsActivity$Companion;", "", "()V", "sBindPreferenceSummaryToValueListener", "Landroidx/preference/Preference$OnPreferenceChangeListener;", "bindPreferenceSummaryToValue", "", "preference", "Landroidx/preference/Preference;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Binds a preference's summary to its value. More specifically, when the
         * preference's value is changed, its summary (line of text below the
         * preference title) is updated to reflect the value. The summary is also
         * immediately updated upon calling this method. The exact display format is
         * dependent on the type of preference.
         *
         * @see .sBindPreferenceSummaryToValueListener
         */
        public final void bindPreferenceSummaryToValue(@org.jetbrains.annotations.Nullable()
        androidx.preference.Preference preference) {
        }
    }
}