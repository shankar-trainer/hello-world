package com.cts.collection;

import java.util.HashMap;
import java.util.Set;

public class MapDemo5 {

	public static void main(String[] args) {

		Customer customer1 = new Customer();

		customer1.setId(10001);
		customer1.setName("ram kumar");
		customer1.setProduct("java book");
		customer1.setCost(546);

		Customer customer2 = new Customer();

		customer2.setId(10008);
		customer2.setName("amrendra kumar");
		customer2.setProduct("samsung galaxy mobile");
		customer2.setCost(10000);

		Customer customer3 = new Customer();

		customer3.setId(10003);
		customer3.setName("surendra kumar");
		customer3.setProduct("bicycle");
		customer3.setCost(10000);

		Customer customer4 = new Customer();

		customer4.setId(10002);
		customer4.setName("dhirendra kumar");
		customer4.setProduct("laptop");
		customer4.setCost(54600);

		CustomerOperation customerOperation = new CustomerOperation();

		customerOperation.addCustomer(customer1);
		customerOperation.addCustomer(customer2);
		customerOperation.addCustomer(customer3);
		customerOperation.addCustomer(customer4);

		HashMap<Integer, Customer> custMap = customerOperation.getAllCustomer();

		Set<Integer> keySet = custMap.keySet();
		Customer customer5 = new Customer();

		
    System.out.println( "search "+customerOperation.searchCustomer(customer5));
		
		
		for (Integer integer : keySet) {
			System.out.println(custMap.get(integer));
		}

	}

}
