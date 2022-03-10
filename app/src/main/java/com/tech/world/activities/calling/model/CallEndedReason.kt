/*
 * Created on nov 2021
 */

package com.tech.world.activities.calling.model

enum class CallEndedReason {
    UNKNOWN,
    LOCAL_HUNG_UP,
    LOCAL_REJECTED,
    ERROR,
    REMOTE_HUNG_UP,
    REMOTE_REJECTED,
    NO_ANSWER
}