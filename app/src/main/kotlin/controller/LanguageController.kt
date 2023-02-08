package controller

import br.com.catalogo.services.LanguageServices
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.time.LocalDate
import java.time.LocalDateTime

@Controller("/language")
class LanguageController() {
    val languageServices = LanguageServices()
    @Get
    fun getLanguage() = languageServices.getAll()

}

