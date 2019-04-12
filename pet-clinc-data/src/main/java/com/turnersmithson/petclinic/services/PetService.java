package com.turnersmithson.petclinic.services;

import com.turnersmithson.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id );

    Pet save( Pet pet );

    Set<Pet> findAll( );

}
