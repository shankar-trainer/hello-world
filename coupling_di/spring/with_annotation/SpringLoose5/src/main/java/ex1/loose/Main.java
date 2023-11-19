package ex1.loose;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//
//	   Employee employee = ctx.getBean("office_employee", Employee.class);
//		employee.getAddress().addressDetail();
//
//		
//		employee = ctx.getBean("home_employee", Employee.class);
//		employee.getAddress().addressDetail();

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Employee.class);

		Employee employee = ctx.getBean(Employee.class);
		
		employee.setAddress(ctx.getBean(OfficeAddress.class));
		employee.getAddress().addressDetail();
		
		//employee.setAddress(ctx.getBean(HomeAddress.class));
		//employee.getAddress().addressDetail();


	}
}