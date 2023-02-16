package controller

import br.com.catalogo.domain.Actor
import br.com.catalogo.repository.ActorRepository
import br.com.catalogo.services.ActorServices
import io.micronaut.http.annotation.*
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller("/actor")
class ActorController(
    private val actorServices: ActorServices
) {
    @Post
    fun create(@Body actor: Actor) {
        actorServices.create(actor)
    }

    @Get
    fun findAll(): List<Actor> {
        return actorServices.findAll()
    }

   /* @Get("/{id}")
    fun findById(@PathVariable id: Int): Actor {
        return actorServices.findById(id)
    } */

    @Delete("/{id}")
    fun delete(@PathVariable id: Int) {
        actorServices.delete(id)

    }
}


   /* @Put fun update (actor: Actor): Actor {
    //    return ActorRepository.save(actor)
    //    println(actor)

    }


    }

    }


    }*/






