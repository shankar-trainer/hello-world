import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app1.Customer;
import app1.Employee;
import app1.Student;

public class StudentMain {

	public static void main(String[] args) {

		//BeanFactory 
		ApplicationContext
		
		beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Student st = beanFactory.getBean("stud", Student.class);

		System.out.println(st.getRoll()+" "+st.getName());
		System.out.println(st.getBday().getLocalDate()+" "+st.getBday().getLocation());

	}

}
