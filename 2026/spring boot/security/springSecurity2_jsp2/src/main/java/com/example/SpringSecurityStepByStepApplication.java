package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringSecurityStepByStepApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityStepByStepApplication.class, args);
    }
}

// INSERT INTO CUSTOM_USER (username, password) VALUES ('user','$2a$12$90VHdRH4EVLEt79rSsvpfOzRphVjuCxbcCXYewsTAloO5wHcecTvy');
// user, ourpassword
//https://medium.com/@ansgar.nell/spring-boot-security-step-by-step-21ea836499f8