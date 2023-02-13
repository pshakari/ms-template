package no.shakari.mstemplate.controller
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@RestController
class HelloController {
    @GetMapping("/")
    fun greeting() = ResponseEntity.ok("Hello World 2!")
}