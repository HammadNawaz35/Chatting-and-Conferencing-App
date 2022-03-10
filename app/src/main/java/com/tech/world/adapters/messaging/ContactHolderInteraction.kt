package com.tech.world.adapters.messaging

import com.tech.world.model.realms.RealmContact

interface ContactHolderInteraction {
    fun onMessageClick(contact:RealmContact)
    fun onAddContactClick(contact:RealmContact)
}