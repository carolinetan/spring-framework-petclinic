package udemy.springframework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import udemy.springframework.petclinic.model.Owner;
import udemy.springframework.petclinic.model.Vet;
import udemy.springframework.petclinic.services.OwnerService;
import udemy.springframework.petclinic.services.VetService;
import udemy.springframework.petclinic.services.map.OwnerServiceMap;
import udemy.springframework.petclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        // load test data here
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Daniel");
        owner1.setLastName("Achacon");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Neil");
        owner2.setLastName("Peters");
        ownerService.save(owner2);

        System.out.println("Loaded 2 owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Frankie");
        vet1.setLastName("Fazio");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Kyla");
        vet2.setLastName("Achacon");
        vetService.save(vet2);

        System.out.println("Loaded 2 vets....");
    }
}
