package com.example;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Insurance;
import com.example.repository.InsuranceRepository;

@SpringBootApplication
public class SpringBootApp11Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp11Application.class, args);
	}

	@Autowired
	InsuranceRepository repository;

	@Override
	public void run(String... args) throws Exception {

		Insurance ar[] = new Insurance[] {
				Insurance.builder().insuranceName("health insurance").startDate(LocalDate.now()).years(10).build(),
				Insurance.builder().insuranceName("bike insurance").startDate(LocalDate.of(2022, 12, 12)).years(1)
						.build(),
				Insurance.builder().insuranceName("home insurance").startDate(LocalDate.of(2021, 12, 12)).years(5)
						.build(),
				Insurance.builder().insuranceName("mobile insurance").startDate(LocalDate.of(2020, 12, 12)).years(10)
						.build() };

		repository.saveAll(Arrays.asList(ar));

	}

}
//http://localhost:8080/swagger-ui/index.html
