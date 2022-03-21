package com.felippeneves.kotlin_koin.data.model

import com.squareup.moshi.Json

data class BitcoinValue(
    @Json(name = "code")
    val code: String = "",

    @Json(name = "symbol")
    val symbol: String = "",

    @Json(name = "rate")
    val rate: String = "",

    @Json(name = "description")
    val description: String = "",

    @Json(name = "rate_float")
    val rate_float: Float = 0F,
)
