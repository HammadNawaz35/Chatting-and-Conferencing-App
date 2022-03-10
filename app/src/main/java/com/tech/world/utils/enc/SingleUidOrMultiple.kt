package com.tech.world.utils.enc

/*
this class will hold either one uid or multiple uids (list)
since in E2E will accept either one card or multiple cards
 */
data class SingleUidOrMultiple(val uid: String?, val uids: List<String>?) {
}

