package org.abc.main;

import org.abc.model.Address;
import org.abc.model.Employee;
import org.abc.model.Hello;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;

/**
 * Created by shankar on 4/11/2023.
 */
public class EmployeeMain {
    public static void main(String[] args) {

        //BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");

        BeanFactory beanFactory = new FileSystemXmlApplicationContext("C:\\Users\\shankar\\IdeaProjects\\SpringPorject1\\src\\main\\resources\\beans.xml");

        Employee employee = beanFactory.getBean("emp1", Employee.class);
        Employee employee1 = beanFactory.getBean("emp1", Employee.class);

        Address address = employee.getAddress();

        employee1.setEmpId(67676776);
        employee1.setEmpName("surendra kumar");
        employee1.setEmpSalary(780000);


        System.out.println(employee);
        System.out.println(address);

        System.out.println(employee1);

    }
}
