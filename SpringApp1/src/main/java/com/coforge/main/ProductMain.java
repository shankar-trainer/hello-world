package com.coforge.main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.coforge.model.Order;
import com.coforge.model.Product;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/application.xml");

		Product product = context.getBean("prd1", Product.class);

		System.out.println(product);

		System.out.println("product Details ");
		System.out.println("\t id  :  " + product.getProductId());
		System.out.println("\t name :  " + product.getProductName());
		System.out.println("\t location  :  " + Arrays.toString(product.getProductLocation()));
		
		System.out.println("Locations ----");
		Stream.of(product.getProductLocation()).forEach(System.out::println);
		

		System.out.println("\nProduct List  Item");
		List<String> listItem = product.getListItem();

		listItem.forEach(a -> System.out.println("\t"+a));

		System.out.println("\nProduct Set   Item");
		product.getSetProductName().forEach(a -> System.out.println("\t"+a));
		
		System.out.println("\nProduct map values");
		Map<Integer, String> productMap = product.getProductMap();

		for (Entry<Integer, String> entrySet : productMap.entrySet()) {
			System.out.println("\t"+entrySet.getKey()+"\t"+entrySet.getValue());
		}
		
		System.out.println("\nproduct Order  Details ");

		Order order = product.getProductOrder();

		System.out.println("\t id  :  " + order.getOrderId());
		System.out.println("\t state  :  " + order.getOrderState());
		System.out.println("\t pin code   :  " + order.getOrderPinCode());

	}
}
