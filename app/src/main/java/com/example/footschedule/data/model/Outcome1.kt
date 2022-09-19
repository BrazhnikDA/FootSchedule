package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class Outcome1(
    @SerializedName("change")
    val change: Int?,
    @SerializedName("value")
    val value: Double?
)