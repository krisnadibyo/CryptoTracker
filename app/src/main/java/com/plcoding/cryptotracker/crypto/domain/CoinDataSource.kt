package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.NetworkError
import com.plcoding.cryptotracker.core.domain.Result
import java.time.ZonedDateTime

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
    suspend fun getCoinsHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError>
}