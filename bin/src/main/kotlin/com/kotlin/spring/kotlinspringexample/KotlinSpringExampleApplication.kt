package com.kotlin.spring.kotlinspringexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class KotlinSpringExampleApplication
{
	companion object {
 @JvmStatic
fun main(args: Array<String>) {
	runApplication<KotlinSpringExampleApplication>(*args)

 }
}
}