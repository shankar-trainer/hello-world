package com.example.SpringBootRestApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.controller")
public class SpringBootRestApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApp1Application.class, args);
	}

}
