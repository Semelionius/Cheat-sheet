package com.novemberclass.cheatsheet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.novemberclass.cheatsheet.R.id.photo_switch

class BossAdapter(private val bossesList: List<Boss>) : RecyclerView.Adapter<BossViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BossViewHolder {


        val bossItemView =
            LayoutInflater.from(parent.context).inflate(
                R.layout.boss_list_item, parent, false)

        return BossViewHolder(bossItemView)
    }

    override fun onBindViewHolder(holder: BossViewHolder, position: Int) {


        val bossPhoto = bossesList[position].photo
        holder.bindPhoto(bossPhoto)

        val bossPosition = bossesList[position].position
        holder.bindPosition(bossPosition)

        val bossRank = bossesList[position].rank
        holder.bindRank(bossRank)

        val bossLastname = bossesList[position].lastName
        holder.bindLastname(bossLastname)
    }


    override fun getItemCount(): Int {
        return bossesList.size
    }
}