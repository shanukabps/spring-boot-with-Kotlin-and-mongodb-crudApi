package com.example.SpringKotlinDemo1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinDemo1Application

fun main(args: Array<String>) {
	println("HEloow world")
	runApplication<SpringKotlinDemo1Application>(*args)
}
