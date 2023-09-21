package org.coforge;

import org.coforge.bean.Employee;
import org.coforge.bean.Hello;
import org.coforge.bean.HelloImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		BeanFactory ctx = new ClassPathXmlApplicationContext("beans.xml");

		Employee employee1 = (Employee) ctx.getBean("emp1");

		employee1.setEmpId(90001);
		employee1.setEmpName("mukul anand");
		employee1.setEmpSalary(23000);
		
		Employee employee2 = ctx.getBean("emp1", Employee.class);

		employee2.setEmpId(90002);
		employee2.setEmpName("sameer anand");
		employee2.setEmpSalary(23900);
		
		
		System.out.println(employee1);
		System.out.println(employee2);

	}
}
