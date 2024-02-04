package com.se.alaf.security;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.se.alaf.security.model.RoleA;
import com.se.alaf.security.model.UserA;
import com.se.alaf.security.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringSecurity6Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity6Application.class, args);
	}

/*
	@Bean
	public UserDetailsService userDetailsService() {
		
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
		UserDetails alaf = User.builder().username("alaf").password(passwordEncoder.encode("password"))
				.authorities("staff", "admin").build();
	
		UserDetails staff = User.builder().username("staff").password(passwordEncoder.encode("password"))
				.authorities("staff").build();

		return new InMemoryUserDetailsManager(alaf, staff);
	}
	*/
	
	@Autowired
	UserRepository customerRepo;;
	
	@PostConstruct
	public void init() {
		
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		UserA admin = UserA.builder()
				.username("alaf")
				.password(passwordEncoder.encode("password"))
				.roleList(Arrays.asList(RoleA.builder().name("admin").build(), RoleA.builder().name("staff").build())).build();
		
		customerRepo.save(admin);
		
		UserA staff = UserA.builder()
				.username("staff")
				.password(passwordEncoder.encode("password"))
				.roleList(Arrays.asList(RoleA.builder().name("staff").build())).build();
		
		customerRepo.save(staff);
	}
}
