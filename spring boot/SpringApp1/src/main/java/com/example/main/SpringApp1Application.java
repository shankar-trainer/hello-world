//package com.example;
package com.example.main;

import com.example.config.SpringConfig;
import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.example.model","com.example.config"})

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.example.model"})

public class SpringApp1Application {

	public static void main(String[] args) {

		//SpringApplication.run(SpringApp1Application.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringApp1Application.class, args);
		//Employee bean = ctx.getBean(Employee.class);
        //System.out.println(bean);

		System.out.println(ctx.getBean(SpringConfig.class).getEmployee());

	}


}
