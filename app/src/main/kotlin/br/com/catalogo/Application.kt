package br.com.catalogo

import br.com.catalogo.domain.Actor
import br.com.catalogo.domain.City
import br.com.catalogo.domain.Country
import br.com.catalogo.domain.Language
import io.micronaut.runtime.Micronaut.run
import java.time.LocalDateTime


fun main(args: Array<String>) {
	run(*args)

	//println("Hello World")

	val brasil = Country(
		lastUpdate = LocalDateTime.now(),
		id = 1,
		name = "Brasil"
	)
	val argentina = Country(
		lastUpdate = LocalDateTime.now(),
		id = 2,
		name = "Argentina"

	)

	/*println(brasil)
	println(argentina)*/

	val saoPaulo = City(
		lastUpdate = LocalDateTime.now(),
		id = 1,
		name = "São Paulo",
		country = brasil
	)

	val rioDeJaneiro = City(
			lastUpdate = LocalDateTime.now(),
			id = 2,
			name = "Rio de Janeiro",
			country = brasil

	)

/*	println(saoPaulo)
	println(rioDeJaneiro)*/

	val rodrigoLombardi = Actor(
			lastUpdate = LocalDateTime.now(),
			id = 1,
			firstName = "Rodrigo",
			lastName = "Lombardi"
	)

	val dricaMoraes = Actor(
			lastUpdate = LocalDateTime.now(),
			id = 2,
			firstName = "Drica",
			lastName = "Moraes"
	)

	val brunaMarquezine = Actor(
			lastUpdate = LocalDateTime.now(),
			id = 3,
			firstName = "Bruna",
			lastName = "Marquezine"
	)

	val camilaQueiroz = Actor(
			lastUpdate = LocalDateTime.now(),
			id = 4,
			firstName = "Camila",
			lastName = "Queiroz"
	)

	val portugues = Language(
			lastUpdate = LocalDateTime.now(),
			id = 1,
			name = "Português"
	)

	val ingles = Language(
			lastUpdate = LocalDateTime.now(),
			id = 2,
			name = "Inglês"
	)

	val frances = Language(
			lastUpdate =  LocalDateTime.now(),
			id = 3,
			name = "Francês"
	)

	val alemao = Language(
			lastUpdate = LocalDateTime.now(),
			id = 4,
			name = "Alemão"

	)
	val italiano = Language(
			lastUpdate = LocalDateTime.now(),
			id = 5,
			name = "Italiano"
	)

	val espanhol = Language(
			lastUpdate = LocalDateTime.now(),
			id = 6,
			name = "Espanhol"

	)


	}
	/*println(portuguese)
	println(english)
	println(french)
	println(german)
	println(italian)
	println(spanish)*/



