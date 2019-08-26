package io.agent.repository

import io.agent.entity.Agent
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AgentRepository : JpaRepository<Agent, String> {

    fun findByState(state : String) : List<Agent>
}