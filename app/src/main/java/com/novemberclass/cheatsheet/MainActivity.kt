package com.novemberclass.cheatsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomMenu = findViewById(R.id.bottom_panel)

        val allKnownFragment: AllKnownFragment = AllKnownFragment()
        replaceFragment (allKnownFragment)


        //val bossRecyclerView: RecyclerView = findViewById(R.id.boss_recycler_view)

      //  bossRecyclerView.layoutManager =
      //      LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
      //  bossRecyclerView.adapter = BossAdapter(bossNameList)


        bottomMenu.setOnItemSelectedListener { item ->
            when(item.itemId) {

                R.id.favourites_menu -> {
                    val favouritesFragment = FavouritesFragment()
                    replaceFragment (favouritesFragment)
                }

                R.id.all_known_menu -> {
                    val allKnownFragment = AllKnownFragment()
                    replaceFragment (allKnownFragment)
                }
            }
            true
        }
    }

    private fun replaceFragment (fragment: Fragment) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

}