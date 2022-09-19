package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class AwayScore(
    @SerializedName("current")
    val current: Int?,
    @SerializedName("display")
    val display: Int?,
    @SerializedName("normal_time")
    val normalTime: Int?,
    @SerializedName("period_1")
    val period1: Int?,
    @SerializedName("period_2")
    val period2: Int?,
    @SerializedName("period_2_tie_break")
    val period2TieBreak: Int?,
    @SerializedName("period_3")
    val period3: Int?,
    @SerializedName("period_3_tie_break")
    val period3TieBreak: Int?,
    @SerializedName("period_4")
    val period4: Int?,
    @SerializedName("point")
    val point: String?
)