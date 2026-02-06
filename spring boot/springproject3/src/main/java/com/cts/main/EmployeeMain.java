package com.cts.main;

import com.cts.config.ApplicationConfig;
import com.cts.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

public class EmployeeMain {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Employee bean = context.getBean(Employee.class);
        Employee bean1 = context.getBean(Employee.class);
        bean1.setId(1);
        bean1.setName("amitendra");
        bean1.setDob(LocalDate.of(1992,11,25));

        System.out.println(bean);
        System.out.println(bean1);
    }
}

