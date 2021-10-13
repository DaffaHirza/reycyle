package com.example.reycyle

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class pahlawan(
    val imgpahlawan: Int,
    val namapahlawan: String,
    val deskripsipahlawan: String
) : Parcelable
