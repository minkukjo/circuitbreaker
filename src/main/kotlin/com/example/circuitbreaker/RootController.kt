package com.example.circuitbreaker

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController(
        val circuitTestService: CircuitTestService
) {

    @GetMapping("/")
    fun home() {
        circuitTestService.send()
    }
}