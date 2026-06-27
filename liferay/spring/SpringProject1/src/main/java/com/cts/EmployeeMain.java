package com.cts;

import com.cts.model.Employee;
import com.cts.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext
                ("beans.xml");

        Employee emp  =factory.getBean(Employee.class,"emp1");

        System.out.println(emp);
    }
}
