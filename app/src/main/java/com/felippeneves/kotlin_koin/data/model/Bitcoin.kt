package com.felippeneves.kotlin_koin.data.model

import com.squareup.moshi.Json

data class Bitcoin(
    @Json(name = "time")
    val time: BitcoinTime,

    @Json(name = "disclaimer")
    val disclaimer: String = "",

    @Json(name = "chartName")
    val chartName: String = "",

    @Json(name = "bpi")
    val bpi: List<BitcoinValue>
)
