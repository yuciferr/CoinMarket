package com.example.coinmarket.ui.home

import com.example.coinmarket.base.BaseRepository
import com.example.coinmarket.network.ApiFactory
import javax.inject.Inject

class HomeRepository @Inject constructor(private val apiFactory: ApiFactory): BaseRepository() {
    suspend fun getData(
        apiKey: String,
        limit: String,
    ) = safeApiRequest{
        apiFactory.getData(apiKey,limit)
    }
}