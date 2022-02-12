import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.lpu.model.Person;

public class PersonMain {

	public static void main(String[] args) {

//BeanFactory beanFactory
		//ApplicationContext
ConfigurableApplicationContext		ctx = new ClassPathXmlApplicationContext("beans.xml");

		Person person = ctx.getBean("person1", Person.class);
		
		System.out.println(person);
		
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getSalary());
		
		ctx.close();

	}
}
