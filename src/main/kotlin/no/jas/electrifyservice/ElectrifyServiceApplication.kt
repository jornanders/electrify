package no.jas.electrifyservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ElectrifyServiceApplication

fun main(args: Array<String>) {
    runApplication<ElectrifyServiceApplication>(*args)
}
