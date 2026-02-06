package com.cts.main;

import com.cts.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

        Employee employee = (Employee) beanFactory.getBean("emp1");

        System.out.println("employee information");
        System.out.println("\t id : " + employee.getId());
        System.out.println("\t name : " + employee.getName());

        Employee employee1 = (Employee) beanFactory.getBean("emp1");
        employee1.setId(20000);
        employee1.setName("suraj kumar");

        System.out.println("employee1 information");
        System.out.println("\t id : " + employee.getId());
        System.out.println("\t name : " + employee.getName());

        System.out.println("employee2 information");
        System.out.println("\t id : " + employee1.getId());
        System.out.println("\t name : " + employee1.getName());



    }
}
