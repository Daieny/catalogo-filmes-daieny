package br.com.catalogo.services

import br.com.catalogo.domain.Actor
import io.micronaut.http.annotation.Post
import java.net.http.HttpResponse
import java.time.LocalDateTime

private operator fun Char.times(index: Int) {

}


class ActorServices{

     val id: Int,
     val firstName: String,

    fun save(actor: Actor){

        if (actor.id < 0){
        throw Exception("Id inválido")
        return HttpResponse.

        if (actor.id)

    }

    fun actorExist(id: Int): Boolean {
    }

    fun actorValidate(actor: Actor) {


    }

    fun getAll() = listOf("Rodrigo Lombardi", "Drika Moraes", "Bruna Marquezine", "Camila Queiroz", "Agatha Moreira")

}
    fun getById(actor: Actor){
        id: Int -> actor_id: Long Actor? = repository.findById(id).get()
    }
}