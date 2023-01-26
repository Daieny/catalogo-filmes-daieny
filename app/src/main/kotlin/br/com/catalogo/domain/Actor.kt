package br.com.catalogo.domain

import java.time.LocalDateTime

data class Actor(
        val id: Int,
        val firstName: String,
        val lastName: String,
        val lastUpdate: LocalDateTime

)
