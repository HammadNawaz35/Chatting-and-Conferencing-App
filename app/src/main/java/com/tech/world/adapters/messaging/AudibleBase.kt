package com.tech.world.adapters.messaging

import androidx.lifecycle.LiveData
import com.tech.world.model.AudibleState

interface AudibleBase {
    var audibleState: LiveData<Map<String, AudibleState>>?
    var audibleInteraction:AudibleInteraction?
}