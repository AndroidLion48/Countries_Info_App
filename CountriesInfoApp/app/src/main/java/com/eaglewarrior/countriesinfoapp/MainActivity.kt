package com.eaglewarrior.countriesinfoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eaglewarrior.countriesinfoapp.repository.CountriesRepository
import com.eaglewarrior.countriesinfoapp.repository.models.Country
import com.eaglewarrior.countriesinfoapp.sharedViewHolder.CountriesAdapter

class MainActivity : AppCompatActivity() {

    // Declaring Layout Variables
    private lateinit var recyclerView: RecyclerView

    // Declaring Variables
    val countriesRepository = CountriesRepository()
    private var countryList = ArrayList<Country>()

    private lateinit var adapter: CountriesAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = getString(R.string.main_activity_title)
        // Initializing Variables
        recyclerView = findViewById(R.id.recycler_view)
        countryList = countriesRepository.getAllCountries(context = this)

        // Initializing adapter
        adapter = CountriesAdapter(countryList, this)

        // Setting up recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}
