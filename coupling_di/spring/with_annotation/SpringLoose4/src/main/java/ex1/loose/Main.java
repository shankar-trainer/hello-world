package ex1.loose;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {


		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee = ctx.getBean(Employee.class);

		employee.getAddress().addressDetail();


	}
}