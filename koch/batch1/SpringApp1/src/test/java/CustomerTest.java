import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Customer;

public class CustomerTest {

	BeanFactory beanFactory;
	Customer customer1;
	Customer customer2;
	
	@BeforeEach
	public void init() {
	 beanFactory=new ClassPathXmlApplicationContext("beans.xml");	
	 customer1=beanFactory.getBean("customer1",Customer.class);
	 customer2=beanFactory.getBean("customer1",Customer.class);
	
	}

	@Test
	public void customerTest() {
		assertEquals(76766776, customer1.getCustomerId());
		assertEquals("anand kumar", customer1.getCustomerName());
		assertEquals(80000, customer1.getCustomerSalary());
		assertEquals(customer1, customer2);
		assertSame(customer1, customer2);
	}
	
	
}
