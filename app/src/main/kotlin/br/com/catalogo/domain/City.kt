package br.com.catalogo.domain

import java.time.LocalDateTime

data class City(
        val id: Int,
        val name: String,
        val lastUpdate: LocalDateTime,
        val country: Country

)