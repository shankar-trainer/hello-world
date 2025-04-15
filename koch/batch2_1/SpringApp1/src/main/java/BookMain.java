import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.model.Book;

public class BookMain {

	public static void main(String[] args) {
		// BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Book b1 = ctx.getBean("book1", Book.class);
		System.out.println("book data");
//		System.out.println(b1.getIsbn());
//		System.out.println(b1.getBname());
//		System.out.println(b1.getCost());
		
		System.out.println(b1);
		
		ctx.close();
	}
}
