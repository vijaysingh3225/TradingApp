package quest.marketstack.TradingApp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("upload")
class UploadController {
    @GetMapping
    fun receiveUpload(): String ="This Endpoint will receive CSV uploads"
}