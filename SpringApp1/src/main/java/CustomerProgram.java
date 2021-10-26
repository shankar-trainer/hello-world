import org.capg.model.Customer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerProgram {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		Customer bean1 = ctx.getBean("customer1",Customer.class);
	//	System.out.println(bean1);
		
		Customer bean2 = ctx.getBean("customer1",Customer.class);
		bean2.setCustomerId(1);
		bean2.setCustomerName("akila p");
		bean2.setCustomerSalary(89000.00f);
		
		System.out.println(bean1);
		System.out.println(bean2);
		
		
				
	}
}
