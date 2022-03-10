package com.tech.world.activities

import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cjt2325.cameralibrary.ResultCodes
import com.tech.world.R
import com.tech.world.adapters.MyStatusAdapter
import com.tech.world.model.constants.MessageType
import com.tech.world.model.constants.StatusType
import com.tech.world.model.realms.Status
import com.tech.world.model.realms.TextStatus
import com.tech.world.model.realms.UserStatuses
import com.tech.world.utils.*
import com.tech.world.utils.MyApp.Companion.context
import com.tech.world.utils.mediastore.MediaStoreFileInfo
import com.tech.world.utils.mediastore.MediaStoreUtil
import com.tech.world.utils.network.FireManager.Companion.uid
import com.tech.world.utils.network.StatusManager
import com.devlomi.hidely.hidelyviews.HidelyImageView
import com.droidninja.imageeditengine.ImageEditor
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.zhihu.matisse.Matisse
import io.realm.RealmResults
import java.io.File
import java.util.*
import java.util.concurrent.TimeUnit

class MyStatusActivity : BaseActivity(), ActionMode.Callback {
    private lateinit var rvMyStatus: RecyclerView
    private lateinit var myStatusList: RealmResults<Status>
    private lateinit var adapter: MyStatusAdapter
    var actionMode: ActionMode? = null
    var selectedStatusForActionMode: MutableList<Status> = ArrayList()
    lateinit var userStatuses: UserStatuses
    private val statusManager = StatusManager()
    private var MAX_STATUS_VIDEO_TIME = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_status)
        MAX_STATUS_VIDEO_TIME = resources.getInteger(R.integer.max_status_video_time)
        rvMyStatus = findViewById(R.id.rv_my_status)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        val fabTextStatus = findViewById<FloatingActionButton>(R.id.fab_text_status)
        fab.setOnClickListener {
            val intent = Intent(this@MyStatusActivity, CameraActivity::class.java)
            intent.putExtra(IntentUtils.CAMERA_VIEW_SHOW_PICK_IMAGE_BUTTON, true)
            intent.putExtra(IntentUtils.IS_STATUS, true)
            startActivityForResult(intent, CAMERA_REQUEST)
        }
        fabTextStatus.setOnClickListener {
            startActivityForResult(
                Intent(
                    this@MyStatusActivity,
                    TextStatusActivity::class.java
                ), RC_TEXT_STATUS
            )
        }
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        getMyStatusList()
        adapter = MyStatusAdapter(myStatusList, selectedStatusForActionMode, this)
        rvMyStatus.setLayoutManager(LinearLayoutManager(this))
        rvMyStatus.setAdapter(adapter)
        adapter!!.setOnStatusClick(object : MyStatusAdapter.OnClickListener {
            override fun onStatusClick(
                view: View,
                selectedCircle: HidelyImageView,
                status: Status
            ) {
                //if there user is not in selection mode (action mode) start View the status,otherwise add the status to selection
                if (actionMode == null) {
                    val intent = Intent(this@MyStatusActivity, ViewStatusActivity::class.java)
                    intent.putExtra(IntentUtils.UID, uid)
                    startActivity(intent)
                } else {
                    if (!selectedStatusForActionMode.contains(status)) {
                        itemAddedToActionList(selectedCircle, view, status)
                    } else {
                        itemRemovedFromActionList(selectedCircle, view, status)
                    }
                }
            }

            override fun onStatusLongClick(
                view: View,
                circleImgSelected: HidelyImageView,
                status: Status
            ) {
                if (actionMode == null) {
                    startActionMode(this@MyStatusActivity)
                    itemAddedToActionList(circleImgSelected, view, status)
                }
            }
        })
        fetchSeenCount()
    }

    private fun getMyStatusList() {
        userStatuses = RealmHelper.getInstance().getUserStatuses(uid)
        myStatusList = userStatuses.getMyStatuses()
    }

    private fun itemRemovedFromActionList(
        selectedCircle: HidelyImageView,
        itemView: View,
        status: Status
    ) {
        selectedStatusForActionMode.remove(status)
        if (selectedStatusForActionMode.isEmpty()) {
            actionMode!!.finish()
        } else {
            selectedCircle.hide()
            itemView.setBackgroundColor(-1)
            actionMode!!.title = selectedStatusForActionMode.size.toString() + ""
        }
    }

    private fun itemAddedToActionList(
        selectedCircle: HidelyImageView,
        itemView: View,
        status: Status
    ) {
        selectedCircle.show()
        itemView.setBackgroundColor(resources.getColor(R.color.item_selected_background_color))
        selectedStatusForActionMode.add(status)
        actionMode!!.title = selectedStatusForActionMode.size.toString() + ""
    }

    override fun onCreateActionMode(actionMode: ActionMode, menu: Menu): Boolean {
        this.actionMode = actionMode
        actionMode.menuInflater.inflate(R.menu.menu_action_my_statuses, menu)
        actionMode.title = "1"
        return true
    }

    override fun onPrepareActionMode(actionMode: ActionMode, menu: Menu): Boolean {
        return false
    }

    override fun onActionItemClicked(actionMode: ActionMode, menuItem: MenuItem): Boolean {
        if (menuItem.itemId == R.id.menu_item_delete) {
            if (!NetworkHelper.isConnected(this)) {
                Toast.makeText(this, R.string.no_internet_connection, Toast.LENGTH_SHORT).show()
                return false
            }
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle(R.string.confirmation)
            alertDialog.setMessage(R.string.delete_status_confirmation)
            alertDialog.setNegativeButton(R.string.no, null)
            alertDialog.setPositiveButton(R.string.yes) { dialogInterface, i ->
                val progressDialog = ProgressDialog(this@MyStatusActivity)
                progressDialog.setCancelable(false)
                progressDialog.setMessage(getString(R.string.deleting))
                progressDialog.show()
                disposables.add(statusManager.deleteStatuses(selectedStatusForActionMode).subscribe(
                    {
                        adapter!!.notifyDataSetChanged()
                        progressDialog.dismiss()
                    }) { throwable: Throwable? ->
                    adapter!!.notifyDataSetChanged()
                    progressDialog.dismiss()
                })
                actionMode.finish()
            }
            alertDialog.show()
        }
        return false
    }

    override fun onDestroyActionMode(actionMode: ActionMode) {
        this.actionMode = null
        selectedStatusForActionMode.clear()
        adapter!!.notifyDataSetChanged()
    }

    override fun onBackPressed() {
        if (actionMode == null) {
            super.onBackPressed()
        } else {
            actionMode!!.finish()
        }
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_TEXT_STATUS && resultCode == RESULT_OK) {
            val textStatus: TextStatus? = data!!.getParcelableExtra(IntentUtils.EXTRA_TEXT_STATUS)
            uplaodTextStatus(textStatus)
        } else if (requestCode == ImageEditor.RC_IMAGE_EDITOR && resultCode == RESULT_OK) {
            val imagePath = data!!.getStringExtra(ImageEditor.EXTRA_EDITED_PATH)
            uploadImageStatus(imagePath)
        } else if (requestCode == CAMERA_REQUEST && resultCode != ResultCodes.CAMERA_ERROR_STATE) {
            if (resultCode == ResultCodes.IMAGE_CAPTURE_SUCCESS) {
                val path = data!!.getStringExtra(IntentUtils.EXTRA_PATH_RESULT)
                ImageEditorRequest.open(this, path)
            } else if (resultCode == ResultCodes.VIDEO_RECORD_SUCCESS) {
                val path = data!!.getStringExtra(IntentUtils.EXTRA_PATH_RESULT)
                uploadVideoStatus(path)
            } else if (resultCode == ResultCodes.PICK_IMAGE_FROM_CAMERA) {
                if (BuildVerUtil.isApi29OrAbove()) {
                    handleGalleryRequestApi29(data!!)
                } else {
                    val mPaths = Matisse.obtainPathResult(data)
                    for (mPath in mPaths) {
                        if (!FileUtils.isFileExists(mPath)) {
                            Toast.makeText(this, R.string.image_video_not_found, Toast.LENGTH_SHORT)
                                .show()
                            return
                        }
                    }

                    //Check if it's a video
                    if (FileUtils.isPickedVideo(mPaths[0])) {
                        //check if video is longer than 30sec
                        val mediaLengthInMillis = Util.getMediaLengthInMillis(this, mPaths[0])
                        val seconds = TimeUnit.MILLISECONDS.toSeconds(mediaLengthInMillis)
                        if (seconds <= MAX_STATUS_VIDEO_TIME) {
                            for (mPath in mPaths) {
                                uploadVideoStatus(mPath)
                            }
                        } else {
                            Toast.makeText(
                                this,
                                R.string.video_length_is_too_long,
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }
                    } else {
                        //if it's only one image open image editor
                        if (mPaths.size == 1) ImageEditorRequest.open(
                            this,
                            mPaths[0]
                        ) else for (path in mPaths) {
                            uploadImageStatus(path)
                        }
                    }
                }
            }
        }
    }

    //get how many users have seen this status
    private fun fetchSeenCount() {
        if (!NetworkHelper.isConnected(this)) return
        for (status in myStatusList!!) {
            FireConstants.statusCountRef.child(uid).child(status.statusId)
                .addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        if (dataSnapshot.value != null) {
                            val count = dataSnapshot.getValue(Int::class.java)!!
                            RealmHelper.getInstance().setStatusCount(status.statusId, count)
                        }
                    }

                    override fun onCancelled(databaseError: DatabaseError) {}
                })
        }
    }

    private fun uploadVideoStatus(path: String?) {
        if (!NetworkHelper.isConnected(context())) {
            Toast.makeText(this, R.string.no_internet_connection, Toast.LENGTH_SHORT).show()
            return
        }
        Toast.makeText(this, R.string.uploading_status, Toast.LENGTH_SHORT).show()
        disposables.add(
            statusManager.uploadStatus(path!!, StatusType.VIDEO, true)
                .subscribe({ status: Status? ->
                    Toast.makeText(
                        this@MyStatusActivity,
                        R.string.status_uploaded,
                        Toast.LENGTH_SHORT
                    ).show()
                }) { throwable: Throwable? ->
                    Toast.makeText(
                        this@MyStatusActivity,
                        R.string.error_uploading_status,
                        Toast.LENGTH_SHORT
                    ).show()
                })
    }

    fun uplaodTextStatus(textStatus: TextStatus?) {
        if (!NetworkHelper.isConnected(context())) {
            Toast.makeText(context(), R.string.no_internet_connection, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context(), R.string.uploading_status, Toast.LENGTH_SHORT).show()
            disposables.add(
                statusManager.uploadTextStatus(textStatus!!).subscribe({
                    Toast.makeText(
                        this@MyStatusActivity,
                        R.string.status_uploaded,
                        Toast.LENGTH_SHORT
                    ).show()
                }) { throwable: Throwable? ->
                    Toast.makeText(
                        this@MyStatusActivity,
                        R.string.error_uploading_status,
                        Toast.LENGTH_SHORT
                    ).show()
                })
        }
    }

    private fun uploadImageStatus(path: String?) {
        if (!NetworkHelper.isConnected(context())) {
            Toast.makeText(this, R.string.no_internet_connection, Toast.LENGTH_SHORT).show()
            return
        }
        Toast.makeText(this, R.string.uploading_status, Toast.LENGTH_SHORT).show()
        val mPath = compressImage(path)
        disposables.add(
            statusManager.uploadStatus(mPath, StatusType.IMAGE, false)
                .subscribe({ status: Status? ->
                    Toast.makeText(
                        this@MyStatusActivity,
                        R.string.status_uploaded,
                        Toast.LENGTH_SHORT
                    ).show()
                }) { throwable: Throwable? ->
                    Toast.makeText(
                        this@MyStatusActivity,
                        R.string.error_uploading_status,
                        Toast.LENGTH_SHORT
                    ).show()
                })
    }

    //compress image when user chooses an image from gallery
    private fun compressImage(imagePath: String?): String {
        //generate file in sent images folder
        val file = DirManager.generateFile(MessageType.SENT_IMAGE)
        //compress image and copy it to the given file
        BitmapUtils.compressImage(imagePath, file)
        return file.path
    }

    private fun handleGalleryRequestApi29(data: Intent) {
        try {
            val uris = Matisse.obtainResult(data)
            if (uris.isEmpty()) return


            if (MediaStoreFileInfo.isImageType(this, uris[0])!!) {
                //if it's only one image open image editor
                if (uris.size == 1) {
                    val file = File(this.cacheDir, uris[0].lastPathSegment)
                    MediaStoreUtil.saveUriToFile(uris[0], file)
                    ImageEditorRequest.open(
                        this,
                        file.path
                    )

                } else for (uri in uris) {
                    val file = File(this.cacheDir, uri.lastPathSegment)
                    MediaStoreUtil.saveUriToFile(uris[0], file)
                    uploadImageStatus(file.path)
                }
            } else {
                for (uri in uris) {
                    val duration = RealPathUtil.getAudioDuration(this, uri)
                    if (duration != -1) {
                        val seconds = TimeUnit.MILLISECONDS.toSeconds(duration.toLong())

                        if (seconds <= MAX_STATUS_VIDEO_TIME) {
                            val file = File(this.cacheDir, uri.lastPathSegment)

                            MediaStoreUtil.saveUriToFile(uri, file)

                            uploadVideoStatus(file.path)
                        } else {
                            Toast.makeText(
                                this,
                                MyApp.context().resources.getString(R.string.video_length_is_too_long),
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }

                }
            }
        } catch (e: Exception) {
            Toast.makeText(this, R.string.error, Toast.LENGTH_SHORT).show()
        }
    }

    override fun enablePresence(): Boolean {
        return false
    }

    companion object {
        private const val CAMERA_REQUEST = 9321

        //max duration for status video time (30sec)
        private const val RC_TEXT_STATUS = 9745
    }
}