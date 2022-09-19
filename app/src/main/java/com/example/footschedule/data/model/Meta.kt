package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("current_page")
    val currentPage: Int?,
    @SerializedName("from")
    val from: Int?,
    @SerializedName("per_page")
    val perPage: Int?,
    @SerializedName("to")
    val to: Int?
)