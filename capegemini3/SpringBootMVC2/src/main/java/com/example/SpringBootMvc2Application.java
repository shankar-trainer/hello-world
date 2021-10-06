//package com.example.main;
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.example.model")
@ComponentScan("com.example.controller")
@ComponentScan("com.example.dao")
public class SpringBootMvc2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvc2Application.class, args);
	}
}
