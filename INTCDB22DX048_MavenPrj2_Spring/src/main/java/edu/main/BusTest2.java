package edu.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.example.model.Bus;
import edu.example.model.Driver;

public class BusTest2 {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("context2.xml");

		Bus bus= beanFactory.getBean("bus3",Bus.class);

		System.out.println("reg no  is "+bus.getRegNo());
		System.out.println("bus type is "+bus.getBusType());
		System.out.println("fare "+bus.getFare());
		
		System.out.println("\nDrive Information \n");
		
		Driver driver=bus.getDriver();
		System.out.println("\tid "+driver.getId());
		System.out.println("\tname "+driver.getName());
		System.out.println("\tage "+driver.getAge());
		System.out.println("\tsalary "+driver.getSalary());
		
		

	}
	
}
