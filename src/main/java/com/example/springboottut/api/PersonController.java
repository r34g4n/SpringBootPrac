package com.example.springboottut.api;

import com.example.springboottut.model.Person;
import com.example.springboottut.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author r34g4n
 * @date 7/31/21 11:48 AM
 */

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @GetMapping(path="{id}")
    public Person getPersonById(@PathVariable("id") UUID id){
        return personService.getPersonById(id)
                .orElse(null);
    }

    @DeleteMapping(path="{id}")
    public void deletePersonById(@PathVariable("id") UUID id){
        personService.deletePerson(id); // modified
    }

    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id")UUID id, @RequestBody Person personToUpdate){
        personService.updatePerson(id,personToUpdate);
    }
}
