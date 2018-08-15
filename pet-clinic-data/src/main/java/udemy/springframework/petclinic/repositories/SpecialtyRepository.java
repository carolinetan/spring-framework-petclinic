package udemy.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework.petclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
