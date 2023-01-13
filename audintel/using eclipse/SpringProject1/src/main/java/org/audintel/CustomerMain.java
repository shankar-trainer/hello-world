package org.audintel;

import org.audintel.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Employee emp1 = beanFactory.getBean("emp1", Employee.class);
		Employee emp2 = beanFactory.getBean("emp1", Employee.class);

		emp2.setId(545454);
		emp2.setName("amit kumar");
		emp2.setSalary(566556);		

		System.out.println(emp1.getId()+"\t"+emp1.getName()+"\t"+emp1.getSalary());
		System.out.println(emp2.getId()+"\t"+emp2.getName()+"\t"+emp2.getSalary());
	}
}
