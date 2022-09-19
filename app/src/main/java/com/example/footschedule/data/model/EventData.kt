package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class EventData(
    @SerializedName("data")
    val data: List<Data>,
    @SerializedName("meta")
    val meta: Meta?
)