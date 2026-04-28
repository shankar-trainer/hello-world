package com.cts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	// authentication -- checks username, password
	@Bean
	public UserDetailsService detailsService() {

		UserDetails userDetails1 = User.withDefaultPasswordEncoder().username("ram kumar").password("abcd")
				.roles("USER").build();
		UserDetails userDetails2 = User.withDefaultPasswordEncoder().username("shyam kumar").password("xyz")
				.roles("ADMIN").build();

//		InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager(userDetails);
		InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager(userDetails1, userDetails2);
		return detailsManager;
	}

// authorization   -- which user has which role , which role has permission
	public SecurityFilterChain filterChain(HttpSecurity http) {

//	 return http.authorizeHttpRequests(auth->auth.anyRequest().authenticated()) 
//	 .formLogin(Customizer.withDefaults()).build() ;   //  anyRequest().authenticated()  it allows every user  to be authenticated 

//		below not work In Spring Security, hasRole("USER") automatically checks for the prefix ROLE_
		//If you don't want to use prefixes, use hasAuthority("USER") instead
		
//		return http
//				.authorizeHttpRequests(
//						auth -> auth.requestMatchers("/hello").hasRole("USER").anyRequest().authenticated())
//				.formLogin(Customizer.withDefaults()).build();   // only User with /hello is allowed
		//auth.requestMatchers("/hello").hasAuthority("USER")
		
		return http
				.authorizeHttpRequests(
						auth -> auth.requestMatchers("/hello").hasRole("ROLE_USER").anyRequest().authenticated())
				.formLogin(Customizer.withDefaults()).build();   // only User with /hello is allowed
		
//		return http
//				.authorizeHttpRequests(
//						auth -> auth.requestMatchers("/hello").permitAll().requestMatchers("/welcome").denyAll())
//				.formLogin(Customizer.withDefaults()).build();  // only hello is allowed for every users and /welcome is denied for all users 
	}

}
