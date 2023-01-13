import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.Book;

public class BookMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
	Book b=	ctx.getBean(Book.class);
		System.out.println("Book data ");
		System.out.println(b);
	}
}
