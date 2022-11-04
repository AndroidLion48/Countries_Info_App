package com.eaglewarrior.countriesinfoapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.eaglewarrior.countriesinfoapp.repository.CountriesRepository

class MainActivity : AppCompatActivity() {

    val countriesRepository = CountriesRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var countryList = countriesRepository.getAllCountries(context = applicationContext)
        Log.i("Response", "Show context OUTPUT")
        println(countryList) // display output with a log.i

    }


}
