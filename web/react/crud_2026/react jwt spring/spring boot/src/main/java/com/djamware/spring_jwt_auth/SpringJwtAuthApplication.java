package com.djamware.spring_jwt_auth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.djamware.spring_jwt_auth.entities.ERole;
import com.djamware.spring_jwt_auth.entities.Role;
import com.djamware.spring_jwt_auth.repositories.RoleRepository;

@SpringBootApplication
public class SpringJwtAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtAuthApplication.class, args);
	}

	@Bean
	CommandLineRunner initRoles(RoleRepository roleRepository) {
		return args -> {
			if (!roleRepository.existsByName(ERole.ROLE_USER)) {
				roleRepository.save(new Role(null, ERole.ROLE_USER));
			}
			if (!roleRepository.existsByName(ERole.ROLE_ADMIN)) {
				roleRepository.save(new Role(null, ERole.ROLE_ADMIN));
			}
		};
	}
}
