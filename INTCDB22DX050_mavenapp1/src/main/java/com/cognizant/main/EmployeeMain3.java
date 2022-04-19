package com.cognizant.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Address;
import com.cognizant.model.Employee;

public class EmployeeMain3 {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

//		Employee e = factory.getBean("emp1", Employee.class);
		Employee e = factory.getBean("emp3", Employee.class);
		Address address=e.getAddress();
		
		System.out.println("Employee data ");
		System.out.println("\tid "+e.getId());
		System.out.println("\tname "+e.getName());
		System.out.println("\tsalary "+e.getSalary());
		
		System.out.println("\naddress\n");
		System.out.println("\tid "+address.getAddrId());
		System.out.println("\tlocation "+address.getAddrLocation());
		System.out.println("\tpin "+address.getAddrPin());
		
	}
}
