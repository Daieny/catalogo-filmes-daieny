package br.com.catalogo.services

import br.com.catalogo.domain.Actor
import br.com.catalogo.repository.ActorRepository
import io.micronaut.http.annotation.*
import org.springframework.web.bind.annotation.PostMapping
import java.net.http.HttpResponse
import java.time.LocalDateTime

class ActorServices(
    private val actorRepository: ActorRepository
        val id: Int,
        val firstName: String,
        val lastName: String,

) {
    fun create(actor: Actor){
        actorRepository.save(actor)

        fun actors(): Map<Int, String> {
            return mapOf()
        }
            fun idActorExist(id: Int): Boolean {
                if (actor.id <= 3) return throw Exception("ID Inválido")

}
    fun findAll(): List<Actor> {
        return actorRepository.findAll()
    }

    fun findById(id: Int): Actor {
        return actorRepository.findById(id).get()
    }

    fun delete(id: Int) {
        actorRepository.deleteById(id)
        println("DELETE: $id")

    }
}


       /* fun findById(id: Long): Actor? = Actor.findById(id).get()
        fun save(actor: Actor): Actor{
        }


        }
        throw Exception("Id inválido")
         return HttpResponse.


    }
        fun update (actor: Actor): Actor {
       return Actor.save(actor)
        println(actor) */
/*

    fun actorValidate(actor: Actor) {


    }

    fun getAll() = listOf("Rodrigo Lombardi", "Drika Moraes", "Bruna Marquezine", "Camila Queiroz", "Agatha Moreira")

}
    fun getById(actor: Actor){
        id: Int -> actor_id: Long Actor? = repository.findById(id).get()
    }

    companion object {



    }*/
