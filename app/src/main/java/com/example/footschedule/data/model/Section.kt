package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class Section(
    @SerializedName("flag")
    val flag: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("priority")
    val priority: Int?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("sport_id")
    val sportId: Int?
)