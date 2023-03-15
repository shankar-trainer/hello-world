package com.abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abc.model.Customer;

import com.abc.dao.CustomerRepository;

@SpringBootApplication
public class AccessingDataMongodbApplication // implements CommandLineRunner
{
//	@Autowired
//	private CustomerRepository repository;

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(AccessingDataMongodbApplication.class, args);
		CustomerRepository bean = run.getBean(CustomerRepository.class);
		System.out.println("---------------------------------");
		System.out.println("\n\n\n");

		bean.findAll().forEach(a -> System.out.println(a));

		System.out.println("\n size " + bean.findAll().size());

		System.out.println("\n\n\n");
		for (Customer cs : bean.findAll()) {
			System.out.println(cs.getUserId() + "\t" + cs.getFirstName() + "\t" + cs.getLastName());
		}
		System.out.println("---------------------------------");

	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		repository.deleteAll();
//
//		// save a couple of customers
//		repository.save(new Customer("Alice", "Smith"));
//		repository.save(new Customer("Bob", "Smith"));
//
//		// fetch all customers
//		System.out.println("Customers found with findAll():");
//		System.out.println("-------------------------------");
//		for (Customer customer : repository.findAll()) {
//			System.out.println(customer);
//		}
//		System.out.println();
//
//		// fetch an individual customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findByFirstName("Alice"));
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (Customer customer : repository.findByLastName("Smith")) {
//			System.out.println(customer);
//		}
//
//	}

}
