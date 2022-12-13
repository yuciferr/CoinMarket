package com.example.coinmarket.network

import com.example.coinmarket.model.home.CryptoResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiFactory {
    //https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?limit=10

    @GET("https://pro-api.coinmarketcap.com")
    suspend fun getData(
        @Header("X-CMC_PRO_API_KEY") apiKey: String,
        @Query("limit") limit: String
    ): CryptoResponse
}