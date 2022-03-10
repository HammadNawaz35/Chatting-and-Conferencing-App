package com.tech.world.activities

import android.Manifest
import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import androidx.appcompat.widget.Toolbar
import androidx.core.view.isVisible
import com.tech.world.R
import com.tech.world.extensions.writeFromFile
import com.tech.world.model.constants.BackupTypes
import com.tech.world.services.BackupService
import com.tech.world.services.BackupServiceEvent
import com.tech.world.utils.*
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import io.realm.internal.IOException
import kotlinx.android.synthetic.main.row_forward.*
import java.text.SimpleDateFormat
import java.util.*

class BackupChatActivity : AppCompatActivity() {
    private lateinit var tvLastBackup: TextView
    private lateinit var btnBackup: Button

    private lateinit var switchIncludeMedia: SwitchCompat
    private lateinit var layoutMediaItems: LinearLayout
    private lateinit var chbSentMediaItems: CheckBox
    private lateinit var chbReceivedMediaItems: CheckBox

    private lateinit var progressBar: ProgressBar
    private lateinit var btnCancelBackup: Button

    companion object {
        const val RC_CREATE_DOCUMENT_MEDIA = 4821
        const val RC_CREATE_DOCUMENT_DB = 4822
        const val BACKUP_FILE_EXTENSION = "fafbup"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backup_chat)

        initViews()

        subscribeObservers()

        switchIncludeMedia.isVisible = BuildVerUtil.isApi29OrAbove()

        switchIncludeMedia.setOnCheckedChangeListener { buttonView, isChecked ->
            layoutMediaItems.isVisible = isChecked
        }


        setLastBackupTime()

        btnBackup.setOnClickListener {
            if (switchIncludeMedia.isChecked) {
                pickPlaceToSaveBackupFile()
            } else {
                backupDb()
            }
        }

