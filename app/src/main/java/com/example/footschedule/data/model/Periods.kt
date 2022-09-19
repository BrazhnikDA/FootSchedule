package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class Periods(
    @SerializedName("current")
    val current: String?,
    @SerializedName("over_time")
    val overTime: String?,
    @SerializedName("penalties")
    val penalties: String?,
    @SerializedName("period_1")
    val period1: String?,
    @SerializedName("period_2")
    val period2: String?,
    @SerializedName("period_3")
    val period3: String?,
    @SerializedName("period_4")
    val period4: String?,
    @SerializedName("period_5")
    val period5: String?,
    @SerializedName("point")
    val point: String?
)