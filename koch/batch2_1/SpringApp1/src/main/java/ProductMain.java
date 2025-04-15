import java.util.Map.Entry;
import java.util.function.BiConsumer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.model.Order;
import com.abc.model.Product;

public class ProductMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		Product bean = beanFactory.getBean("prd1", Product.class);
		System.out.println(bean);
		
		System.out.println("product1 information");
		System.out.println("\tid " + bean.getProductId());
		System.out.println("\tname " + bean.getProductName());
		System.out.println("\tcost " + bean.getProductCost());

		Order order = bean.getOrder();
		System.out.println("\nProduct  Order values");
		System.out.println("\tid : "+order.getOrderId());
		System.out.println("\tname : "+order.getOrderName());
		System.out.println("\tquantity : "+order.getQuantity());
		
		System.out.println("total cost of the product ");
		
		System.out.println("\t"+(order.getQuantity()*bean.getProductCost()));
		
		System.out.println("\nbook list");
		for(String s:bean.getBookList())
			System.out.println("\t"+s);
		
		System.out.println("\nbook list using for each method");
		
		bean.getBookList().forEach(a->System.out.println("\t"+a));
		
		System.out.println("\nmobile set using for each method");
		bean.getMobileSet().forEach(a->System.out.println("\t"+a));
		
		System.out.println("\nshoe set using for entry set");

		for(Entry<Integer,String> entry :bean.getShoeMap().entrySet()) 
			System.out.println("\tNo "+entry.getKey()+" Model "+entry.getValue());

		System.out.println("\nshoe set using for each method");
		  
		bean.getShoeMap().forEach((k,v)->System.out.println(k+",  "+v));

		
		bean.getShoeMap();
		
		
		
//
//		Product bean1 = beanFactory.getBean("prd1", Product.class);
//
//		bean1.setProductId(90001);
//		bean1.setProductCost(100);
//		bean1.setProductName("orange");
//
//		System.out.println("product1 information");
//		System.out.println("\tid " + bean.getProductId());
//		System.out.println("\tname " + bean.getProductName());
//		System.out.println("\tcost " + bean.getProductCost());
//
//		System.out.println("product2 information");
//		System.out.println("\tid " + bean1.getProductId());
//		System.out.println("\tname " + bean1.getProductName());
//		System.out.println("\tcost " + bean1.getProductCost());

	}
}
