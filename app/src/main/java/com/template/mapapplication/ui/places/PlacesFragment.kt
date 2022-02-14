package com.template.mapapplication.ui.places

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import by.kirich1409.viewbindingdelegate.CreateMethod
import by.kirich1409.viewbindingdelegate.viewBinding
import com.template.mapapplication.R
import com.template.mapapplication.databinding.FragmentPlacesBinding

class PlacesFragment : Fragment(R.layout.fragment_places) {
    private val binding: FragmentPlacesBinding by viewBinding(FragmentPlacesBinding::bind)
    private val placesViewModel by lazy { ViewModelProvider(this).get(PlacesViewModel::class.java) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}