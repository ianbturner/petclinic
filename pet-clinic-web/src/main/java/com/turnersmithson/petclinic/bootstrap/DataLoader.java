package com.turnersmithson.petclinic.bootstrap;

import com.turnersmithson.petclinic.model.Owner;
import com.turnersmithson.petclinic.model.Vet;
import com.turnersmithson.petclinic.services.OwnerService;
import com.turnersmithson.petclinic.services.VetService;
import com.turnersmithson.petclinic.services.map.OwnerServiceMap;
import com.turnersmithson.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;



    public DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();

        owner1.setId(1L);
        owner1.setFirstName( "Michael" );
        owner1.setLastName( "Weston" );

        ownerService.save( owner1 );

        Owner owner2 = new Owner();

        owner2.setId(2L);
        owner2.setFirstName( "Fiona" );
        owner2.setLastName( "Glenanne" );

        System.out.println( "Loaded the owners" );

        ownerService.save( owner2 );

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Bob");
        vet2.setLastName("Builder");
        vetService.save( vet2 );

        System.out.println( "Loaded the vets" );

    }
}
