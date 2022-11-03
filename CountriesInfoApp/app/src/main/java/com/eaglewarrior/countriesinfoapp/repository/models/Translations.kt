package com.eaglewarrior.countriesinfoapp.repository.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Translations(
    @Json(name = "de") var de: String?,
    @Json(name = "es") var es: String?,
    @Json(name = "fr") var fr: String?,
    @Json(name = "it") var `it`: String?,
    @Json(name = "ja") var ja: String?
) : Parcelable
