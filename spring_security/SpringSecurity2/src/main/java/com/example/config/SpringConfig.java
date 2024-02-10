package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringConfig {

	@Bean
	public UserDetailsService getUserDetail() {
		InMemoryUserDetailsManager userDetail = new InMemoryUserDetailsManager();
		UserDetails user = User.withUsername("ram kumar").password("1234").authorities("read").build();

		userDetail.createUser(user);
		return userDetail;

	}

	@Bean
	public PasswordEncoder getEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	public SecurityFilterChain getFilterChain(HttpSecurity http) throws Exception{
		  
	return	 http.csrf().disable().authorizeHttpRequests().requestMatchers("/auth/welcome").permitAll()
//		.and().authorizeHttpRequests().requestMatchers("/hello").authenticated().and().httpBasic().and().build();
	.and().authorizeHttpRequests().requestMatchers("/hello").authenticated().and().formLogin().and().build();
		
	}

}
