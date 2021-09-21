package usamah.nashirulhaq.cryptocurrencyapp.data.repository

import usamah.nashirulhaq.cryptocurrencyapp.data.remote.CoinPaprikaApi
import usamah.nashirulhaq.cryptocurrencyapp.data.remote.data_transfer_object.CoinDetailDto
import usamah.nashirulhaq.cryptocurrencyapp.data.remote.data_transfer_object.CoinDto
import usamah.nashirulhaq.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}