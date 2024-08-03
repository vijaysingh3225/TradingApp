package quest.marketstack.TradingApp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import quest.marketstack.TradingApp.model.TradeExec
import quest.marketstack.TradingApp.service.TradeService

@RestController
@RequestMapping("/api/tradeExecs")
class TradeController(private val service: TradeService) {
    @GetMapping
    fun getTradeExecs(): Collection<TradeExec> = service.getTradeExecs();
}