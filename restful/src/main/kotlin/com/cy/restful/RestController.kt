package com.cy.restful

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {

    @Autowired
    lateinit var mService: Service

    @GetMapping("restGet")
    fun restFulHello(@RequestParam("name") name: String): String {
        return mService.restFulHello(name)
    }

}
