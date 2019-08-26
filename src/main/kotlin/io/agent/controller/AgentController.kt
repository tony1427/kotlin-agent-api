package io.agent.controller

import io.agent.entity.Agent
import io.agent.repository.AgentRepository
import org.springframework.data.domain.Example
import org.springframework.web.bind.annotation.RestController
import org.springframework.data.domain.ExampleMatcher
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
class AgentController(private val agentRepository: AgentRepository) {
    companion object{
        val AGENT_MATCHER = ExampleMatcher.matching().withIgnoreCase().withMatcher("postalCode", startsWith())
    }

    @PostMapping("search")
    fun search(@RequestBody agent: Agent): Iterable <Agent> {
        return agentRepository.findAll(Example.of(agent, AGENT_MATCHER))
    }
}

/*
    I was getting an error '... is no access method'. I had the repository being passed
    into the search method IE: agentRepository : AgentRepository. This is the wrong place
    to pass it in. You need to pass it into the controller class like above.
 */