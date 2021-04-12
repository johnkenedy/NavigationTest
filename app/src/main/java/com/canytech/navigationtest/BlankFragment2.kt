package com.canytech.navigationtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.canytech.navigationtest.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding : FragmentBlank2Binding = DataBindingUtil.inflate(
            layoutInflater, R.layout.fragment_blank2, container, false)

        binding.btn2.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_blankFragment2_to_blankFragment3)
        )

        return binding.root
    }
}