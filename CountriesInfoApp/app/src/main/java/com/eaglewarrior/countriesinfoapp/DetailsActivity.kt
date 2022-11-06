package com.eaglewarrior.countriesinfoapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.eaglewarrior.countriesinfoapp.repository.models.Country
import com.eaglewarrior.countriesinfoapp.sharedViewHolder.CountriesAdapter

class DetailsActivity : AppCompatActivity() {

    // Declaring Layout Variables
    private lateinit var countryNameTv: TextView

    // Declaring Variables

    private lateinit var adapter: CountriesAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        //Check for Bundle. Get Data from bundle

        val currentCountry: Country? = intent.getParcelableExtra("Object")

        // Initializing Variables
        countryNameTv = findViewById(R.id.country_name_tv)
        countryNameTv.text = currentCountry?.name

    }}
