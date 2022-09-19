package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class AwayTeam(
    @SerializedName("category_id")
    val categoryId: Int?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("country_code")
    val countryCode: String?,
    @SerializedName("flag")
    val flag: String?,
    @SerializedName("foundation")
    val foundation: String?,
    @SerializedName("gender")
    val gender: String?,
    @SerializedName("has_logo")
    val hasLogo: Boolean?,
    @SerializedName("has_sub")
    val hasSub: Boolean?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("is_nationality")
    val isNationality: Boolean?,
    @SerializedName("logo")
    val logo: String?,
    @SerializedName("manager_id")
    val managerId: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("name_code")
    val nameCode: String?,
    @SerializedName("name_full")
    val nameFull: String?,
    @SerializedName("name_short")
    val nameShort: String?,
    @SerializedName("name_translations")
    val nameTranslations: NameTranslations?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("sport_id")
    val sportId: Int?,
    @SerializedName("venue_id")
    val venueId: Int?
)