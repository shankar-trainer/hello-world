
import org.lpu.model.Book;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		BeanFactory  beanFactory=new ClassPathXmlApplicationContext("beans.xml");
		Book bean = beanFactory.getBean("book1",Book.class);
		
		Book bean1 = beanFactory.getBean("book1",Book.class);
		bean1.setIsbn(88787789);
		bean1.setBname("spring for beginner");
		bean1.setCost(12000);
	  	
	 System.out.println(bean.getIsbn()+"\t"+bean.getBname()+"\t"+bean.getCost());
	 System.out.println(bean1.getIsbn()+"\t"+bean1.getBname()+"\t"+bean1.getCost());
	
	}
}
