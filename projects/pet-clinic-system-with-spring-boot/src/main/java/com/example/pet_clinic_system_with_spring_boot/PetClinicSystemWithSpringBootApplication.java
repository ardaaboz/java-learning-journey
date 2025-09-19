package com.example.pet_clinic_system_with_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PetClinicSystemWithSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PetClinicSystemWithSpringBootApplication.class, args);

		// Get the UserService bean from the Spring context
		UserService userService = context.getBean(UserService.class);

		// Now you can call methods on userService
		userService.registerUser("admin", "admin123", "admin@clinic.com", Role.ADMIN);
		userService.registerUser("vet1", "vet123", "vet1@clinic.com", Role.VET);
		userService.registerUser("receptionist", "receptionist123", "receptionist1@clinic.com", Role.RECEPTIONIST);

		System.out.println("Users created successfully!");
	}
}