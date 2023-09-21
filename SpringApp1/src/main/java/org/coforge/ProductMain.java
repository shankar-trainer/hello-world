package org.coforge;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.coforge.bean.Employee;
import org.coforge.bean.Hello;
import org.coforge.bean.HelloImpl;
import org.coforge.bean.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
		Product prd = ctx.getBean(Product.class);
		
		System.out.println(prd);
		
		System.out.println("********product Information*********\n");
		System.out.println("\t\tid : "+prd.getPrdId());
		System.out.println("\t\tname : "+prd.getPrdName());
		System.out.println("\t\tcost  : "+prd.getPrdCost());

		System.out.println("\n********Product List ***********");
		prd.getPrdList().forEach(a->System.out.println(" \t\t " +a));
		
		
		System.out.println("\n********Bike Set  ***********");
		prd.getBikeSet().forEach(a->System.out.println(" \t\t " +a));
		
		System.out.println("\n********Car Map   ***********");
		Map<String, String> carMap = prd.getCarMap();
		
		System.out.println("\nCar Location \t\tCar Model");
		
		for(String s:carMap.keySet()) {
			System.out.println("\t\t"+s+"\t\t :  "+carMap.get(s));
		}
		
		System.out.println("\n********tmap using entry********  ");
		
		Set<Entry<String, String>> entrySet = carMap.entrySet();
		
		for(Entry<String, String> e:entrySet) {
			System.out.println("\t\t"+e.getKey()+"\t\t :  "+e.getValue());
		}
	}
}
