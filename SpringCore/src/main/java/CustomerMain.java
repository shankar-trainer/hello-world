import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.lpu.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
		
		Customer bean = beanFactory.getBean("customer1",Customer.class);
		System.out.println("id is "+bean.getId());
		System.out.println("name is "+bean.getName());
		System.out.println("salary is "+bean.getSalary());
	}
}
