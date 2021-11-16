package com.novemberclass.cheatsheet

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BossViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

    fun bind(bossName: String){
        val bossNameTextView:TextView = itemView.findViewById(R.id.boss_name_text_view)
        bossNameTextView.text = bossName

    }
}