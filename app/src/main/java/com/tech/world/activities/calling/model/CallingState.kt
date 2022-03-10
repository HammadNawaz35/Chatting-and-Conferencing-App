/*
 * Created on nov 2021
 */

package com.tech.world.activities.calling.model

enum class CallingState {
    NONE,
    INITIATING,
    CONNECTING,
    CONNECTED,
    FAILED,
    RECONNECTING,
    ANSWERED,
    REJECTED_BY_USER,
    NO_ANSWER,
    ERROR

}