package com.eaglewarrior.countriesinfoapp.sharedViewHolder

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.eaglewarrior.countriesinfoapp.DetailsActivity
import com.eaglewarrior.countriesinfoapp.R
import com.eaglewarrior.countriesinfoapp.repository.models.Country

class CountriesAdapter(private val countryList: ArrayList<Country>, private val context: Context) : RecyclerView.Adapter<CountriesAdapter.ViewHolder>() {

    lateinit var currentCountry: Country


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.counties_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        currentCountry = countryList[position]
        holder.countryTitleTv.text = currentCountry.name
        holder.itemView.setOnClickListener(View.OnClickListener {
            var intent = Intent(context, DetailsActivity::class.java)

            intent.putExtra("Object", currentCountry)

            context.startActivity(intent)
        })
    }
    override fun getItemCount(): Int {
        return countryList.size
    }


    // Internal class to hold item view for use
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var countryTitleTv: TextView


        // Initialize layout objects to item view
        init {
            countryTitleTv = itemView.findViewById(R.id.country_title_tv)
            itemView.setOnClickListener(this)

        }

        // Instructions for onClickListener and it's response
        override fun onClick(view: View) {
            Toast.makeText(itemView.context, "You clicked on ${countryTitleTv.text}", Toast.LENGTH_LONG).show()
        }
    }

}