        btnCancelBackup.setOnClickListener {
            cancelBackup()
        }


    }


    private fun subscribeObservers() {
        BackupService.progress.observe(this) { progress ->
            progressBar.progress = progress
        }
        BackupService.event.observe(this) { event ->
            when (event) {
                is BackupServiceEvent.BackupStarted -> {
                    progressBar.isVisible = true
                    btnCancelBackup.isVisible = true
                    btnBackup.isVisible = false
                }
                is BackupServiceEvent.BackupFinished, is BackupServiceEvent.BackupError, is BackupServiceEvent.BackupCancelled -> {
                    progressBar.isVisible = false
                    btnCancelBackup.isVisible = false
                    btnBackup.isVisible = true
                    val message =
                        when (event) {
                            is BackupServiceEvent.BackupFinished -> resources.getString(R.string.backup_completed)
                            is BackupServiceEvent.BackupCancelled -> resources.getString(R.string.backup_cancelled)
                            else -> resources.getString(
                                R.string.backup_error
                            )


                        }

                    Util.showSnackbar(
                        this@BackupChatActivity,
                        message
                    )
                }
            }
        }
    }

    private fun cancelBackup() {
        startService(Intent(this, BackupService::class.java).apply {
            action = IntentUtils.ACTION_CANCEL_BACKUP
        })
    }

    //Save to external storage using uri
    private fun pickPlaceToSaveBackupFile() {
        try {
            val intent = Intent(Intent.ACTION_CREATE_DOCUMENT)
            val fileName = getBackupFileName()
            intent.putExtra(
                Intent.EXTRA_TITLE,
                fileName
            )
            intent.type = "*/*"
            startActivityForResult(intent, RC_CREATE_DOCUMENT_MEDIA)
        } catch (e: Exception) {
            Toast.makeText(
                this,
                R.string.unknown_error,
                Toast.LENGTH_SHORT
            ).show();
        }
    }

    private fun pickPlaceToSaveDbFile() {
        try {
            val intent = Intent(Intent.ACTION_CREATE_DOCUMENT)
            val fileName = RealmBackupRestore.EXPORT_REALM_FILE_NAME
            intent.putExtra(
                Intent.EXTRA_TITLE,
                fileName
            )
            intent.type = "*/*"
            startActivityForResult(intent, RC_CREATE_DOCUMENT_DB)
        } catch (e: Exception) {
            Toast.makeText(
                this,
                R.string.unknown_error,
                Toast.LENGTH_SHORT
            ).show();
        }
    }

    private fun getBackupFileName(): String {
        val date = Date()
        val sdf = SimpleDateFormat(
            "yyyyMMddSSSS",
            Locale.US
        )

        return "${sdf.format(date)}.$BACKUP_FILE_EXTENSION"
    }


    private fun backupDb() {
        try {
            if (BuildVerUtil.isApi29OrAbove()) {
                pickPlaceToSaveDbFile()
            } else {
                backupDbBelowAPi29()
            }

        } catch (e: IOException) {
            e.printStackTrace()
            Util.showSnackbar(
                this@BackupChatActivity,
                resources.getString(R.string.backup_failed)
            )
        }
        setLastBackupTime()
    }

    private fun backupDbBelowAPi29() {
        val progressDialog = ProgressDialog(this@BackupChatActivity)
        progressDialog.setTitle(R.string.backing_up)
        progressDialog.setMessage(resources.getString(R.string.backing_up_message))
        progressDialog.show()

        Dexter.withContext(this).withPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
            .withListener(object : PermissionListener {
                override fun onPermissionGranted(p0: PermissionGrantedResponse?) {
                    RealmBackupRestore().backup()
                    Util.showSnackbar(
                        this@BackupChatActivity,
                        resources.getString(R.string.backup_success)
                    )
                    progressDialog.dismiss()

                }

                override fun onPermissionDenied(p0: PermissionDeniedResponse?) = Unit

                override fun onPermissionRationaleShouldBeShown(
                    p0: PermissionRequest?,
                    p1: PermissionToken?
                ) = Unit

            })
    }

    private fun startBackupService(uri: String) {
        val backupType = when {
            chbSentMediaItems.isChecked && chbReceivedMediaItems.isChecked -> BackupTypes.SENT_AND_RECEIVED_ITEMS
            chbSentMediaItems.isChecked -> BackupTypes.SENT_ITEMS_ONLY
            chbReceivedMediaItems.isChecked -> BackupTypes.RECEIVED_ITEMS_ONLY
            else -> BackupTypes.SENT_AND_RECEIVED_VOICE
        }
        startService(Intent(this, BackupService::class.java).apply {
            action = IntentUtils.ACTION_START_BACKUP
            putExtra(IntentUtils.INTENT_EXTRA_BACKUP_TYPE, backupType)
            putExtra(IntentUtils.EXTRA_URI, uri)
        })
    }

    private fun initViews() {
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar

        tvLastBackup = findViewById(R.id.tv_last_backup)
        btnBackup = findViewById(R.id.btn_backup)
        switchIncludeMedia = findViewById(R.id.switch_include_media)
        layoutMediaItems = findViewById(R.id.layout_media_items)
        chbSentMediaItems = findViewById(R.id.chb_sent_media_items)
        chbReceivedMediaItems = findViewById(R.id.chb_received_media_items)
        progressBar = findViewById(R.id.progress)
        btnCancelBackup = findViewById(R.id.btn_cancel_backup)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setLastBackupTime() {
        val lastBackupTime = SharedPreferencesManager.getLastBackup()
        if (lastBackupTime != -1L) {
            tvLastBackup!!.visibility = View.VISIBLE
            val backupTimeStr = TimeHelper.getLastBackupTime(lastBackupTime)
            tvLastBackup!!.text = backupTimeStr
        } else tvLastBackup!!.visibility = View.GONE
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) onBackPressed()
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_CREATE_DOCUMENT_MEDIA && resultCode == RESULT_OK) {
            data?.data?.let { uri ->
                startBackupService(uri.toString())
            }
        } else if (requestCode == RC_CREATE_DOCUMENT_DB && resultCode == RESULT_OK) {
            data?.data?.let { uri ->
                val progressDialog = ProgressDialog(this@BackupChatActivity)
                progressDialog.setTitle(R.string.backing_up)
                progressDialog.setMessage(resources.getString(R.string.backing_up_message))
                progressDialog.show()
                backupDbToUri(uri)
                progressDialog.dismiss()
            }
        }
    }

    private fun backupDbToUri(uri: Uri) {
        try {

            val backup = RealmBackupRestore().backup()
            contentResolver.openOutputStream(uri)?.use {
                it.writeFromFile(backup)
            }
            Util.showSnackbar(
                this@BackupChatActivity,
                resources.getString(R.string.backup_success)
            )
        } catch (e: Exception) {

        }
    }

}