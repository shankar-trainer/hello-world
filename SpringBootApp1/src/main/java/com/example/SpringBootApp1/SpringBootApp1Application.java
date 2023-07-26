package com.example.SpringBootApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.model.Employee;

//@SpringBootApplication=@Component+@EnableAutoConfiguration+@Configuration

@SpringBootApplication(scanBasePackages = "com.example.model")

//@ComponentScan(basePackages = "com.example.model")
//@EnableAutoConfiguration
//@Configuration
public class SpringBootApp1Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootApp1Application.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootApp1Application.class, args);
		Employee bean = ctx.getBean(Employee.class);
		System.out.println(bean);
		//System.out.println(bean.getId()+"\t"+bean.getName()+"\t"+bean.getSalary());
	}
}
