package com.felippeneves.kotlin_koin.data.api

import com.felippeneves.kotlin_koin.data.model.Bitcoin
import retrofit2.Response

interface ApiHelper {
    suspend fun getBitcoinDetails(): Response<Bitcoin>
}