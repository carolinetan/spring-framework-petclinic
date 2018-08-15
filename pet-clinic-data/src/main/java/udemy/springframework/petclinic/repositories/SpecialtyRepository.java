package udemy.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework.petclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
