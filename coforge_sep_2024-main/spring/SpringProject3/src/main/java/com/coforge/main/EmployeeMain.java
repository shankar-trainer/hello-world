package com.coforge.main;

import com.coforge.config.AppConfig;
import com.coforge.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp1 = context.getBean(Employee.class);
        Employee emp2 = context.getBean(Employee.class);

        emp2.setEmpName("rohit verma");
        emp2.setEmpSalary(12000);
        emp2.setEmpId(678);

        System.out.println(emp1);
        System.out.println(emp2);


    }
}
