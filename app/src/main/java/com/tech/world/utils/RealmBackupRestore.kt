package com.tech.world.utils

import android.Manifest
import android.util.Log
import com.tech.world.R
import com.tech.world.exceptions.BackupFileMismatchedException
import com.tech.world.model.realms.*
import com.tech.world.utils.MyApp.Companion.context
import com.tech.world.utils.network.FireManager.Companion.uid
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.exceptions.RealmMigrationNeededException
import io.realm.internal.IOException
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.*

class RealmBackupRestore {
    private val realm: Realm = Realm.getDefaultInstance()
    private val appFolderName = context().getString(R.string.app_folder_name)

    @Throws(IOException::class)
    fun backup(): File {
        // First check if we have storage permissions


        // create a backup file
        val exportRealmFile = File(EXPORT_REALM_PATH, EXPORT_REALM_FILE_NAME)

        // if backup file already exists, delete it
        exportRealmFile.delete()

        // copy current realm to backup file
        realm.writeCopyTo(exportRealmFile)
        realm.close()
        SharedPreferencesManager.setLastBackup(Date().time)

        return exportRealmFile
    }

    @Throws(
        java.io.IOException::class,
        BackupFileMismatchedException::class,
        RealmMigrationNeededException::class
    )
    fun restore(updateLocalPaths: Boolean) {

        //Restore
        val restoreFilePath = "$EXPORT_REALM_PATH/$EXPORT_REALM_FILE_NAME"
        copyBundledRealmFile(restoreFilePath, IMPORT_REALM_FILE_NAME)
        //backed up realm
        val configuration = RealmConfiguration.Builder()
            .name(IMPORT_REALM_FILE_NAME)
            .schemaVersion(MyMigration.SCHEMA_VERSION.toLong())
            .migration(MyMigration())
            .build()
        val realm = Realm.getInstance(configuration)
        val currentUserInfo = realm.where(CurrentUserInfo::class.java).findFirst()

        if (currentUserInfo != null && currentUserInfo.uid == uid) {

            val messages = realm.where(Message::class.java).findAll()
            val chats = realm.where(Chat::class.java).findAll()
            val groups = realm.where(Group::class.java).findAll()
            val calls = realm.where(FireCall::class.java).findAll()
            val broadcasts = realm.where(Broadcast::class.java).findAll()

            val instance = RealmHelper.getInstance()

            for (m in messages) {
                val message = m.clonedMessage
                if (updateLocalPaths) {
                    val localPath = message.localPath

                    if (!localPath.isNullOrEmpty()) {
                        val substring = localPath.substringAfter("/$appFolderName/")
                        val newPath = "${DirManager.mainAppFolder()}/$substring"
                        message.localPath = newPath
                    }
                }
                instance.saveObjectToRealm(message)
            }
            for (group in groups) {
                instance.saveObjectToRealm(group)
            }
            for (chat in chats) {
                instance.migrateChat(chat)
            }
            for (call in calls) {
                instance.saveObjectToRealm(call)
            }
            for (broadcast in broadcasts) {
                instance.saveObjectToRealm(broadcast)
            }
        } else {
            throw BackupFileMismatchedException()
        }
        realm.close()
        Realm.deleteRealm(configuration)
    }

    @Throws(java.io.IOException::class)
    private fun copyBundledRealmFile(oldFilePath: String, outFileName: String): String {
        val file = File(context().filesDir, outFileName)
        FileUtils.deleteFile(file.path)
        val outputStream = FileOutputStream(file)
        val inputStream = FileInputStream(File(oldFilePath))
        val buf = ByteArray(1024)
        var bytesRead: Int
        while (inputStream.read(buf).also { bytesRead = it } > 0) {
            outputStream.write(buf, 0, bytesRead)
        }
        outputStream.close()
        return file.absolutePath
    }

    private fun dbPath(): String {
        return realm.path
    }

    companion object {
        const val BACKUP_FILE_EXTENSION = "fbup"
        private val EXPORT_REALM_PATH = DirManager.getDatabasesFolder()
        const val EXPORT_REALM_FILE_NAME = "messages.$BACKUP_FILE_EXTENSION"
        private const val IMPORT_REALM_FILE_NAME = "temp.realm"
        private val TAG = RealmBackupRestore::class.java.name

        // Storage Permissions
        private const val REQUEST_EXTERNAL_STORAGE = 1
        private val PERMISSIONS_STORAGE = arrayOf(
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
        val isBackupFileExists: Boolean
            get() {
                val exportRealmFile = File(EXPORT_REALM_PATH, EXPORT_REALM_FILE_NAME)
                return exportRealmFile.exists() && exportRealmFile.length() > 0
            }
    }

}
