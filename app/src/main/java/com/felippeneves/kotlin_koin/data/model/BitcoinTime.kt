package com.felippeneves.kotlin_koin.data.model

import com.squareup.moshi.Json

data class BitcoinTime(
    @Json(name = "updated")
    val updated: String = "",

    @Json(name = "updatedISO")
    val updatedISO: String = "",

    @Json(name = "updateduk")
    val updateduk: String = "",
)
