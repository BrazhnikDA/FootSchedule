package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class League(
    @SerializedName("has_logo")
    val hasLogo: Boolean?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("logo")
    val logo: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("name_translations")
    val nameTranslations: NameTranslations?,
    @SerializedName("section_id")
    val sectionId: Int?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("sport_id")
    val sportId: Int?
)