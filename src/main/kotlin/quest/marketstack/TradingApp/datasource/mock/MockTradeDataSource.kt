package quest.marketstack.TradingApp.datasource.mock

import org.springframework.stereotype.Repository
import quest.marketstack.TradingApp.datasource.TradeDataSource
import quest.marketstack.TradingApp.model.TradeExec
import java.time.LocalDate
import java.time.LocalTime


@Repository
class MockTradeDataSource:TradeDataSource {
    override fun retrieveTradeExecs(): Collection<TradeExec>{
        return listOf(TradeExec(
            id = 234,
            account = "2313",
            tradeDate = LocalDate.of(2021, 9, 13),
            settlementDate = LocalDate.of(2021, 9, 15),
            currency = "USD",
            type = 3, // Example type
            side = "SS", // Side could be 'Buy' or 'Sell'
            symbol = "UROY",
            quantity = 200,
            price = 4.3038,
            execTime = LocalTime.of(10, 28, 12),
            commission = 0.0,
            secFee = 0.01,
            taf = 0.02,
            nscc = 0.0,
            nasdaq = 0.0,
            ecnRemove = 0.0,
            ecnAdd = 0.0,
            grossProceeds = 860.76,
            netProceeds = 860.73,
            clearingBroker = "MNGD",
            liquidity = "", // Empty string for liquidity
            note = ""))
    }
}