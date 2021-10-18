import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app1.Customer;
import app1.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		//BeanFactory 
		ApplicationContext
		
		beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Employee employee = beanFactory.getBean("emp1", Employee.class);

		System.out.println(employee);

	}

}
