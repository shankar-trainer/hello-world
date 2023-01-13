package com.tvscredit;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.*;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
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