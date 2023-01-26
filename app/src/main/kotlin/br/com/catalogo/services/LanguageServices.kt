package br.com.catalogo.services

import br.com.catalogo.domain.Language
class LanguageServices()

    fun validateLanguage(language: Language){

        if (language.id >=6) throw Exception("Linguagem Inválida")

           }
      fun getAll() = listOf("Português", "Inglês", "Francês", "Alemão", "Italiano", "Espanhol")


