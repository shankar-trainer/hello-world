package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.model")
@ComponentScan("com.example.controller")
public class SpringBootMvc2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvc2Application.class, args);
	}

}
