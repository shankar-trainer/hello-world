package org.com;

import org.com.model.Customer;
import org.com.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CustomerMain1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CustomerMain1.class, args);
		
		CustomerService service1=ctx.getBean(CustomerService.class);
		CustomerService service=ctx.getBean("customerService",CustomerService.class);
		
		service.getAllCustomer();
		
		Customer customer = new Customer();
		customer.setId(1);
		
		service.findCustomer(customer);
		
		
	}
}
