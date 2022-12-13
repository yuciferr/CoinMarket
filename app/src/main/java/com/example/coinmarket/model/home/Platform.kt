package com.example.coinmarket.model.home


import com.google.gson.annotations.SerializedName

data class Platform(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("symbol")
    val symbol: String?,
    @SerializedName("token_address")
    val tokenAddress: String?
)