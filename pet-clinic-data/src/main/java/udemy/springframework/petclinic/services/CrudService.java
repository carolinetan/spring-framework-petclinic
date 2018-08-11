package udemy.springframework.petclinic.services;

import java.util.Set;


// mimic spring data CRUD service
// all service interface will implement this interface
// cutting down code duplication allowing a cleaner model

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
