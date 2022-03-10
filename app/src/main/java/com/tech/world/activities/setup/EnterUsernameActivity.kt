package com.tech.world.activities.setup

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.canhub.cropper.CropImage
import com.tech.world.R
import com.tech.world.exceptions.BackupFileMismatchedException
import com.tech.world.utils.*
import com.tech.world.utils.mediastore.MediaStoreFileInfo
import com.tech.world.utils.mediastore.MediaStoreUtil
import io.realm.exceptions.RealmMigrationNeededException
import kotlinx.android.synthetic.main.activity_enter_username.*
import kotlinx.android.synthetic.main.activity_enter_username.check_text_view_number
import kotlinx.android.synthetic.main.activity_enter_username.et_username_setup
import kotlinx.android.synthetic.main.activity_enter_username.fab_setup_user
import kotlinx.android.synthetic.main.activity_enter_username.user_img_setup
import kotlinx.android.synthetic.main.activity_setup_user.*
import java.io.IOException
import java.io.InputStream
import java.util.zip.ZipInputStream

class EnterUsernameActivity : AppCompatActivity() {

    companion object {
        private const val RC_PICK_BACKUP_FILE = 74
        private const val RC_PICK_DB_FILE = 75
    }

    private val viewModel: EnterUsernameViewModel by viewModels()

    private var pickedPhoto: String? = null
    private var backupFileUri: String? = null
    private var dbFileUri: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_username)

        subscribeObservers()

        viewModel.fetchUserImage()


        if (!BuildVerUtil.isApi29OrAbove() && RealmBackupRestore.isBackupFileExists) {
            check_text_view_number.visibility = View.VISIBLE
        } else {
            check_text_view_number.visibility = View.GONE
        }

        user_img_setup.setOnClickListener { pickImage() }

        //On Done Keyboard Button Click
        et_username_setup.setOnEditorActionListener(
            TextView.OnEditorActionListener
            { _, actionId, _ ->
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    completeSetup()
                    return@OnEditorActionListener true
                }
                false
            })

        fab_setup_user.setOnClickListener {
            completeSetup()
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        if (BuildVerUtil.isApi29OrAbove()) {
            MenuInflater(this).inflate(R.menu.menu_enter_username, menu)
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_item_choose_backup) {
            pickBackupFile()
        } else if (item.itemId == R.id.menu_item_restore_db) {
            pickDbFile()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun pickImage() {
        CropImageRequest.getCropImageRequest().start(this)
    }

    private fun completeSetup() {
        //check if user not entered his username
        val userName = et_username_setup.text.toString()
        if (TextUtils.isEmpty(userName)) {
            et_username_setup.error = getString(R.string.username_is_empty)
        } else {

            if (check_text_view_number.visibility == View.VISIBLE && check_text_view_number.isChecked) {
                try {
                    //Try to restore backup if it's Below API 29
                    RealmBackupRestore().restore(false)
                } catch (e: IOException) {
                    e.printStackTrace()
                    Toast.makeText(this, R.string.error_restoring_backup, Toast.LENGTH_SHORT).show()
                } catch (e: RealmMigrationNeededException) {
                    e.printStackTrace()
                    Toast.makeText(this, R.string.error_restoring_backup, Toast.LENGTH_SHORT).show()
                } catch (e: BackupFileMismatchedException) {
                    e.printStackTrace()
                    Toast.makeText(this, R.string.backup_file_mismatched, Toast.LENGTH_SHORT).show()
                }

            }

            SharedPreferencesManager.saveSetupInfo(userName, pickedPhoto, backupFileUri, dbFileUri)
            SharedPreferencesManager.setHasEnteredUsername(true)
            SetupUserActivity.start(this, userName, pickedPhoto, backupFileUri, dbFileUri)
            finish()

        }
    }

    private fun subscribeObservers() {
        viewModel.loadUserImageLiveData.observe(this) { photoUrl ->
            loadUserPhoto(photoUrl)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            if (resultCode == Activity.RESULT_OK) {
                val resultUri = result?.uri ?: return


                val file = DirManager.getMyPhotoPath()
                try {
                    //copy image to the App Folder
                    val bitmap = MediaStoreUtil.getBitmapByUri(this, resultUri)

                    if (bitmap == null) {
                        Toast.makeText(this, "could not get file", Toast.LENGTH_SHORT).show()
                        return
                    }


                    BitmapUtils.convertBitmapToJpeg(bitmap, file)

                    Glide.with(this).load(file).into(user_img_setup!!)
                    pickedPhoto = file.path
                    progress_bar.visibility = View.GONE
                } catch (e: IOException) {
                    e.printStackTrace()
                }


            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                Toast.makeText(this, R.string.could_not_get_this_image, Toast.LENGTH_SHORT).show()
            }
        } else if (requestCode == RC_PICK_BACKUP_FILE && resultCode == RESULT_OK) {
            data?.data?.let { uri ->
                dbFileUri = null
                contentResolver.openInputStream(uri)?.use {
                    if (isBackupInfoExists(it)) {
                        backupFileUri = uri.toString()
                    } else {
                        Util.showSnackbar(this, getString(R.string.invalid_backup_file))
                    }
                }
            }
        } else if (requestCode == RC_PICK_DB_FILE && resultCode == RESULT_OK) {
            data?.data?.let { uri ->
                backupFileUri = null
                if (MediaStoreFileInfo.getFileExtensionByFileName(uri) == RealmBackupRestore.BACKUP_FILE_EXTENSION) {
                    dbFileUri = uri.toString()
                } else {
                    Util.showSnackbar(this, getString(R.string.invalid_backup_file))
                }
            }
        }


    }

    private fun isBackupInfoExists(it: InputStream): Boolean {
        val zipInputStream = ZipInputStream(it)
        var entry = zipInputStream.nextEntry
        while (entry != null) {
            if (entry.name == "/backup-info.json") {
                return true
            }
            entry = zipInputStream.nextEntry
        }
        return false
    }

    private fun loadUserPhoto(photoUrl: String) {
        //load the image
        //we are using listener to determine when the image loading is finished
        //so we can hide the progressBar

        Glide.with(this).load(photoUrl)
            .listener(object : RequestListener<Drawable> {
                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    progress_bar.visibility = View.GONE
                    return false
                }

                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    progress_bar.visibility = View.GONE
                    return false
                }

            }).into(user_img_setup)
    }

    private fun pickBackupFile() {
        try {
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
            intent.type = "*/*";
            startActivityForResult(intent, RC_PICK_BACKUP_FILE)
        } catch (e: Exception) {
            Toast.makeText(this, R.string.unknown_error, Toast.LENGTH_SHORT).show();
        }

    }

    private fun pickDbFile() {
        try {
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
            intent.type = "*/*";
            startActivityForResult(intent, RC_PICK_DB_FILE)
        } catch (e: Exception) {
            Toast.makeText(this, R.string.unknown_error, Toast.LENGTH_SHORT).show();
        }

    }
}
