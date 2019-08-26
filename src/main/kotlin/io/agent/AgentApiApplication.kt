package io.agent

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AgentApiApplication

fun main(args: Array<String>){
    runApplication<AgentApiApplication>(*args)
}


