import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app1.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext
		// BeanFactory
		beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Customer customer1 = (Customer) beanFactory.getBean("cust1");
		Customer customer2 = (Customer) beanFactory.getBean("cust1");
		
		/*
		 * customer1.setId(9001); customer1.setName("surendra");
		 * customer1.setLocation("madurai");
		 * 
		 * customer2.setId(9002); customer2.setName("rajendra");
		 * customer2.setLocation("coimbtore");
		 */
		
		
		System.out.println(customer1);
		System.out.println(customer2);
		/*
		 * System.out.println(customer.getId()); System.out.println(customer.getName());
		 * System.out.println(customer.getLocation());
		 */

		beanFactory.close();
	}

}
