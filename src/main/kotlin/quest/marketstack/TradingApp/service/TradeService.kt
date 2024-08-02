package quest.marketstack.TradingApp.service

import org.springframework.stereotype.Service
import quest.marketstack.TradingApp.datasource.TradeDataSource
import quest.marketstack.TradingApp.model.TradeExec
import java.time.LocalDate
import java.time.LocalTime

@Service
class TradeService(private val dataSource: TradeDataSource) {
    fun getTradeExecs(): Collection<TradeExec> = dataSource.retrieveTradeExecs()
}