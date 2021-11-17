package com.novemberclass.cheatsheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AllKnownFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val recyclerViewToReturn =  inflater.inflate(R.layout.fragment_all_known, container, false)

        val bossRecyclerView: RecyclerView = recyclerViewToReturn.findViewById(R.id.boss_recycler_view)

          bossRecyclerView.layoutManager = LinearLayoutManager(context)

          bossRecyclerView.adapter = BossAdapter(bossesList)

        return recyclerViewToReturn
    }
}