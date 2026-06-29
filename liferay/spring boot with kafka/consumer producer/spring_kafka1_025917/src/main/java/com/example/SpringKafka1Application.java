package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringKafka1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafka1Application.class, args);
	}

}
