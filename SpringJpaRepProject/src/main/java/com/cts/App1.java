package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.model.Customer;
import com.cts.service.CustomerService;

@SpringBootApplication
public class App1 {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(App1.class, args);

		CustomerService service = run.getBean(CustomerService.class);

		Customer customer1 = new Customer();
		customer1.setName("mohan kumar");
		customer1.setLocation("chennai");

		Customer customer2 = new Customer();
		customer2.setName("suman kumar");
		customer2.setLocation("madurai");
		
		Customer customer3 = new Customer();
		customer3.setName("raman kumar");
		customer3.setLocation("sivkashi");
		
		service.addCustomer(customer1);
		service.addCustomer(customer2);
		service.addCustomer(customer3);
		
		
		service.getAllCustomer().forEach(a->System.out.println(a));
		
	}

}
