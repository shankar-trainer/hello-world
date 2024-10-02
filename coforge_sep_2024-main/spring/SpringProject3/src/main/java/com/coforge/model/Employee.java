package com.coforge.model;

import lombok.Data;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

@Data

public class Employee {

    private int empId;
    private String  empName;
    private float empSalary;

//    @PostConstruct
//    public void init(){
//        this.empId=10001;
//        this.empSalary=67000;
//        this.empName="hari kumar";
//    }
}
