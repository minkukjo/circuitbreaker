package com.example.circuitbreaker

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.slf4j.LoggerFactory

import org.springframework.stereotype.Service

@Service
class CircuitTestService(
        val testClient: TestClient
) {

    private val log = LoggerFactory.getLogger(javaClass)

    @CircuitBreaker(name = "test", fallbackMethod = "sendFallBack")
    fun send() {
        log.info("in")

        val exchange = testClient.success()
        println(exchange)

    }

    fun sendFallBack(e: Throwable) {
        log.info("fall back")
        log.info(e.message)
    }


}