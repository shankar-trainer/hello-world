package ogg.capg.main;

import org.capg.model.Book;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("application.xml");
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

		Book bean = ctx.getBean("book1", Book.class);
		System.out.println(bean.getIsbn());
		System.out.println(bean.getBname());
		System.out.println(bean.getCost());
		ctx.close();
		
		System.out.println("===========");
	
		System.out.println(bean.getIsbn());
		System.out.println(bean.getBname());
		System.out.println(bean.getCost());
	
	}
}
