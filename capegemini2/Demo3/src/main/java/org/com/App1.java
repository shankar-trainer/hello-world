package org.com;

import org.com.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App1 {

	public static void main(String args[]) {

		ConfigurableApplicationContext ctx = SpringApplication.run(App1.class, args);

		Employee emp = ctx.getBean(Employee.class);

		System.out.println(emp);
	}
	
}
@RestController
class MyClass{
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
}
