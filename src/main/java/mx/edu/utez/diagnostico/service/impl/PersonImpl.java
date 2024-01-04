package mx.edu.utez.diagnostico.service.impl;

import lombok.AllArgsConstructor;
import mx.edu.utez.diagnostico.model.dao.PersonDao;
import mx.edu.utez.diagnostico.model.dto.PersonDto;
import mx.edu.utez.diagnostico.model.entity.Person;
import mx.edu.utez.diagnostico.service.IPerson;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonImpl implements IPerson {

    private final PersonDao personDao;

    @Override
    @Transactional
    public Person save(PersonDto personDto) {
        Person personSave = Person.builder()
                .id_person(personDto.getId_person())
                .firstname(personDto.getFirstname())
                .lastname(personDto.getLastname())
                .curp(personDto.getCurp())
                .birthdate(personDto.getBirthdate())
                .build();
        return personDao.save(personSave);
    }

    @Override
    @Transactional(readOnly = true)
    public Person findById(Integer id_person) {
        return personDao.findById(id_person).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return (List<Person>) personDao.findAll();
    }

    @Override
    @Transactional
    public void delete(Person person) {
        personDao.delete(person);
    }
}
