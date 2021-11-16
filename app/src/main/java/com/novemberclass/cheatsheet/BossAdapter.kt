package com.novemberclass.cheatsheet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BossAdapter(private val bossNameList: List<String>) : RecyclerView.Adapter<BossViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BossViewHolder {

        val bossItemView =
            LayoutInflater.from(parent.context).inflate(
                R.layout.boss_list_item, parent, false)

        return BossViewHolder(bossItemView)
    }

    override fun onBindViewHolder(holder: BossViewHolder, position: Int) {
        val bossName = bossNameList[position]
        holder.bind(bossName)
    }

    override fun getItemCount(): Int {
        return bossNameList.size
    }
}