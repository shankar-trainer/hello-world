package edu.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.example.model.Employee;

public class EmployeeMain2 {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Employee e = (Employee) beanFactory.getBean("emp1");

		e.setId(9001);
		e.setName("anand kumar");
		e.setSalary(67000);
		e.setPf(0.7f);

		Employee e1 = (Employee) beanFactory.getBean("emp1");

		e1.setId(9002);
		e1.setName("babu lal");
		e1.setSalary(47000);
		e1.setPf(0.6f);

		System.out.println("\n employee1");
		System.out.println("Id is " + e.getId());
		System.out.println("name  is " + e.getName());
		System.out.println("salary is " + e.getSalary());
		System.out.println("pf is " + e.getPf());
		System.out.println("gross salary  " + e.grossSalary());

		
		System.out.println("\n employee2");
		System.out.println("Id is " + e1.getId());
		System.out.println("name  is " + e1.getName());
		System.out.println("salary is " + e1.getSalary());
		System.out.println("pf is " + e1.getPf());
		System.out.println("gross salary  " + e1.grossSalary());
		
	}

}
