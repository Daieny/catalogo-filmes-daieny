package br.com.catalogo.domain

import java.time.LocalDateTime

data class Film_Category(

        val idFilm: Film,
        val categoryId: Int, //verificar classe category
        val lastUpdate: LocalDateTime
)
