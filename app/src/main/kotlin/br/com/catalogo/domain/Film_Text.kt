package br.com.catalogo.domain

data class Film_Text(

        val Id: Film,
        val title: String,
        val description: String

        /* O Conteúdo da tabela nunca deve ser modificado diretamente.
        Todas as alterações devem ser feitas na tabela film_textfilm */

)
