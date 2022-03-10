package com.tech.world.activities.settings

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.canhub.cropper.CropImage
import com.tech.world.R
import com.tech.world.activities.BackupChatActivity
import com.tech.world.utils.BitmapUtils
import com.tech.world.utils.DirManager
import com.tech.world.utils.mediastore.MediaStoreUtil.getBitmapByUri
import com.tech.world.utils.SharedPreferencesManager
import java.io.IOException

class ChatSettingsPreferenceFragment : PreferenceFragmentCompat() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {


        addPreferencesFromResource(R.xml.pref_chat)
        findPreference<Preference>("wallpaper_path")?.onPreferenceClickListener = Preference.OnPreferenceClickListener {
            val dialog = AlertDialog.Builder(requireActivity())
            dialog.setPositiveButton(R.string.choose_wallpaper) { dialogInterface, i ->
                CropImage.activity()
                        .start(requireActivity(), this@ChatSettingsPreferenceFragment)
            }.setNegativeButton(R.string.restore_default_wallpaper) { dialogInterface, i -> SharedPreferencesManager.setWallpaperPath("") }.show()
            false
        }
        findPreference<Preference>("chat_backup")?.onPreferenceClickListener = Preference.OnPreferenceClickListener {
            startActivity(Intent(activity, BackupChatActivity::class.java))
            false
        }
        setHasOptionsMenu(true)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            if (resultCode == Activity.RESULT_OK) {
                val resultUri = result?.uri ?: return
                val file = DirManager.genereateWallpaperFile()
                try {
                    //copy image to the Wallpaper Folder
                    val bitmap = getBitmapByUri(requireActivity(), resultUri)

                    if (bitmap == null) {
                        Toast.makeText(activity, "could not get file", Toast.LENGTH_SHORT).show()
                        return
                    }


                    BitmapUtils.convertBitmapToJpeg(bitmap,file,100)
                    SharedPreferencesManager.setWallpaperPath(file.path)
                } catch (e: IOException) {
                    e.printStackTrace()
                    Toast.makeText(activity, R.string.error, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        return if (id == android.R.id.home) {
            true
        } else super.onOptionsItemSelected(item)
    }
} //
