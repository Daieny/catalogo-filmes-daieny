package br.com.catalogo.domain

import io.micronaut.core.annotation.Introspected
import java.time.LocalDateTime
import javax.persistence.Id

@Introspected
data class Actor(
        @Id
        val id: Int,
        val firstName: String,
        val lastName: String,
        val lastUpdate: LocalDateTime

) /* {
    fun getInstance(): Any {

    }
}
*/