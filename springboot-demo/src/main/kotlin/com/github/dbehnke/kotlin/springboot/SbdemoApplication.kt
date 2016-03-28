package com.github.dbehnke.kotlin.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SbdemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(SbdemoApplication::class.java, *args)
}
