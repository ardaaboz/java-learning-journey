package com.example.pet_clinic_system_with_spring_boot;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Name can not be empty")
    @Size(min = 2, max = 50, message = "Name must be between 2-50 characters")
    private String name;

    private String species;
    private String breed;

    @Past(message = "Birthday must be in the past")
    private LocalDate birthDay;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Pet() {}

    public Pet(String name, String species, String breed, LocalDate birthDay) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.birthDay = birthDay;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getSpecies() {
        return species;
    }
    public LocalDate getBirthDay() {
        return birthDay;
    }
    public Owner getOwner() {
        return owner;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
