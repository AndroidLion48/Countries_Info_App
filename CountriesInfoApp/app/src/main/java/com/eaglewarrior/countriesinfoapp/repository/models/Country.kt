package com.eaglewarrior.countriesinfoapp.repository.models


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
    @Json(name = "area") var area: Double?,
    @Json(name = "borders") var borders: List<String?>?,
    @Json(name = "callingCodes") var callingCodes: List<String?>?,
    @Json(name = "capital") var capital: String?,
    @Json(name = "currencies") var currencies: List<String?>?,
    @Json(name = "demonym") var demonym: String?,
    @Json(name = "gini") var gini: Double?,
    @Json(name = "languages") var languages: List<String?>?,
    @Json(name = "latlng") var latlng: List<Double?>?,
    @Json(name = "name") var name: String?,
    @Json(name = "nativeName") var nativeName: String?,
    @Json(name = "numericCode") var numericCode: String?,
    @Json(name = "population") var population: Int?,
    @Json(name = "region") var region: String?,
    @Json(name = "relevance") var relevance: String?,
    @Json(name = "subregion") var subregion: String?,
    @Json(name = "timezones") var timezones: List<String?>?,
    @Json(name = "topLevelDomain") var topLevelDomain: List<String?>?,
    @Json(name = "translations") var translations: Translations?
) : Parcelable
