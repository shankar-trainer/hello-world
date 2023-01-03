package com.example;

import com.example.model.Employee;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        Employee bean = context.getBean("emp1", Employee.class);
        //Employee bean = context.getBean("getBean",Employee.class);

        System.out.println("Employee Data using @PropertySource \nId is \t"+bean.getId() + "\nName is \t" + bean.getName() + "\n\tSalary is " + bean.getSalary());
    }

    @Value("${app}")
    String myapp;

    @Autowired
    User user;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("app  is " + myapp);
        System.out.println("user data....from application.properties");
        System.out.println("\tuser id "+user.getId());
        System.out.println("\tuser name "+user.getName());
        System.out.println("\tuser salary "+user.getSalary());
    }


    @Bean
    public Employee getBean() {
        System.out.println("getBean called");
        Employee emp1 = new Employee();
        emp1.setId(10001);
        emp1.setName("d k sharma");
        emp1.setSalary(120000);
        return emp1;
    }

}
