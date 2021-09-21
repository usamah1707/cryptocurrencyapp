package usamah.nashirulhaq.cryptocurrencyapp.domain.repository

import usamah.nashirulhaq.cryptocurrencyapp.data.remote.data_transfer_object.CoinDetailDto
import usamah.nashirulhaq.cryptocurrencyapp.data.remote.data_transfer_object.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}