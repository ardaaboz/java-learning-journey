package com.example.pet_clinic_system_with_spring_boot;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ClinicController {

    @Autowired
    PetOwnerService petOwnerService;

    @PostMapping("/create-owner")
    public String createOwner(@Valid @ModelAttribute Owner owner,
                              BindingResult bindingResult,
                              Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("owner", owner);
            return "owner-form";
        }

        try {
            petOwnerService.createOwner(owner);
            return "redirect:/owners";
        } catch (Exception e) {
            model.addAttribute("errorMessage", e.getMessage());
            return "owner-form";
        }
    }

    @PostMapping("/create-pet")
    public String createPet(@Valid @ModelAttribute Pet pet,
                              BindingResult bindingResult,
                              Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("pet", pet);
            return "pet-form";
        }

        try {
            petOwnerService.createPet(pet);
            return "redirect:/pets";
        } catch (Exception e) {
            model.addAttribute("errorMessage", e.getMessage());
            return "owner-form";
        }
    }

    @PostMapping("/assign-pet")
    public String assignPet(Pet pet, Owner owner) {
        petOwnerService.assignPet(pet, owner);
        return "redirect:/pets";
    }
}
