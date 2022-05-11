package com.cognizant;

import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.dao.ShoppingKartDao;
import com.cognizant.model.Customer;
import com.cognizant.model.Employee;
import com.cognizant.model.Product;

@SpringBootApplication
public class App  
//implements CommandLineRunner
{

	public static void main(String[] args) {

 SpringApplication.run(App.class, args);

 /*
 ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);

		Employee emp = ctx.getBean(Employee.class);
		System.out.println("id is " + emp.getId());
		System.out.println("name is " + emp.getName());
		System.out.println("salary is " + emp.getSalary());
//----------------------------------------------		
		Customer cust = ctx.getBean(Customer.class);
		System.out.println("id is " + cust.getCustomerId());
		System.out.println("name is " + cust.getCustomerName());
		System.out.println("salary is " + cust.getCustomerSalary());

		ctx.close();
*/		
	}
/*
	@Autowired
	ShoppingKartDao dao;

	@Override
	public void run(String... args) throws Exception {
		Product prd[] = new Product[] { new Product(100001, "my flat", 4500000), new Product(100002, "car", 600000),
				new Product(100003, "bike", 150000), new Product(100004, "farm house", 6000000), };
		for (Product p : prd)
			dao.addProduct(p);

		System.out.println("all products are \n");
		for (Entry<Integer, Product> p : dao.showAllProduct().entrySet())
			System.out.println(p.getValue());
		
	}*/
}
