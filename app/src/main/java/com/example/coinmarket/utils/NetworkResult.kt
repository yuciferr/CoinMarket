package com.example.coinmarket.utils

sealed class NetworkResult<T>(
    val data: T? = null,
    val message: String? = null,
    val networkError: Boolean = false
) {
    class Success<T>(data: T): NetworkResult<T>(data)
    class Error<T>(networkError: Boolean, message: String?):
        NetworkResult<T>(data = null,message=message, networkError = networkError)


}