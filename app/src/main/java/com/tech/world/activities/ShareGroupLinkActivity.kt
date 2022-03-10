package com.tech.world.activities

import android.widget.LinearLayout
import android.widget.TextView
import com.tech.world.views.TextViewDrawableCompat
import android.widget.ProgressBar
import android.os.Bundle
import com.tech.world.R
import com.tech.world.utils.IntentUtils
import com.tech.world.utils.RealmHelper
import com.tech.world.utils.GroupLinkUtil
import com.tech.world.utils.GroupLinkUtil.FetchCurrentLinkCallback
import android.content.Intent
import com.tech.world.activities.ForwardActivity
import com.tech.world.activities.ShareGroupLinkActivity
import com.tech.world.utils.ClipboardUtil
import android.widget.Toast
import com.tech.world.utils.GroupLinkUtil.GenerateLinkCallback
import android.app.Activity
import android.os.Parcelable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tech.world.model.constants.MessageType
import com.tech.world.model.realms.Group
import com.tech.world.model.realms.User
import com.tech.world.utils.MessageCreator
import com.tech.world.utils.ServiceHelper
import java.util.ArrayList

class ShareGroupLinkActivity : AppCompatActivity() {
    private lateinit var shareLinkLayout: LinearLayout
    private lateinit var tvGroupLink: TextView
    private lateinit var tvSendLinkViaFireapp: TextViewDrawableCompat
    private lateinit var tvCopyLink: TextViewDrawableCompat
    private lateinit var tvShareLink: TextViewDrawableCompat
    private lateinit var tvRevokeLink: TextViewDrawableCompat
    private lateinit var progressBar: ProgressBar
    private lateinit var group: Group

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_group_link)
        shareLinkLayout = findViewById(R.id.share_link_layout)
        tvGroupLink = findViewById(R.id.tv_group_link)
        tvSendLinkViaFireapp = findViewById(R.id.tv_send_link_via_fireapp)
        tvCopyLink = findViewById(R.id.tv_copy_link)
        tvShareLink = findViewById(R.id.tv_share_link)
        tvRevokeLink = findViewById(R.id.tv_revoke_link)
        progressBar = findViewById(R.id.progress_bar)
        val sendLinkText = String.format(getString(R.string.send_link_via_fireapp), getString(R.string.app_name))
        tvSendLinkViaFireapp.text = sendLinkText

        val groupId = intent.getStringExtra(IntentUtils.EXTRA_GROUP_ID)
        val user = RealmHelper.getInstance().getUser(groupId)

        //if there is no group link exists in Realm disable clicks
        //then start to fetch the link, if the link was not created before,
        //create a new one and save it to realm
        disableClicks()

        if (user != null && user.group != null) {
            group = user.group
            if (group.currentGroupLink.isNullOrEmpty()) {
                tvGroupLink.setText(R.string.no_link_gnerated)
                GroupLinkUtil.getLinkAndFetchNewOneIfNotExists(groupId, object : FetchCurrentLinkCallback {
                    override fun onFetch(groupLink: String) {
                        enableClicks()
                        setLinkText(groupLink)
                    }

                    override fun onFailed() {
                        disableClicks()
                    }
                })

            } else {
                enableClicks()
                setLinkText(group.currentGroupLink)
            }
        }

        tvSendLinkViaFireapp.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@ShareGroupLinkActivity, ForwardActivity::class.java)
            startActivityForResult(intent, REQUEST_SHARE_VIA_FIREAPP)
        })
        shareLinkLayout.setOnClickListener(View.OnClickListener {
            if (group.currentGroupLink != null) {
                startActivity(IntentUtils.getShareTextIntent(link))
            }
        })
        tvCopyLink.setOnClickListener(View.OnClickListener {
            ClipboardUtil.copyTextToClipboard(this@ShareGroupLinkActivity, link)
            Toast.makeText(this@ShareGroupLinkActivity, R.string.copied_to_clipboard, Toast.LENGTH_SHORT).show()
        })
        tvShareLink.setOnClickListener(View.OnClickListener { startActivity(IntentUtils.getShareTextIntent(link)) })
        tvRevokeLink.setOnClickListener(View.OnClickListener {
            hideOrShowProgress(true)
            GroupLinkUtil.generateLink(groupId, object : GenerateLinkCallback {
                override fun onGenerate(groupLink: String) {
                    setLinkText(groupLink)
                    hideOrShowProgress(false)
                }

                override fun onFailed() {}
            })
        })
    }

    private fun setLinkText(groupLink: String) {
        tvGroupLink.text = GroupLinkUtil.getFinalLink(groupLink)
    }

    private val link: String
        private get() = tvGroupLink.text.toString()

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_SHARE_VIA_FIREAPP && resultCode == RESULT_OK) {

            val selectedUsers: ArrayList<User>? = data!!.getParcelableArrayListExtra(IntentUtils.EXTRA_DATA_RESULT)

            val link = link
            if (selectedUsers != null){
                for (selectedUser in selectedUsers) {
                    val message = MessageCreator.Builder(selectedUser, MessageType.SENT_TEXT).text(link).build()
                    if (message != null) {
                        ServiceHelper.startNetworkRequest(this, message.messageId, message.chatId)
                    }
                }
                Toast.makeText(this, R.string.sending_messages, Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun disableClicks() {
        tvShareLink.isEnabled = false
        tvSendLinkViaFireapp.isEnabled = false
        tvRevokeLink.isEnabled = false
        tvCopyLink.isEnabled = false
        shareLinkLayout.isEnabled = false
        hideOrShowProgress(true)
    }

    private fun hideOrShowProgress(showProgress: Boolean) {
        progressBar.visibility = if (showProgress) View.VISIBLE else View.GONE
        shareLinkLayout.visibility = if (showProgress) View.GONE else View.VISIBLE
    }

    private fun enableClicks() {
        tvShareLink.isEnabled = true
        tvSendLinkViaFireapp.isEnabled = true
        tvRevokeLink.isEnabled = true
        tvCopyLink.isEnabled = true
        shareLinkLayout.isEnabled = true
        hideOrShowProgress(false)
    }

    companion object {
        private const val REQUEST_SHARE_VIA_FIREAPP = 23
    }
}