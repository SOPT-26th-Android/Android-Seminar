package com.example.secondseminar

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class InstaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val tv_username = itemView.findViewById<TextView>(R.id.tv_username)
    val img_contents = itemView.findViewById<ImageView>(R.id.img_contents)
    fun bind(instaData: InstaData){
        tv_username.text = instaData.name
        Glide.with(itemView).load(instaData.img_url).into(img_contents)
    }
}