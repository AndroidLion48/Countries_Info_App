//package com.eaglewarrior.countriesinfoapp.adapter
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.eaglewarrior.countriesinfoapp.R
//import com.eaglewarrior.countriesinfoapp.repository.models.moshi.CountriesResponse
//import java.io.IOException
//
///**
// * Created by Clarence E Moore on 2022-11-02.
// *
// * Description:
// *
// *
// */
//class ItemAdapter(
//    private val context: Context,
//    private val countriesResponse: ArrayList<CountriesResponse>
//    ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
//
//    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
//        val textview: TextView = view.findViewById(R.id.textView)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//        val adapterLayout = LayoutInflater.from(parent.context)
//            .inflate(R.layout.counties_list, parent, false)
//
//        return ItemViewHolder(adapterLayout)
//    }
//
////    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
////        val item = countriesResponse[position]
////        holder.textview.text = context.getText(item.)
////    }
////
////    override fun getItemCount() = countriesResponse
//
//
//
////    fun getJsonDataFromAsset(context: Context, fileName: String): String? {
////        val jsonString: String
////        try {
////            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
////        } catch (ioException: IOException) {
////            ioException.printStackTrace()
////            return null
////        }
////
////        return jsonString
////    }
//}
