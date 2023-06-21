package com.tvscredit;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.*;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Client
public class MainApp {
	@GetMapping("/")
	public String disp(Principal principal) {
		return "welcome to spring boot oauth application<br>name of  user :" + principal.getName();
	}

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}
}


//@SpringBootApplication
//@RestController
//@EnableOAuth2Client
//public class MainApp extends WebSecurityConfigurerAdapter {
//	@GetMapping("/")
//	public String disp(Principal principal) {
//		return "welcome to spring boot oauth application<br>name of  user :" + principal.getName();
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// @formatter:off
//		http
//				.authorizeRequests(a -> a
//						.antMatchers("/", "/error", "/webjars/**").permitAll()
//						.anyRequest().authenticated()
//				)
//				.exceptionHandling(e -> e
//						.authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
//				)
//				.oauth2Login();
//		// @formatter:on
//	}
//
//
//	public static void main(String[] args) {
//		SpringApplication.run(MainApp.class, args);
//	}
//}