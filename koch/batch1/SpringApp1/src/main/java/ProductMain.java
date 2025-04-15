import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Customer;
import com.cts.model.Person;
import com.cts.model.Product;

public class ProductMain {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Product bean = beanFactory.getBean("prd1",Product.class);
		
		System.out.println(bean);

	}
}
