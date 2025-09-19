package com.example.my.first.app;

import com.zaxxer.hikari.util.IsolationLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class HobbyController {

    @Autowired
    private HobbyService hobbyService;

    @PostMapping("/add-hobby")
    public String addHobby(@RequestParam String name, @RequestParam String difficulty) {
        try {
            hobbyService.createHobby(name, difficulty);
            return "redirect:/hobbies-display";
        } catch (IllegalArgumentException e) {
            return "redirect:/add-hobby-form";
        }
    }

    @PostMapping("/delete-hobby")
    public String deleteHobby(@RequestParam long id) {
        try {
            hobbyService.deleteHobby(id);
            return "redirect:/hobbies-display";
        } catch (IllegalArgumentException e) {
            return "redirect:/delete-hobby-form";
        }

    }

    @GetMapping("/add-hobby-form")
    public String showAddHobbyForm() {
        return "add-hobby-form";
    }

    @GetMapping("/delete-hobby-form")
    public String showDeleteHobbyForm() {
        return "delete-hobby-form";
    }

    @GetMapping("/hobbies-display")
    public String showHobbies(Model model) {
        model.addAttribute("hobbies", hobbyService.getAllHobbies());
        return "hobbies-display";
    }
}
