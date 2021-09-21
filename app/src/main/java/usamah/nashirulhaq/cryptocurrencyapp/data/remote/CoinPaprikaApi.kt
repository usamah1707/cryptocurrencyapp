package usamah.nashirulhaq.cryptocurrencyapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Path
import usamah.nashirulhaq.cryptocurrencyapp.data.remote.data_transfer_object.CoinDetailDto
import usamah.nashirulhaq.cryptocurrencyapp.data.remote.data_transfer_object.CoinDto

interface CoinPaprikaApi {

    @GET("v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}