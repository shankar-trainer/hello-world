package org.tvscredit.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tvscredit.model.Address;
import org.tvscredit.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
//		Employee emp = (Employee) factory.getBean("emp1");
		Employee emp =  factory.getBean("emp1",Employee.class);
		
		Employee emp1 =  factory.getBean("emp1",Employee.class);
		
		emp1.setEmpId(8001);
		emp1.setEmpName("shiv kumar");
		emp1.setEmpsalary(56000);
		
		System.out.println("Employee1 Information ");
		
		System.out.println("id "+emp.getEmpId());
		System.out.println("name "+emp.getEmpName());
		System.out.println("salary "+emp.getEmpsalary());

		Address address=emp1.getAddress();
		System.out.println("\nemployee1 address \n\naddress id "+address.getAddrId());
		System.out.println("address city "+address.getAddrCity());
		System.out.println("address street "+address.getAddrStreet());
		System.out.println("address pin "+address.getAddrPin());
		
		System.out.println("\nEmployee2 Information ");
		
		System.out.println("id "+emp1.getEmpId());
		System.out.println("name "+emp1.getEmpName());
		System.out.println("salary "+emp1.getEmpsalary());

		System.out.println("Employee2 Address ");
		Address address1=emp1.getAddress();
		System.out.println("\n \n\naddress id "+address1.getAddrId());
		System.out.println("address city "+address1.getAddrCity());
		System.out.println("address street "+address1.getAddrStreet());
		System.out.println("address pin "+address1.getAddrPin());
		
				
		
	}

}
