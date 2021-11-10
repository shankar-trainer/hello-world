package org.capg.controller;

import org.capg.model.Product;
import org.springframework.web.client.RestTemplate;

public class RestTemplateTest {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		Product forObject = restTemplate.getForObject("http://localhost:9090/product/search/100", Product.class);
		if (forObject != null) {
			System.out.println("found ");
			System.out.println(forObject.getId() + "   " + forObject.getPrdName() + "   " + forObject.getPrdCost());
		} else
			System.out.println("not found");

		// String s= restTemplate.get("http://localhost:9090/product/getAll",
		// Product.class);
		Product prd1 = new Product();
		prd1.setPrdCost(11111);
		prd1.setPrdName("mobile");

		Product p2 = restTemplate.postForObject("http://localhost:9090/product/add", prd1, Product.class);

		if (p2 != null) {
			System.out.println("added");
			System.out.println(p2.getId() + "  " + p2.getPrdName() + "  " + p2.getPrdCost());
		}
		
		restTemplate.delete("http://localhost:9090/product/remove/1002");
	}
}
