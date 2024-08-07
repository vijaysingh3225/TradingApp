package quest.marketstack.TradingApp.service


import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service
import quest.marketstack.TradingApp.datasource.MongoTradeDataSource
import quest.marketstack.TradingApp.datasource.TradeDataSource
import quest.marketstack.TradingApp.model.TradeExec

@Service
@Profile("!test")
class MongoTradeService(private val dataSource: MongoTradeDataSource): TradeServiceInterface {
    override fun getTradeExecs(): Collection<TradeExec> = dataSource.retrieveTradeExecs()

    override fun getTradeExec(id: String): TradeExec? = dataSource.retrieveTradeExec(id)

    override fun addTradeExec(exec: TradeExec): TradeExec = dataSource.createTradeExec(exec)
}