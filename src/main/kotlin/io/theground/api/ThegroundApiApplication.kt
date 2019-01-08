package io.theground.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ThegroundApiApplication

fun main(args: Array<String>) {
	runApplication<ThegroundApiApplication>(*args)
}

