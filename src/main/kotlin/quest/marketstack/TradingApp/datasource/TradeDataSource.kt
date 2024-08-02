package quest.marketstack.TradingApp.datasource

import org.springframework.data.mongodb.repository.MongoRepository
import quest.marketstack.TradingApp.model.TradeExec

interface TradeDataSource {

    fun retrieveTradeExecs(): Collection<TradeExec>
}