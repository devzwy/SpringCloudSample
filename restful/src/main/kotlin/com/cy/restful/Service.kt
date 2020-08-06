package com.cy.restful

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.client.RestTemplate

@Service
class Service {
    @Autowired
    lateinit var mRestTemplate: RestTemplate

    fun restFulHello(name: String): String {
        //这里的CYCLIENT为客户端指定的名称，必须从注册中心网页中查看并获取(不是配置文件中指定的，这里不知道咋回事，在配置文件中指定的名称在网页中全部显示为大写)，路由会找到名称为CYCLIENT的客户端，然后再去访问CYCLIENT下面的hello接口。
        return mRestTemplate.getForObject("http://CYCLIENT/hello?param=${name}", String::class.java) ?: ""
    }
}
