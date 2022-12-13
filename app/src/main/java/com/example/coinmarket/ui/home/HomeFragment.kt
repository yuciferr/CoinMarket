package com.example.coinmarket.ui.home

import androidx.fragment.app.viewModels
import com.example.coinmarket.base.BaseFragment
import com.example.coinmarket.databinding.FragmentHomeBinding
import com.example.coinmarket.utils.Constants.API_KEY
import com.example.coinmarket.utils.Constants.LIMIT
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>
    (FragmentHomeBinding::inflate) {
    override val viewModel by viewModels<HomeViewModel>()

    override fun onCreateFinished() {
        viewModel.getData(API_KEY, LIMIT)
    }

    override fun initializeListeners() {

    }

    override fun observerEvents() {

    }

}