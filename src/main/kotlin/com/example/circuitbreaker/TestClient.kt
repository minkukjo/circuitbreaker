package com.example.circuitbreaker

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "test", url = "http://localhost:8080",configuration = [LoggingConfiguration::class])
interface TestClient {

    @GetMapping("/success")
    fun success(): String
}