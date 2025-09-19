package com.example.pet_clinic_system_with_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private CustomDetailsService userDetailsService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/", "/register", "/login", "/css/**", "/js/**", "/images/**")
                        .permitAll()

                        .requestMatchers("/admin/**")
                        .hasRole("ADMIN")

                        .requestMatchers("/pets/**")
                        .hasAnyRole("VET", "ADMIN")

                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .defaultSuccessUrl("/dashboard", true)  // Where to go after successful login
                        .failureUrl("/login?error=true")        // Where to go after failed login
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")                   // POST to this URL to logout
                        .logoutSuccessUrl("/login?logout=true") // Where to go after logout
                        .permitAll()
                )
                .userDetailsService(userDetailsService);    // Use our custom user loading service

        return http.build();
    }
}