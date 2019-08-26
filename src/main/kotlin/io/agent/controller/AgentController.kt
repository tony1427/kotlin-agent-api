package io.agent.controller

import io.agent.entity.Agent
import io.agent.repository.AgentRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.data.domain.ExampleMatcher
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith

@RestController
class AgentController(private val agentRepository: AgentRepository) {
    companion object{
         val AGENT_MATCHER = ExampleMatcher.matching().withIgnoreCase().withMatcher("postalCode", startsWith())
    }

    @GetMapping
    fun search(): List <Agent> {
        return agentRepository.findByState("TX")
    }
}

/*
    I was getting an error '... is no access method'. I had the repository being passed
    into the search method IE: agentRepository : AgentRepository. This is the wrong place
    to pass it in. You need to pass it into the controller class like above.
 */