package com.example.springBootApp1;

import com.example.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.example.model","com.example.springBootApp1"})
//@ComponentScan
//@EnableAutoConfiguration
//@SpringBootConfiguration

public class SpringBootApp1Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootApp1Application.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootApp1Application.class, args);
		Employee employee = ctx.getBean(Employee.class);
		System.out.println("Employee Information ");
		System.out.println("id :"+employee.getId());
		System.out.println("name :"+employee.getName());
		System.out.println("salary :"+employee.getSalary());

		System.out.println("\nEmployee Address  Information ");

		Address address = ctx.getBean(Address.class);
		System.out.println("Address Id "+address.getAddrId());
		System.out.println("Address City "+address.getAddrCity());
		System.out.println("Address Pin "+address.getAddrPin());

		System.out.println("Birth day "+employee.getBirthday());

		Product product= ctx.getBean(Product.class);
		System.out.println(product);

	}

}
