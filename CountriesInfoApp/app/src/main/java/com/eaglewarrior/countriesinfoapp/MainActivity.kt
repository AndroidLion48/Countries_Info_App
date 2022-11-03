package com.eaglewarrior.countriesinfoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.eaglewarrior.countriesinfoapp.repository.CountriesRepository
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val countriesRepository = CountriesRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch() {
            var countryList = countriesRepository.getAllCountries(context = applicationContext)
            Log.i("Response", "Show context OUTPUT")
            println(countryList) // display output with a log.i
        }


    }


}
