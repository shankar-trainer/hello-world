package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.exception.InsuranceException;
import com.example.model.Insurance;
import com.example.model.User;
import com.example.service.InsuranceService;

@SpringBootApplication
public class MainApp1 implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MainApp1.class, args);
	}

	@Autowired
	InsuranceService service;
	
	@Autowired
	User user;
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Insuarance Add Operation");

		Insurance insurance = new Insurance();
		insurance.setId(101);
		insurance.setName("jeevan samirdhi");
		insurance.setDuration(5);
		insurance.setPayment(25000);

		Insurance insurance1 = new Insurance();
		insurance1.setId(102);
		insurance1.setName("jeevan komal");
		insurance1.setDuration(10);
		insurance1.setPayment(20000);

		try {
			System.out.println("Insurance Get All Operation");

			service.getAllInsurance().forEach(System.out::println);
		} catch (InsuranceException e) {
			System.err.println(e);
		}

		try {
			service.addInsurance(insurance);
			service.addInsurance(insurance1);
			service.addInsurance(insurance);
		} catch (InsuranceException e) {
			System.err.println(e);
		}
		try {
			System.out.println("Insurance Get All Operation");

			service.getAllInsurance().forEach(System.out::println);
		} catch (InsuranceException e) {
			System.err.println(e);
		}
	}
}
