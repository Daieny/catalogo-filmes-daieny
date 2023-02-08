package br.com.catalogo.services

import br.com.catalogo.domain.Actor
import io.micronaut.http.annotation.Post
import java.net.http.HttpResponse
import java.time.LocalDateTime

private operator fun Char.times(index: Int) {

}

@ActorServices.Current
class ActorServices(actor: Actor) {
    annotation class Current

    fun save(actor: Actor) {
        val lastUpdate = LocalDateTime.now()
        val rodrigoLombardi = Actor(
                1,
                "Rodrigo",
                "Lombardi",
                LocalDateTime.now()
        )

        val dricaMoraes = Actor(
                2,
                "Drica",
                "Moraes",
                LocalDateTime.now()


        )
        val listOfActor = listOf(TODO())

        val map = listOfActor.mapIndexed { index, it ->
            it * index
        }
        println(map)
        val id: Int,
        val firstName
        val lasName
        val actorQuery


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

}