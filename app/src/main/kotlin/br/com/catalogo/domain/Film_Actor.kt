package br.com.catalogo.domain

import java.time.LocalDateTime

data class Film_Actor(

        val idActor: Actor,
        val idFilm: Film,
        val lastUpdate: LocalDateTime
)

