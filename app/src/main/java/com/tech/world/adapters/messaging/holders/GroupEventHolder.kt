package com.tech.world.adapters.messaging.holders

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tech.world.R
import com.tech.world.adapters.messaging.holders.base.BaseHolder
import com.tech.world.model.realms.GroupEvent
import com.tech.world.model.realms.Message
import com.tech.world.model.realms.User

 class GroupEventHolder(context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val tvGroupEvent: TextView = itemView.findViewById(R.id.tv_group_event)

     fun bind(message: Message,user: User){
         tvGroupEvent.text = GroupEvent.extractString(message.content, user.group.users)
     }


}