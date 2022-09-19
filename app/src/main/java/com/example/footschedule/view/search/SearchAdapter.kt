package com.example.footschedule.view.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.footschedule.R
import com.example.footschedule.data.model.CountryItems
import com.example.footschedule.view.main.ItemClickListener
import com.squareup.picasso.Picasso

class SearchAdapter(
    private val listCountry: List<CountryItems>,
    private val cellClickListener: ItemClickListener
) : RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {

    class SearchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageFlag: ImageView = itemView.findViewById(R.id.imageFlagOfTheCountry)
        val nameCountry: TextView = itemView.findViewById(R.id.textCountry)
        val nameLeague: TextView = itemView.findViewById(R.id.textLeague)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recycler_view_choose_leagues, parent, false)
        return SearchViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        Picasso.get().load(listCountry[position].imageFlag).into(holder.imageFlag)
        holder.nameCountry.text = listCountry[position].country
        holder.nameLeague.text = listCountry[position].nameLeagues

        holder.itemView.setOnClickListener {
            cellClickListener.onCellClickListener(listCountry[position].idLeague.toString())
        }
    }

    override fun getItemCount(): Int {
        return listCountry.size
    }
}