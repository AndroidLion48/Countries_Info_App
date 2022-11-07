package com.eaglewarrior.countriesinfoapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.eaglewarrior.countriesinfoapp.repository.models.Country
import com.eaglewarrior.countriesinfoapp.sharedViewHolder.CountriesAdapter

class DetailsActivity : AppCompatActivity() {

    // Declaring Layout Variables
    private lateinit var countryNameTv: TextView
    private lateinit var capitalCityTv: TextView
    private lateinit var populationTv: TextView
    private lateinit var regionTv: TextView
    private lateinit var subRegionTv: TextView
    private lateinit var areaTv: TextView
    private lateinit var currenciesTv: TextView
    private lateinit var languageTv: TextView
    private lateinit var neighboringCountriesTv: TextView
    // Declaring Variables

    private lateinit var adapter: CountriesAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        //Check for Bundle. Get Data from bundle

        val currentCountry: Country? = intent.getParcelableExtra("Object")

        // Initializing Variables
        countryNameTv = findViewById(R.id.country_name_tv)
        countryNameTv.text = currentCountry?.nativeName

        regionTv = findViewById(R.id.region_tv)
        regionTv.text = currentCountry?.region

        subRegionTv = findViewById(R.id.sub_region_tv)
        subRegionTv.text = currentCountry?.region

        capitalCityTv = findViewById(R.id.capital_city_tv)
        capitalCityTv.text = currentCountry?.capital

        languageTv = findViewById(R.id.languages_tv)
        languageTv.text = currentCountry?.languages?.joinToString(", ")

        currenciesTv = findViewById(R.id.currencies_tv)
        currenciesTv.text = currentCountry?.currencies?.joinToString(", ")

        areaTv = findViewById(R.id.area_tv)
        areaTv.text = currentCountry?.area.toString()

        populationTv = findViewById(R.id.population_tv)
        populationTv.text = currentCountry?.population?.toString()

        neighboringCountriesTv = findViewById(R.id.neighboring_countries_tv)
        neighboringCountriesTv.text = currentCountry?.borders?.joinToString(", ")

    }}
