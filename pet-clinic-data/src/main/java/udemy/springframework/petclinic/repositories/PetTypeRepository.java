package udemy.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
