package com.example.coinmarket.ui.home

import androidx.fragment.app.viewModels
import com.example.coinmarket.base.BaseFragment
import com.example.coinmarket.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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