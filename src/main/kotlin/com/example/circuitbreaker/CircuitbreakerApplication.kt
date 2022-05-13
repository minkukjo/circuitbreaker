package com.example.circuitbreaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class CircuitbreakerApplication

fun main(args: Array<String>) {
    runApplication<CircuitbreakerApplication>(*args)
}
