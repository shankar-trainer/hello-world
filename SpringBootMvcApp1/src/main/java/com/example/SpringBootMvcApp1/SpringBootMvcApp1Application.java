package com.example.SpringBootMvcApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages =  {"com.example.controller"})
public class SpringBootMvcApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcApp1Application.class, args);
	}

}
