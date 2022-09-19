package com.example.footschedule.view.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.footschedule.R
import com.example.footschedule.data.model.EventData
import com.squareup.picasso.Picasso

class MainAdapter(private val listUser: EventData,
                  private val cellClickListener: ItemClickListener):
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageTeamA: ImageView = itemView.findViewById(R.id.imageTeamA)
        val imageTeamB: ImageView = itemView.findViewById(R.id.imageTeamB)
        val nameEvent: TextView = itemView.findViewById(R.id.textEvent)
        val timeEvent: TextView = itemView.findViewById(R.id.textTimeToEvent)
        val textLeague: TextView = itemView.findViewById(R.id.textLeague)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recycler_view_schedule_of_matches, parent, false)
        return MainViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
            Picasso.get().load(listUser.data[position].homeTeam?.logo).into(holder.imageTeamA)
            Picasso.get().load(listUser.data[position].awayTeam?.logo).into(holder.imageTeamB)
            holder.nameEvent.text = listUser.data[position].name
            holder.timeEvent.text = listUser.data[position].startAt
            holder.textLeague.text = listUser.data[position].league?.name ?: "None"

            holder.itemView.setOnClickListener {
                cellClickListener.onCellClickListener(listUser.data[position].id.toString())
            }
    }

    override fun getItemCount(): Int {
        return listUser.data.size
    }
}
