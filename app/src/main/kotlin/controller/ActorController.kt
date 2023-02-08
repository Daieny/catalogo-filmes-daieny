package controller

import br.com.catalogo.domain.Actor
import br.com.catalogo.services.ActorServices
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put

@Controller("/actor")
class ActorController() {
    val actorServices = ActorServices()


    @Post fun create(actor : Actor) {
        println(actor)
    }

    @Put fun update (actor: Actor) {
        println(actor)

    }

    @Delete("/{id}")
    fun update(id: Int){
        println("DELETE: $id")
    }

    @Get
    fun getall(): List<Actor>{

    }

    @Get("/{id}")
    fun findById(id: Int) {
        println("FIND_BY_ID: $id")
    }

    }


}

