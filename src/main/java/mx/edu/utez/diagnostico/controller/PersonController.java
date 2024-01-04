package mx.edu.utez.diagnostico.controller;

import lombok.AllArgsConstructor;
import mx.edu.utez.diagnostico.model.dto.PersonDto;
import mx.edu.utez.diagnostico.model.entity.Person;
import mx.edu.utez.diagnostico.service.impl.PersonImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/")
public class PersonController {
    private final PersonImpl personService;

    @GetMapping("/")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Person findOne(@PathVariable Integer id) {
        return personService.findById(id);
    }

    @PostMapping("/")
    public Person create(@RequestBody PersonDto personDto) {
        return personService.save(personDto);
    }

    @PutMapping("/")
    public Person update(@RequestBody PersonDto personDto) {
        return personService.save(personDto);
    }

    @DeleteMapping("/{id}")
    public Person delete(@PathVariable Integer id) {
        Person personDelete = personService.findById(id);
        personService.delete(personDelete);
        return personDelete;
    }
}
