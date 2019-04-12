package com.turnersmithson.petclinic.services;

import com.turnersmithson.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

        Owner findByLastName( String lastName );
}
