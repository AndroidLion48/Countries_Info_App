package com.eaglewarrior.countriesinfoapp

import android.os.Bundle
import android.view.MenuItem
import android.view.View
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
    private lateinit var neighboringLabelTv: TextView
    // Declaring Variables

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        //Check for Bundle. Get Data from bundle

        val currentCountry: Country? = intent.getParcelableExtra("Object")

        supportActionBar?.title = currentCountry?.name
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

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
        areaTv.text = currentCountry?.area.toString()+ " km²"

        populationTv = findViewById(R.id.population_tv)
        populationTv.text = "%,d".format(currentCountry?.population)

        neighboringCountriesTv = findViewById(R.id.neighboring_countries_tv)
        neighboringCountriesTv.text = currentCountry?.borders?.joinToString()

//        neighboringLabelTv = findViewById(R.id.neighboring_label_tv)
//        if (currentCountry?.borders?.isNotEmpty() == true) {
//            neighboringLabelTv.visibility = View.VISIBLE
//            neighboringCountriesTv.visibility = View.VISIBLE
//            neighboringCountriesTv.text = currentCountry?.borders?.joinToString(", ")
//        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> finish()
        }
        return true
    }
}
