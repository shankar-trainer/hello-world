import java.util.Locale;

import org.capg.model.Customer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerProgram2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		Customer bean1 = ctx.getBean("customer2",Customer.class);
		
		System.out.println(bean1);
		
		MessageSource msgbean=ctx.getBean("messageSource",MessageSource.class);
	
		System.out.println(msgbean.getMessage("user.name", null,Locale.getDefault()));
		System.out.println(msgbean.getMessage("user.location", null,Locale.getDefault()));

		System.out.println("in french ");
		
		System.out.println(msgbean.getMessage("user.name", null,Locale.FRENCH));
		System.out.println(msgbean.getMessage("user.location", null,Locale.FRENCH));
		
	}
}
