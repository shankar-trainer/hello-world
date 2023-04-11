package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args)  {
        BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
        Employee  employee = factory.getBean(Employee.class);
        System.out.println("Name is "+employee.getName());
        System.out.println("Id is "+employee.getId());
        System.out.println("Salary is "+employee.getSalary());
        System.out.println("\nAddress is  ");

        Address address = employee.getAddress();

        System.out.println("address is "+address.getAddrId());
        System.out.println("city is "+address.getCity());
        System.out.println("state is "+address.getState());
        System.out.println("country  is "+address.getCountry());
    }
}

