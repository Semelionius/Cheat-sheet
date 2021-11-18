package com.novemberclass.cheatsheet

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.switchmaterial.SwitchMaterial



class MainActivity : AppCompatActivity() {

   // private lateinit var switchView: SwitchMaterial

    private lateinit var bottomMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreference:SharedPreference=SharedPreference(this)


        bottomMenu = findViewById(R.id.bottom_panel)

        if(savedInstanceState == null){
        val allKnownFragment: AllKnownFragment = AllKnownFragment()
        replaceFragment (allKnownFragment)
        }


        val sourceLink = Uri.parse("https://82.mchs.gov.ru/glavnoe-upravlenie/rukovodstvo")
        val sourseIntent = Intent(Intent.ACTION_VIEW, sourceLink)



        bottomMenu.setOnItemSelectedListener { item ->
            when(item.itemId) {

                R.id.all_known_menu -> {
                    val allKnownFragment = AllKnownFragment()
                    replaceFragment (allKnownFragment)
                }

                R.id.sourse_intent_menu -> {
                    startActivity(sourseIntent)
                }

                R.id.settings_menu -> {
                    val settingsFragment = SettingsFragment()
                    replaceFragment (settingsFragment)
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