import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Customer;
import com.cts.model.Person;

public class PersonMain {

	public static void main(String[] args) {

//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
//		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Person person = beanFactory.getBean("person1", Person.class);

		System.out.println(person);
		
		beanFactory.close();
		

	}
}
