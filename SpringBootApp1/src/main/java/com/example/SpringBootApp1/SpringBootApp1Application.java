package com.example.SpringBootApp1;
//package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Bus;
import com.example.model.Employee;
import com.example.model.Product;

@SpringBootApplication(scanBasePackages = { "com.example.model", "com.example.config" })

//or = below 3 annotation
//@ComponentScan(basePackages = { "com.example.model","com.example.config" })
//@EnableAutoConfiguration
//@SpringBootConfiguration


public class SpringBootApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext bean = SpringApplication.run(SpringBootApp1Application.class, args);

		Employee bean2 = bean.getBean(Employee.class);
		System.out.println(bean2);

		System.out.println(bean.getBean(Bus.class));
		System.out.println(bean.getBean(Product.class));
	}

}
