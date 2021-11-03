import org.capg.Book;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		
		BeanFactory  beanFactory=new ClassPathXmlApplicationContext("beans.xml");
		Book bean = beanFactory.getBean("book",Book.class);
		
		System.out.println(bean);
		
	}
}
	