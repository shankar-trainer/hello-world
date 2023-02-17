package com.tvscredit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tvscredit.model.Employee;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
  ConfigurableApplicationContext ctx = SpringApplication.run(MainApp.class, args);		
	Employee bean = ctx.getBean(Employee.class);
	
	System.out.println("Employee information");
	System.out.println("Id "+bean.getId());
	System.out.println("name "+bean.getName());
	}
}
