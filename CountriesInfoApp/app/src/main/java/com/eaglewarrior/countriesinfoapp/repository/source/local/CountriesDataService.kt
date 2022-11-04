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






        //        val countriesAdapter = moshi.adapter(Countries::class.java)
//        countries?.let {
//          val msg = countries.fromJson(countries)
//            val msg = countries
//        }
    }

//    suspend fun getCountry(id: Int): Country {
        // Cod to get a single country from Json

//    fun getCountry(context: Context): Country? {
//        val countries = "countries.json"
//        val moshi = Moshi.Builder()
//            .add(KotlinJsonAdapterFactory())
//            .build()
//        val adapter = moshi.adapter<Country>(Countries::class.java)
//        val countryJson = context.assets.open(countries).bufferedReader().use { it.readText() }
//
//        return adapter.fromJson(countryJson)
//        // Code to get Countries from Json
//    }

}
