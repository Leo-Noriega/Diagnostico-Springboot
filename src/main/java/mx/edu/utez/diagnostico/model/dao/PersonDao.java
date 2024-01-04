package mx.edu.utez.diagnostico.model.dao;

import mx.edu.utez.diagnostico.model.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Integer> {
}
