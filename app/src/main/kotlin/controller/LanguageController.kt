package rest
import br.com.catalogo.domain.Language
import br.com.catalogo.services.LanguageServices
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/language")
class LanguageController {

    val languageServices = LanguageServices()

        @Get
        fun getLanguages() = languageServices.getAll()


}