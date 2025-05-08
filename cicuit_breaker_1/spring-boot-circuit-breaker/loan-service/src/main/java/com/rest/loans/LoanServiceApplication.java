package com.rest.loans;

import com.rest.loans.entities.Loan;
import com.rest.loans.repositories.LoanRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class LoanServiceApplication {

	@Autowired
	private LoanRepository loanRepository;

	public static void main(String[] args) {
		SpringApplication.run(LoanServiceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@PostConstruct
	public void setupData() {
		loanRepository.saveAll(Arrays.asList(
			Loan.builder().type("PERSONAL").amount(200000.0).interest(0.0).build(),
			Loan.builder().type("HOUSING").amount(6000000.0).interest(0.0).build(),
			Loan.builder().type("PERSONAL").amount(100000.0).interest(0.0).build()
		));
	}
}
