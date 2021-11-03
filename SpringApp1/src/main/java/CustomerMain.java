import org.capg.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Customer bean = ctx.getBean("customer1",Customer.class);
		
		System.out.println(bean);
	}
}
