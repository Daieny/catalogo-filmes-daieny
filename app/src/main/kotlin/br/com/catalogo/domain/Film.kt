package br.com.catalogo.domain

import java.time.Duration
import java.time.LocalDateTime
import java.time.Year

data class Film(
        val id: Int,
        val title: String,
        val description: String,
        val releaseYear: Int,
        val idLanguage: Language,
        val originalLanguageId: Language,
        val rentalDuration: Int,
        val rentalRent: Int,
        val length: String,
        val replacementCost: Double,
        val rating: String,
        val specialFeatures: String,
        val lastUpdate: LocalDateTime



)
