package com.turnersmithson.petclinic.services;

import com.turnersmithson.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id );

    Vet save( Vet vet );

    Set<Vet> findAll( );
}
