import org.com.model.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

		Product product1 = factory.getBean("prd", Product.class);
		 System.out.println("Product Information");
		 System.out.println("\tId is "+product1.getPrd_id());
		 System.out.println("\tName is "+product1.getPrd_name());
		 System.out.println("\tCost is "+product1.getPrd_cost());
		 
	}
}
