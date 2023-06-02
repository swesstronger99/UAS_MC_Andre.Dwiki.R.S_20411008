package com.example.gamestrore.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gamestrore.Model.DataClass
import com.example.gamestrore.R


class MyAdapter(private val context:android.content.Context, private val dataList: List<DataClass>): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recycle_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context).load(dataList[position].dataImage).into(holder.recImage)
        holder.recGame.text = dataList[position].dataName
        holder.recGenre.text = dataList[position].dataGenre
        holder.recDesc.text = dataList[position].dataDesc
    }

}

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var recImage: ImageView
    var recGame: TextView
    var recGenre: TextView
    var recDesc: TextView
    var recCard: CardView

    init {
        recImage = itemView.findViewById(R.id.recImage)
        recGame = itemView.findViewById(R.id.recGame)
        recGenre = itemView.findViewById(R.id.recGenre)
        recDesc = itemView.findViewById(R.id.recDesc)
        recCard = itemView.findViewById(R.id.reCard)
    }
}