package ogg.capg.main;

import org.capg.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
		Person bean = ctx.getBean("person2",Person.class);
		
		System.out.println(bean);
	}
}
