package com.cy.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @Value("\${server.port}")
    var port: String? = null


    @GetMapping("/hello")
    fun hello(@RequestParam("param") param: String): String {
        return "你好，我是Cy客户端，我的端口是${port}"
    }
}
