package joost.im.pool.controller

import joost.im.pool.database.PersonRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonResource(
    private val personRepository: PersonRepository
) {
    @GetMapping("/person")
    fun getPersons(): List<Person> = personRepository.findAll().map {
        Person(
            name = it.name,
            age = it.age
        )
    }
}