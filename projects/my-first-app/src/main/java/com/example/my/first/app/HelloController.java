package com.example.my.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello World!!!!!!!!!11";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to my page orospu cocugu!!";
    }
}
