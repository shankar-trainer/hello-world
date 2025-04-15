package com.capgemini.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Address;
import com.capgemini.beans.Student;

public class StudentMain {

	public static void main(String[] args) {
		//ApplicationContext 
ConfigurableApplicationContext		beanfactory = new ClassPathXmlApplicationContext("application.xml");
		
Student student=		beanfactory.getBean(Student.class);
	System.out.println(student);
	
	System.out.println("roll no is "+student.getRoll());
	System.out.println("name is "+student.getName());
	System.out.println("subject is "+student.getSubject());
	
	Address address=student.getAddress();
	
	System.out.println("\nAddress \n");
	System.out.println("\t address id "+address.getAddrId());
	System.out.println("\t address location "+address.getLocation());
	System.out.println("\t address city "+address.getCity());
	System.out.println("\t address pin "+address.getPin());
	beanfactory.close();
	}
}
