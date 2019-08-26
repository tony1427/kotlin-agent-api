package io.agent.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "agent")
data class Agent(
    @Id
    val id: String? = null,
    val name: String? = null,
    val phone: String? = null,
    val address1: String? = null,
    val address2: String? = null,
    val city: String? = null,
    val state: String? = null,
    val brand: String? = null,
    val postalCode: String? = null,
    val commonOwner: String? = null,
    val url: String? = null,
    val msaRegion: String? = null,
    val country: String? = null
)