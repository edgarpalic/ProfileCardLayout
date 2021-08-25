package com.edgar.profilecardlayout

data class UserProfile(val name: String, val status: Boolean, val drawableId: Int)

val userProfileList = arrayListOf<UserProfile>(
    UserProfile(name = "Bob Smith", status = true, drawableId = R.drawable.profile_picture),
    UserProfile(name = "Karen Jones", status = false, drawableId = R.drawable.profile_picture2)
)