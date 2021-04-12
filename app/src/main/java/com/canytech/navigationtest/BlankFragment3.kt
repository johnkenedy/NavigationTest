package com.canytech.navigationtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.canytech.navigationtest.databinding.FragmentBlank3Binding

class BlankFragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentBlank3Binding = DataBindingUtil.inflate(
            layoutInflater, R.layout.fragment_blank3, container, false
        )

        binding.btn3.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_blankFragment3_to_blankFragment1)
        )

        return binding.root
    }
}