package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class Challenge(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("league_id")
    val leagueId: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("name_translations")
    val nameTranslations: NameTranslationsX?,
    @SerializedName("order")
    val order: Int?,
    @SerializedName("priority")
    val priority: Int?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("sport_id")
    val sportId: Int?
)