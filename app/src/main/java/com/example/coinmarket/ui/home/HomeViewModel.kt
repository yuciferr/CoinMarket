package com.example.coinmarket.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coinmarket.model.home.CryptoResponse
import com.example.coinmarket.utils.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: HomeRepository): ViewModel() {
    val cryptoResponse: MutableLiveData<CryptoResponse?> = MutableLiveData()
    val isLoading: MutableLiveData<Boolean> = MutableLiveData()
    val onError: MutableLiveData<String?> = MutableLiveData()

    fun getData(
        apiKey: String,
        limit: String
    )= viewModelScope.launch{
        isLoading.value=true
        when(val request = repository.getData(apiKey,limit)){
            is NetworkResult.Success ->{
                cryptoResponse.value = request.data
                isLoading.value = false
            }
            is NetworkResult.Error -> {
                onError.value = request.message
                isLoading.value = false
            }
            else -> {}
        }
    }
}