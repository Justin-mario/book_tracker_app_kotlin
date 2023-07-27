package com.booktracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookTrackerAppApplication

fun main(args: Array<String>) {
    runApplication<BookTrackerAppApplication>(*args)
}
