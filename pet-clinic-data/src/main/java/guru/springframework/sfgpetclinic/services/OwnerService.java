package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastNanme);

    Owner findById(long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
