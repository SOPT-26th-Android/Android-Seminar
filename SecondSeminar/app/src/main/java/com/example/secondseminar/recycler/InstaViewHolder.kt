package com.example.secondseminar.recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.secondseminar.R

class InstaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val tv_username = itemView.findViewById<TextView>(R.id.tv_username)
    val img_contents = itemView.findViewById<ImageView>(R.id.img_contents)
    val img_profile = itemView.findViewById<ImageView>(R.id.img_profile)
    fun bind(instaData: InstaData){
        tv_username.text = instaData.name
        Glide.with(itemView).load(instaData.img_url).into(img_contents)
        Glide.with(itemView).load(instaData.img_profile).into(img_profile)
    }
}