package com.example.config;

import com.example.model.Address;
import com.example.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration()
public class AppConfig {

    @Bean
    //@Scope("prototype")
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setId(10001);
        employee.setName("amit kumar");
        employee.setSalary(12000);
//        Address address = new Address();
//        address.setAddrId(1);
//        address.setCity("noida");
//        address.setLocation("sector 62");
       // employee.setAddress(address);
        return employee;
    }
}
