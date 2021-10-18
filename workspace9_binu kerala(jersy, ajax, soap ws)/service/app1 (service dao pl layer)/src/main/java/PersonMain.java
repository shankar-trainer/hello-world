import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app1.Book;
import app1.Customer;
import app1.Employee;
import app1.Person;
import app1.Student;

public class PersonMain {

	public static void main(String[] args) {

		// BeanFactory
		// ApplicationContext
		ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Person bk = beanFactory.getBean("pers1", Person.class);

		System.out.println(bk);
		beanFactory.close();

	}

}
