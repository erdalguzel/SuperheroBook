package com.example.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class HeroRecyclerAdapter(val heroList: ArrayList<String>, val heroImage: ArrayList<Int>) :
    RecyclerView.Adapter<HeroRecyclerAdapter.HeroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val inflater =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return HeroViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.itemView.heroNameText.text = heroList[position]
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, RepresentationActivity::class.java)
            intent.putExtra("charName", heroList[position])
            intent.putExtra("charImage", heroImage[position])
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return heroList.size
    }

    class HeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}