package com.eaglewarrior.countriesinfoapp.repository.source.local

import android.content.Context
import com.eaglewarrior.countriesinfoapp.repository.models.Country
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.http.GET
import retrofit2.http.Path


internal class CountriesDataService {
    // Request method and URL specified in the annotation
    // Code to get Countries from Json

    // FIXME: Use your own preference to make request to the api

    @GET("countries.json")
    fun getAllCountries(@Path("country") context: Context): List<Country>? {

        val countries = "countries.json"
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
        val countriesJson = context.assets.open(countries).bufferedReader().use { it.readText() }
        val listType = Types.newParameterizedType(List::class.java, Country::class.java)
        val adapter: JsonAdapter<List<Country>> = moshi.adapter(listType)
        val countryList = adapter.fromJson(countriesJson)
        return countryList
    }
}
