package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.CustomerRepository;
import com.example.model.Customer;

@SpringBootApplication
public class CustomerMain  
{

	public static void main(String[] args) {
		SpringApplication.run(CustomerMain.class, args);
	}

}
