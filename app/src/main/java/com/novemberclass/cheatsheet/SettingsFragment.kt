package com.novemberclass.cheatsheet

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.switchmaterial.SwitchMaterial

class SettingsFragment : Fragment() {

    private lateinit var photoSwitchView: SwitchMaterial
    private lateinit var positionSwitchView: SwitchMaterial
    private lateinit var rankSwitchView: SwitchMaterial
    private lateinit var nameSwitchView: SwitchMaterial

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val sharedPreference:SharedPreference=SharedPreference(requireContext())

        val settingViewToReturn = inflater.inflate(
            R.layout.fragment_settings,
            container, false
        )

        photoSwitchView = settingViewToReturn.findViewById(R.id.photo_switch)
        positionSwitchView = settingViewToReturn.findViewById(R.id.position_switch)
        rankSwitchView = settingViewToReturn.findViewById(R.id.rank_switch)
        nameSwitchView = settingViewToReturn.findViewById(R.id.name_switch)


        if (sharedPreference.getValueBoolean("photo")!=null)
            photoSwitchView.isChecked = sharedPreference.getValueBoolean("photo")!!

        if (sharedPreference.getValueBoolean("position")!=null)
            positionSwitchView.isChecked = sharedPreference.getValueBoolean("position")!!

        if (sharedPreference.getValueBoolean("rank")!=null)
            rankSwitchView.isChecked = sharedPreference.getValueBoolean("rank")!!

        if (sharedPreference.getValueBoolean("name")!=null)
            nameSwitchView.isChecked = sharedPreference.getValueBoolean("name")!!


        photoSwitchView.setOnClickListener {
            sharedPreference.save("photo", photoSwitchView.isChecked)
        }

        positionSwitchView.setOnClickListener {
            sharedPreference.save("position", positionSwitchView.isChecked)
        }

        rankSwitchView.setOnClickListener {
            sharedPreference.save("rank", rankSwitchView.isChecked)
        }

        nameSwitchView.setOnClickListener {
            sharedPreference.save("name", nameSwitchView.isChecked)
        }

        return settingViewToReturn
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean(KEY_FOR_PHOTO,  photoSwitchView.isChecked)
    }

}