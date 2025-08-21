package com.example.my.first.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/hobbies")
    public String hobbies() {
        return "hobbies";
    }

    @GetMapping("/contacts")
    public String contacts() {
        return "contacts";
    }
}
