package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable
import java.util.Date

@Serializable
data class CoinPriceDto(
    val priceUsd: Double,
    val time: Long
)