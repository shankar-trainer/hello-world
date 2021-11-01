package ogg.capg.main;

import org.capg.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		//BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory beanFactory = new FileSystemXmlApplicationContext("../SpringExample1/src/main/resources/beans.xml");
		
	//	Employee bean = (Employee) beanFactory.getBean("emp1");
		Employee bean = beanFactory.getBean("emp1",Employee.class);
		Employee bean1 = beanFactory.getBean("emp1",Employee.class);
		
		bean1.setId(1);
		bean1.setName("sundar c");
		bean1.setSalary(78000);
		
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getSalary());
		
		System.out.println("\n");
		System.out.println(bean1.getId());
		System.out.println(bean1.getName());
		System.out.println(bean1.getSalary());
		
		
	}
}
