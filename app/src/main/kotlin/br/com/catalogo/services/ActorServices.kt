package br.com.catalogo.services

import br.com.catalogo.domain.Actor
import java.time.LocalDateTime

class ActorServices()


       // val id: Int,
      //  val firstName: String,
     //   val lastName: String,

 {


        val actorMap = mutableMapOf(
                1 to Actor(1, "Rodrigo", "Lombardi", LocalDateTime.now()),
                2 to Actor(2, "Drica", "Moraes", LocalDateTime.now()),
                3 to Actor(3, "Bruna", "Marquezine", LocalDateTime.now()),

                )

        fun create(actor: Actor) {
            actorMap.put(actor.id, actor)
        }
        fun findAll(): List<Actor>{
            val actors: List<Actor> = actorMap.values.toList()
            return actors
        }

  //  fun findById(id: Int) : Actor{
  //      val actor = actorMap.get(id)
  //      return actor
  //  }

    fun delete(id: Int) {
        actorMap.remove(id)
    }
}




