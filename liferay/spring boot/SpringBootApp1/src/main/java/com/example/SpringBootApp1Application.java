package com.example;

import com.example.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication//(scanBasePackages = "com.example.model")
public class SpringBootApp1Application {

	public static void main(String[] args) {
        //1. old way
//		SpringApplication.run(SpringBootApp1Application.class, args);
       //2. new way
        ConfigurableApplicationContext ctx =
                SpringApplication.run(SpringBootApp1Application.class, args);

//        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp = ctx.getBean(Employee.class);
        System.out.println(emp);

    }

}
