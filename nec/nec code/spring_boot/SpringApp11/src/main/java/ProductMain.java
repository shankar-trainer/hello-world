import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.Product;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
	Product product=	ctx.getBean(Product.class);
		
	System.out.println("Product Details  \n");
		System.out.println("\tid "+product.getProductId());
		System.out.println("\tname "+product.getProductName());
		System.out.println("\tlocation "+product.getProductLocation());
		
		System.out.println("\n\tBikes Details ");
		
		for(String s:product.getPrdList()) {
			System.out.println("\t\t"+s);
		}
		
		System.out.println("\n\tCycle  Details ");
		
		for(String s:product.getPrdSet()) {
			System.out.println("\t\t"+s);
		}
		
		
		System.out.println("\n\tCar Details ");
		
		Map<Float, String> prdMap = product.getPrdMap();
		Set<Entry<Float, String>> entrySet = prdMap.entrySet();
		
		for(Entry<Float, String> entry:entrySet) {
			System.out.println("\t\t"+entry.getKey()+"  "+entry.getValue());
		}
		
		System.out.println("=============================");
		for(Entry<Float, String> entry:product.getPrdMap().entrySet()) {
			System.out.println("\t\t"+entry.getKey()+"  "+entry.getValue());
		}
		
		
	}
}
