package com.eaglewarrior.countriesinfoapp.repository

import android.content.Context
import com.eaglewarrior.countriesinfoapp.repository.models.Country
import com.eaglewarrior.countriesinfoapp.repository.source.local.CountriesDataService

class CountriesRepository {

    private val countriesDataService = CountriesDataService()


    fun getAllCountries(context: Context): ArrayList<Country> {
        val countriesArrayList: ArrayList<Country> = arrayListOf<Country>()
        countriesArrayList.addAll(countriesDataService.getAllCountries(context)!!)
        return countriesArrayList
    }

//    suspend fun getCountry(context: Context): Country? {
//        return countriesDataService.getCountry(context)
//    }
}
