package com.example.springbootgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootgradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootgradleApplication.class, args);
	}
	@GetMapping("/")
	public String hello(){
		return "hello world";
	}

}
//gradle bootRun
//gradlew bootRun
