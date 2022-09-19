package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class Season(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("league_id")
    val leagueId: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("year_end")
    val yearEnd: Int?,
    @SerializedName("year_start")
    val yearStart: Int?
)