package com.tech.world.adapters.messaging

import com.tech.world.model.realms.Message

interface AudibleInteraction {
    fun onSeek(message:Message,progress:Int,max:Int)
}