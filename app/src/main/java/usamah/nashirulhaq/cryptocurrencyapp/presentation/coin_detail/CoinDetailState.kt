package usamah.nashirulhaq.cryptocurrencyapp.presentation.coin_detail

import usamah.nashirulhaq.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
