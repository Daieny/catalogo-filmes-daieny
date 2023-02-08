package br.com.catalogo.domain

import io.micronaut.core.annotation.Introspected
import java.time.LocalDateTime
@Introspected
data class Actor(
        val id: Int,
        val firstName: String,
        val lastName: String,
        val lastUpdate: LocalDateTime

) {
    fun getInstance(): Any {

    }
}
