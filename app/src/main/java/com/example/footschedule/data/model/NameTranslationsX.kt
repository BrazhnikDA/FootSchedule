package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class NameTranslationsX(
    @SerializedName("en")
    val en: String?,
    @SerializedName("ru")
    val ru: String?
)