package com.example.coinmarket.network

import com.example.coinmarket.model.home.CryptoResponse
import com.example.coinmarket.utils.Constants.API_KEY
import com.example.coinmarket.utils.Constants.BASE_URL
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiFactory {
    //https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?limit=10

    @GET(BASE_URL)
    suspend fun getData(
        @Header(API_KEY) apiKey: String,
        @Query("limit") limit: String
    ): CryptoResponse
}