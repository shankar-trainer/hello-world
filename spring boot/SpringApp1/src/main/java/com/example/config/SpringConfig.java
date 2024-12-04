package com.example.config;

import com.example.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Employee getEmployee(){
     return    new Employee();
    }

}
