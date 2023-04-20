package com.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@PropertySource("employee.properties")

public class Employee {
    @Value("${employee.id}")
    private int empId;
    @Value("${employee.name}")
    private String empName;
    @Value("${employee.salary}")
    private float empSalary;

    //@PostConstruct
    public void init() {
        this.empId = 988989;
        this.empName = "mohan kumar";
        this.empSalary = 70000;
    }


}
