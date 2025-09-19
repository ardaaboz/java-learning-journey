package com.example.pet_clinic_system_with_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PetOwnerService {

    @Autowired
    PetRepository petRepository;
    @Autowired
    OwnerRepository ownerRepository;

    public void createOwner(Owner newOwner) {
        ownerRepository.save(newOwner);
    }

    public void createPet(Pet newPet) {
        petRepository.save(newPet);
    }

    public void assignPet(Pet pet, Owner owner) {
        owner.getPets().add(pet);
        pet.setOwner(owner);

        ownerRepository.save(owner);
        petRepository.save(pet);
    }


}
