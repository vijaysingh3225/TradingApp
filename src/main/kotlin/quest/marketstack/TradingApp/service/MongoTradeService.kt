package quest.marketstack.TradingApp.service


import org.springframework.stereotype.Service
import quest.marketstack.TradingApp.datasource.MongoTradeDataSource
import quest.marketstack.TradingApp.datasource.TradeDataSource
import quest.marketstack.TradingApp.model.TradeExec

@Service
class MongoTradeService(private val dataSource: MongoTradeDataSource) {
    fun getTradeExecs(): Collection<TradeExec> = dataSource.retrieveTradeExecs()

    fun getTradeExec(id: String): TradeExec? = dataSource.retrieveTradeExec(id)

    fun addTradeExec(exec: TradeExec): TradeExec = dataSource.createTradeExec(exec)
}