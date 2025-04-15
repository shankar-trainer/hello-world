import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {

		BeanFactory beanFactory;
		beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		Customer customer = beanFactory.getBean("customer1", Customer.class);

		Customer customer1 = beanFactory.getBean("customer1", Customer.class);
		
		customer1.setCustomerId(90001);
		customer1.setCustomerName("sunil kumar");
		customer1.setCustomerSalary(12000);
		

		System.out.println("customer1 Information "+customer);
		System.out.println("\ncustomer2 Information "+customer1);

		
		
		
		
		
		
		
		
		
		
		
		
		
		//		System.out.println("\tid "+customer.getCustomerId());
//		System.out.println("\tname "+customer.getCustomerName());
//		System.out.println("\tsalary "+customer.getCustomerSalary());
		
//		System.out.println("\tid "+customer1.getCustomerId());
//		System.out.println("\tname "+customer1.getCustomerName());
//		System.out.println("\tsalary "+customer1.getCustomerSalary());
	}
}
