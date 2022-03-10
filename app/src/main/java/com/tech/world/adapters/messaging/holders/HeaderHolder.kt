package com.tech.world.adapters.messaging.holders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tech.world.R

internal class HeaderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var header: TextView = itemView.findViewById<View>(R.id.tv_day) as TextView

}