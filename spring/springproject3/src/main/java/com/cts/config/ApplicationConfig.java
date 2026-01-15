package com.cts.config;
import com.cts.model.Employee;
import com.cts.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

@Configuration
public class ApplicationConfig {

    @Bean
    @Lazy(true)
    public User createUser(){
        return  new User();
    }

    @Bean
//    @Scope("singleton")
  @Scope("prototype")
    public Employee getEmployee(){
        System.out.println("getEmployee called ");
        Employee employee=new Employee();
        employee.setId(878787);
        employee.setName("amrit kumar");
        employee.setDob(LocalDate.of(2001,11,22));
        return  employee;
    }
}
