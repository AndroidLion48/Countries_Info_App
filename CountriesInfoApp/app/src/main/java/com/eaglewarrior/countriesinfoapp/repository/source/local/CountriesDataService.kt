package com.eaglewarrior.countriesinfoapp.repository.source.local

import android.content.Context
import com.eaglewarrior.countriesinfoapp.repository.models.Countries
import com.eaglewarrior.countriesinfoapp.repository.models.Country
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory


internal class CountriesDataService {
    // Request method and URL specified in the annotation

    // FIXME: Use your own preference to make request to the api

    fun getAllCountries(context: Context): Countries? {
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
        val adapter = moshi.adapter<Countries>(Countries::class.java)
        val file = "countries.json"
        val countriesJson = context.assets.open(file).bufferedReader().use { it.readText() }

        return adapter.fromJson(countriesJson)
        // Code to get Countries from Json
    }

//    suspend fun getCountry(id: Int): Country {
//        // Cod to get a single country from Json
//    }


}

// Add any other request you'd like app to make as well.
