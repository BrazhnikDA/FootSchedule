package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class RoundInfo(
    @SerializedName("cupRoundType")
    val cupRoundType: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("round")
    val round: Int?,
    @SerializedName("slug")
    val slug: String?
)