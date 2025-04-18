package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.NetworkError
import com.plcoding.cryptotracker.core.domain.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}