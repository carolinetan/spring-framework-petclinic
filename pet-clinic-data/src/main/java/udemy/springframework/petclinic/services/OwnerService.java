package udemy.springframework.petclinic.services;

import udemy.springframework.petclinic.model.Owner;



public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}