package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class PeriodsTime(
    @SerializedName("period_1_time")
    val period1Time: Int?,
    @SerializedName("period_2_time")
    val period2Time: Int?,
    @SerializedName("period_3_time")
    val period3Time: Int?
)