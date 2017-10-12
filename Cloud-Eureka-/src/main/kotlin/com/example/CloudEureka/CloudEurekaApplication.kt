package com.example.CloudEureka

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class CloudEurekaApplication

fun main(args: Array<String>) {
    SpringApplication.run(CloudEurekaApplication::class.java, *args)
}
