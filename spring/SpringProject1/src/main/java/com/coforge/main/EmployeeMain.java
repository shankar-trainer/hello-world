package com.coforge.main;

import com.coforge.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {

        BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
        Employee employee = beanFactory.getBean("employee", Employee.class);

        Employee employee1 = (Employee)beanFactory.getBean("employee");

        System.out.println(employee);
        System.out.println(employee1);

        System.out.println(employee.equals(employee1));

        employee1.setId(90001);
        employee.setName("suresh kumar");
        employee.setSalary(45000);

        System.out.println(employee);
        System.out.println(employee1);

        System.out.println(employee.equals(employee1));


    }
}
