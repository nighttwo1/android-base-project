package com.nighttwo1.domain

sealed class NetworkResult<out T> {
    class Ready<T> : NetworkResult<T>()

    data class Success<T>(val data: T) : NetworkResult<T>()

    data class Loading<T>(val data: T? = null) : NetworkResult<T>()

    data class Error<T>(val throwable: Throwable) : NetworkResult<T>()
}