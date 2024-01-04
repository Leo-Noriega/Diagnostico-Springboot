package mx.edu.utez.diagnostico.service;

import jakarta.persistence.Column;
import mx.edu.utez.diagnostico.model.dto.PersonDto;
import mx.edu.utez.diagnostico.model.entity.Person;

import java.util.List;

public interface IPerson {
    Person save(PersonDto personDto);

    Person findById(Integer id_person);

    List<Person> findAll();

    void delete(Person person);
}
