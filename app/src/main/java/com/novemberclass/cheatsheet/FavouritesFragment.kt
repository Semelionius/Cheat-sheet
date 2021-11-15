package com.novemberclass.cheatsheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FavouritesFragment : Fragment() {

    private lateinit var favouritesButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewToReturn = inflater.inflate(R.layout.fragment_favourites,
            container, false)

        favouritesButton = viewToReturn.findViewById(R.id.favourites_Button)

        val allKnownFragment = AllKnownFragment()

        favouritesButton.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, allKnownFragment)
                ?.commit()

        }

        return viewToReturn
    }

}