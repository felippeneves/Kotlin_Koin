package com.felippeneves.kotlin_koin.data.repository

import com.felippeneves.kotlin_koin.data.api.ApiHelper


class MainRepository (private val apiHelper: ApiHelper) {
    suspend fun getBitcoinDetails() =  apiHelper.getBitcoinDetails()
}