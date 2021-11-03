import java.util.List;

import org.capg.dao.ShoppingKart;
import org.capg.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingKartMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ShoppingKart kart = ctx.getBean(ShoppingKart.class);
		
		Product prd1 = ctx.getBean(Product.class);
		prd1.setPrdId(10001);
		prd1.setPrdName("mobile");
		prd1.setPrdCost(8000);
		
		Product prd2 = ctx.getBean(Product.class);
		prd2.setPrdId(10002);
		prd2.setPrdName("tv");
		prd2.setPrdCost(15000);
		
		Product prd3 = ctx.getBean(Product.class);
		prd3.setPrdId(10003);
		prd3.setPrdName("trouser");
		prd3.setPrdCost(1200);
		
		kart.addProduct(prd1);
		kart.addProduct(prd2);
		kart.addProduct(prd3);
		
		List<Product> allProduct = kart.getAllProduct();
      System.out.println("products purchased are ");
    
      for (Product product : allProduct) 
		System.out.println("\t"+product.getPrdId()+"  "+product.getPrdName()+"  "+product.getPrdCost());
	
      System.out.println("search product1");
       if(kart.searchProduct(prd1) )
    	   System.out.println("product found ");
       else
    	   System.out.println("product not found ");
    	
       System.out.println("\nremove product3");
       if(kart.removeProduct(prd3))
    	   System.out.println("product removed ");
       else
    	   System.out.println("product not present ");
    	   
       System.out.println("\nafter product is removed remaining products are ");
       for (Product product : allProduct) 
 		System.out.println("\t"+product.getPrdId()+"  "+product.getPrdName()+"  "+product.getPrdCost());
 	 	
	}
}
