package com.eaglewarrior.countriesinfoapp.repository

import android.content.Context
import com.eaglewarrior.countriesinfoapp.repository.models.Countries
import com.eaglewarrior.countriesinfoapp.repository.models.Country
import com.eaglewarrior.countriesinfoapp.repository.source.local.CountriesDataService

class CountriesRepository {

    private val countriesDataService: CountriesDataService = CountriesDataService()


    suspend fun getAllCountries(context: Context): Countries? {
        return countriesDataService.getAllCountries(context)
    }

//    suspend fun getCountry(val id: Int): Country {
//        return null
//    }
}
