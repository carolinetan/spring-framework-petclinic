package udemy.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import udemy.springframework.petclinic.model.Speciality;
import udemy.springframework.petclinic.model.Vet;
import udemy.springframework.petclinic.services.SpecialityService;
import udemy.springframework.petclinic.services.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialtyService;



    public VetMapService(SpecialityService specialtyService) {
        this.specialtyService = specialtyService;
    }



    @Override

    public Set<Vet> findAll() {
        return super.findAll();
    }



    @Override

    public Vet findById(Long id) {

        return super.findById(id);

    }



    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0){

            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = specialtyService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });

        }
        return super.save(object);
    }


    @Override
    public void delete(Vet object) {
        super.delete(object);
    }



    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}