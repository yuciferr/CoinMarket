package com.example.coinmarket.model.home


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("circulating_supply")
    val circulatingSupply: Double?,
    @SerializedName("cmc_rank")
    val cmcRank: Int?,
    @SerializedName("date_added")
    val dateAdded: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("last_updated")
    val lastUpdated: String?,
    @SerializedName("max_supply")
    val maxSupply: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("num_market_pairs")
    val numMarketPairs: Int?,
    @SerializedName("platform")
    val platform: Platform?,
    @SerializedName("quote")
    val quote: Quote?,
    @SerializedName("self_reported_circulating_supply")
    val selfReportedCirculatingSupply: Long?,
    @SerializedName("self_reported_market_cap")
    val selfReportedMarketCap: Double?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("symbol")
    val symbol: String?,
    @SerializedName("tags")
    val tags: List<String?>?,
    @SerializedName("total_supply")
    val totalSupply: Double?,
    @SerializedName("tvl_ratio")
    val tvlRatio: Double?
)