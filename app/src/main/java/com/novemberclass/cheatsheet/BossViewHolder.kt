package com.novemberclass.cheatsheet

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BossViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

    fun bindPhoto(bossPhoto: Int){
        val bossPhotoImageView: ImageView = itemView.findViewById(R.id.boss_photo_image_view)
        bossPhotoImageView.setImageResource(bossPhoto)
    }

    fun bindPosition(bossPosition: String){
        val bossNameTextView:TextView = itemView.findViewById(R.id.boss_position_text_view)
        bossNameTextView.text = bossPosition
    }

    fun bindRank(bossRank: String){
        val bossRankTextView: TextView = itemView.findViewById(R.id.boss_rank_text_view)
        bossRankTextView.text = bossRank
    }

    fun bindLastname(bossLastname: String){
        val bossLastnameTextView: TextView = itemView.findViewById(R.id.boss_lastname_text_view)
        bossLastnameTextView.text = bossLastname
    }

}