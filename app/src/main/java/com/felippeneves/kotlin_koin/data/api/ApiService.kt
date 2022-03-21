package com.felippeneves.kotlin_koin.data.api

import com.felippeneves.kotlin_koin.data.model.Bitcoin
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("v1/bpi/currentprice.json")
    suspend fun getBitcoinDetails(): Response<Bitcoin>
}