import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.lpu.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
		
		Customer bean = beanFactory.getBean("customer1",Customer.class);
		Customer bean1 = beanFactory.getBean("customer1",Customer.class);
		
		bean1.setId(90002);
		bean1.setName("muthu swamy");
		bean1.setSalary(45000);
		
		System.out.println("bean ");
		System.out.println("id is "+bean.getId());
		System.out.println("name is "+bean.getName());
		System.out.println("salary is "+bean.getSalary());
		System.out.println("cities  are "+bean.getCities());
		System.out.println("mobiles are  "+bean.getMobiles());
		System.out.println("------------");
		
		System.out.println("bean1 ");
		System.out.println("id is "+bean1.getId());
		System.out.println("name is "+bean1.getName());
		System.out.println("salary is "+bean1.getSalary());
		
		
	}
}
