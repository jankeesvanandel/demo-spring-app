package com.example.demospringapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class DemoSpringAppApplication

fun main(args: Array<String>) {
    runApplication<DemoSpringAppApplication>(*args)
}
