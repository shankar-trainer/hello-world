package com.coforge.config;

import com.coforge.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(value = "prototype")
    public Employee getEmployee(){
       //return new Employee();
        Employee employee=new Employee();
        employee.setEmpId(96567);
        employee.setEmpSalary(45000);
        employee.setEmpName("jai kumar");
        return  employee;
    }

}
