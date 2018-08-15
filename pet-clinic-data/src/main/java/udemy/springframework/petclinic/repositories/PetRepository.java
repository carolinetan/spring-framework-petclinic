package udemy.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
