package edu.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.example.model.Bus;
import edu.example.model.Driver;

public class BusTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("context.xml");

		Bus bus= beanFactory.getBean("bus1",Bus.class);

		System.out.println("reg no  is "+bus.getRegNo());
		System.out.println("bus type is "+bus.getBusType());
		System.out.println("fare "+bus.getFare());
		
		System.out.println("\nDrive Information \n");
		
		Driver driver=bus.getDriver();
		System.out.println("\tid "+driver.getId());
		System.out.println("\tname "+driver.getName());
		System.out.println("\tage "+driver.getAge());
		System.out.println("\tsalary "+driver.getSalary());
		

		System.out.println("\n inner bean\n");
		
		Bus bus2= beanFactory.getBean("bus2",Bus.class);

		System.out.println("reg no  is "+bus2.getRegNo());
		System.out.println("bus type is "+bus2.getBusType());
		System.out.println("fare "+bus2.getFare());
		
		System.out.println("\nDriver Information \n");
		
		driver=bus.getDriver();
		System.out.println("\tid "+driver.getId());
		System.out.println("\tname "+driver.getName());
		System.out.println("\tage "+driver.getAge());
		System.out.println("\tsalary "+driver.getSalary());

		
		

	}
	
}
