package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class NameTranslations(
    @SerializedName("de")
    val de: String?,
    @SerializedName("el")
    val el: String?,
    @SerializedName("en")
    val en: String?,
    @SerializedName("es")
    val es: String?,
    @SerializedName("fr")
    val fr: String?,
    @SerializedName("it")
    val `it`: String?,
    @SerializedName("nl")
    val nl: String?,
    @SerializedName("pt")
    val pt: String?,
    @SerializedName("ru")
    val ru: String?,
    @SerializedName("tr")
    val tr: String?,
    @SerializedName("zh")
    val zh: String?
)