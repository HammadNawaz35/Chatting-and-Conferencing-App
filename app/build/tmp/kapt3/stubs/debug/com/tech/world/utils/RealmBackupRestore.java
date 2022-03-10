package com.tech.world.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/tech/world/utils/RealmBackupRestore;", "", "()V", "appFolderName", "", "realm", "Lio/realm/Realm;", "backup", "Ljava/io/File;", "copyBundledRealmFile", "oldFilePath", "outFileName", "dbPath", "restore", "", "updateLocalPaths", "", "Companion", "app_debug"})
public final class RealmBackupRestore {
    private final io.realm.Realm realm = null;
    private final java.lang.String appFolderName = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.utils.RealmBackupRestore.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BACKUP_FILE_EXTENSION = "fbup";
    private static final java.io.File EXPORT_REALM_PATH = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXPORT_REALM_FILE_NAME = "messages.fbup";
    private static final java.lang.String IMPORT_REALM_FILE_NAME = "temp.realm";
    private static final java.lang.String TAG = null;
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static final java.lang.String[] PERMISSIONS_STORAGE = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    
    public RealmBackupRestore() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {io.realm.internal.IOException.class})
    public final java.io.File backup() throws io.realm.internal.IOException {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class, com.tech.world.exceptions.BackupFileMismatchedException.class, io.realm.exceptions.RealmMigrationNeededException.class})
    public final void restore(boolean updateLocalPaths) throws java.io.IOException, com.tech.world.exceptions.BackupFileMismatchedException, io.realm.exceptions.RealmMigrationNeededException {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final java.lang.String copyBundledRealmFile(java.lang.String oldFilePath, java.lang.String outFileName) throws java.io.IOException {
        return null;
    }
    
    private final java.lang.String dbPath() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/tech/world/utils/RealmBackupRestore$Companion;", "", "()V", "BACKUP_FILE_EXTENSION", "", "EXPORT_REALM_FILE_NAME", "EXPORT_REALM_PATH", "Ljava/io/File;", "kotlin.jvm.PlatformType", "IMPORT_REALM_FILE_NAME", "PERMISSIONS_STORAGE", "", "[Ljava/lang/String;", "REQUEST_EXTERNAL_STORAGE", "", "TAG", "isBackupFileExists", "", "()Z", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isBackupFileExists() {
            return false;
        }
    }
}