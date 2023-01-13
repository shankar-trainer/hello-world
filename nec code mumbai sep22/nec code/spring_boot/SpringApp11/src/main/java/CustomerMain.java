import org.nec.Customer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		//Employee emp = (Employee) beanFactory.getBean("emp1");
		Customer c =  beanFactory.getBean("customer",Customer.class);
		
		System.out.println("Customer values ");
		System.out.println(c);
		
	}
}
