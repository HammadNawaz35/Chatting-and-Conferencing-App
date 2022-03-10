package com.tech.world.adapters.messaging.holders

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import com.tech.world.R
import com.tech.world.adapters.messaging.ContactHolderBase
import com.tech.world.adapters.messaging.ContactHolderInteraction
import com.tech.world.adapters.messaging.holders.base.BaseReceivedHolder
import com.tech.world.model.realms.Message
import com.tech.world.model.realms.User
import com.tech.world.utils.IntentUtils

class ReceivedContactHolder(context: Context, itemView: View) : BaseReceivedHolder(context, itemView),ContactHolderBase {

    private val relativeContactInfo: RelativeLayout = itemView.findViewById(R.id.relative_contact_info)
    private val tvContactName: TextView = itemView.findViewById(R.id.tv_contact_name)
    private val btnMessageContact: Button = itemView.findViewById(R.id.btn_message_contact)
    private val btnAddContact: Button = itemView.findViewById(R.id.btn_add_contact)

    override var contactHolderInteraction: ContactHolderInteraction? = null

    override fun bind(message: Message, user: User) {
        super.bind(message, user)
        //set contact name
        tvContactName.text = message.content



        //send a message to this contact if installed this app
        btnMessageContact.setOnClickListener {
            contactHolderInteraction?.onMessageClick(message.contact)
        }


        //add this contact to phonebook
        btnAddContact.setOnClickListener {
            contactHolderInteraction?.onAddContactClick(message.contact)
        }

    }


}
