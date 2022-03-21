package com.felippeneves.kotlin_koin.data.api

import com.felippeneves.kotlin_koin.data.model.Bitcoin
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun getBitcoinDetails(): Response<Bitcoin> = apiService.getBitcoinDetails()
}