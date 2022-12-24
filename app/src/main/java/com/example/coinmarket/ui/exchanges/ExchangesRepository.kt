package com.example.coinmarket.ui.exchanges

import com.example.coinmarket.base.BaseRepository
import com.example.coinmarket.network.ApiFactory
import javax.inject.Inject

class ExchangesRepository @Inject constructor(private val apiFactory: ApiFactory): BaseRepository(){

    suspend fun getExchanges(
        apiKey: String,
        start: Int,
        limit: Int
    ) = safeApiRequest {
        apiFactory.getExchanges(apiKey,limit)
    }
}