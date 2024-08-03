package quest.marketstack.TradingApp.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath


@SpringBootTest
@AutoConfigureMockMvc
class TradeControllerTest{

    @Autowired
    lateinit var mockMvc: MockMvc

    @Nested
    @DisplayName("getTradeExecs")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class getTradeExecs {
        @Test
        fun `should return all TradeExecs`() {
            mockMvc.get("/api/tradeExecs")
                .andDo { print() }
                .andExpect {
                    status { isOk() }
                    content { contentType(MediaType.APPLICATION_JSON) }
                    jsonPath("$[0].account") { value("2313") }
                }
        }
    }


    @Test
    fun `should return the trade with the given id`() {
        
    }
}