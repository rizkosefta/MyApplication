package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class user(
    val username:String,
    val password:String
):Parcelable
