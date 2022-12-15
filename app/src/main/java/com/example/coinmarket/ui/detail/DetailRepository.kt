package com.example.coinmarket.ui.detail

import com.example.coinmarket.base.BaseRepository
import com.example.coinmarket.network.ApiFactory
import javax.inject.Inject

class DetailRepository @Inject constructor(private val apiFactory: ApiFactory): BaseRepository(){

    suspend fun getDetail(
        apiKey: String,
        symbol: String
    ) = safeApiRequest {
        apiFactory.getDetail(apiKey,symbol)
    }
}