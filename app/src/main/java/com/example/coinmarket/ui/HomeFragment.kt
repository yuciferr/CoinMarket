package com.example.coinmarket.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.coinmarket.R
import com.example.coinmarket.base.BaseFragment
import com.example.coinmarket.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>
    (FragmentHomeBinding::inflate) {
    override val viewModel by viewModels<HomeViewModel>()

    override fun onCreateFinished() {
        TODO("Not yet implemented")
    }

    override fun initializeListeners() {
        TODO("Not yet implemented")
    }

    override fun observerEvents() {
        TODO("Not yet implemented")
    }

}