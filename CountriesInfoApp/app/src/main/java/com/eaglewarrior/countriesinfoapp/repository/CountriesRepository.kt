package com.eaglewarrior.countriesinfoapp.repository

import android.content.Context
import com.eaglewarrior.countriesinfoapp.repository.models.Country
import com.eaglewarrior.countriesinfoapp.repository.source.local.CountriesDataService

class CountriesRepository {

    private val countriesDataService: CountriesDataService = CountriesDataService()


    fun getAllCountries(context: Context): List<Country>? {
        return countriesDataService.getAllCountries(context)
    }

//    suspend fun getCountry(context: Context): Country? {
//        return countriesDataService.getCountry(context)
//    }
}
