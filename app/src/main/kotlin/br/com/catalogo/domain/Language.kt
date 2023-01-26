package br.com.catalogo.domain

import com.fasterxml.jackson.annotation.JsonIdentityInfo
import org.intellij.lang.annotations.Identifier
import java.time.LocalDateTime

data class Language(
        val id: Int,
        val name: String,
        val lastUpdate: LocalDateTime,


) {

}




