import org.capg.annotation.model.Order;
import org.capg.annotation.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Product bean = ctx.getBean(Product.class);
		
		System.out.println("product detail");
		
		System.out.println(bean.getProductId());
		System.out.println(bean.getProductName());
		System.out.println(bean.getProductCost());
	     
		System.out.println("\norder detail\n");
		Order order=bean.getOrder();
		System.out.println(order.getOrderId());
		System.out.println(order.getOrderName());
		System.out.println(order.getOrderCost());
		
	}
}
