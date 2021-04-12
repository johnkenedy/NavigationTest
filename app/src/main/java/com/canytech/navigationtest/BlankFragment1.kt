package com.canytech.navigationtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.canytech.navigationtest.databinding.FragmentBlank1Binding

class BlankFragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentBlank1Binding = DataBindingUtil.inflate(
            layoutInflater, R.layout.fragment_blank1, container, false
        )

        binding.btn1.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_blankFragment1_to_blankFragment2)
        )

        return binding.root
    }
}