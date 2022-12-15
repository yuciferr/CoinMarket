package com.example.coinmarket.ui.home

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.example.coinmarket.base.BaseFragment
import com.example.coinmarket.databinding.FragmentHomeBinding
import com.example.coinmarket.model.home.Data
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
        with(viewModel){
            cryptoResponse.observe(viewLifecycleOwner, Observer {
                it?.let {
                    it.data?.let { it1 -> setRecycler(it1) }
                }
            })
            isLoading.observe(viewLifecycleOwner, Observer {
                handleViews(it)
            })

            onError.observe(viewLifecycleOwner, Observer {
                Toast.makeText(requireContext(),it,Toast.LENGTH_LONG).show()
            })
        }
    }

    private fun setRecycler(data: List<Data>){
        val mAdapter = HomeRecyclerAdapter(object : ItemClickListener{
            override fun onItemClick(coin: Data) {
                if(coin.symbol != null){
                    val navigation = HomeFragmentDirections.actionHomeFragmentToDetailFragment(coin.symbol)
                    Navigation.findNavController(requireView()).navigate(navigation)
                }

            }
        })
        binding.rvHome.adapter = mAdapter
        mAdapter.setList(data)
    }

    private fun handleViews(isLoading: Boolean=false){
        binding.rvHome.isVisible = !isLoading
        binding.pbHome.isVisible = isLoading

    }

}