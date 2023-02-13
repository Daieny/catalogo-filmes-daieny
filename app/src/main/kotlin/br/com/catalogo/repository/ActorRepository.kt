package br.com.catalogo.repository

import br.com.catalogo.domain.Actor
import io.micronaut.data.jpa.repository.JpaRepository

interface ActorRepository: JpaRepository<Actor, Int>  {
}