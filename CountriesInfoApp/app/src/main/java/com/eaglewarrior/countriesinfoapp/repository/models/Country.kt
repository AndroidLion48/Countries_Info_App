package com.eaglewarrior.countriesinfoapp.repository.models

import java.io.File
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Country(
    @Json(name = "alpha2Code") var alpha2Code: String?,
    @Json(name = "alpha3Code") var alpha3Code: String?,
    @Json(name = "altSpellings") var altSpellings: List<String?>?,
    @Json(name = "area") var area: Double?, // Return on UI
    @Json(name = "borders") var borders: List<String?>?, // Return on UI
    @Json(name = "callingCodes") var callingCodes: List<String?>?,
    @Json(name = "capital") var capital: String?, // Return on UI
    @Json(name = "currencies") var currencies: List<String?>?, // Return on UI
    @Json(name = "demonym") var demonym: String?,
    @Json(name = "gini") var gini: Double?,
    @Json(name = "languages") var languages: List<String?>?, // Return on UI
    @Json(name = "latlng") var latlng: List<Double?>?,
    @Json(name = "name") var name: String?, // Return on UI
    @Json(name = "nativeName") var nativeName: String?, // Return on UI
    @Json(name = "numericCode") var numericCode: String?, // Return on UI
    @Json(name = "population") var population: Int?, // Return on UI
    @Json(name = "region") var region: String?, // Return on UI
    @Json(name = "relevance") var relevance: String?,
    @Json(name = "subregion") var subregion: String?, // Return on UI
    @Json(name = "timezones") var timezones: List<String?>?,
    @Json(name = "topLevelDomain") var topLevelDomain: List<String?>?,
    @Json(name = "translations") var translations: Translations?
) : Parcelable
