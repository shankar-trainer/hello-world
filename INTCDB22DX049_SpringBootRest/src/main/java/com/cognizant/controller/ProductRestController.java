package com.cognizant.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Product;

@RestController

@RequestMapping("/product")
public class ProductRestController {

	@RequestMapping(value = "/hello1")

	public String welcome() {
		return "<h1>weclome to rest</h1>";
	}

	@RequestMapping("/hello")
	public String greeting() {
		return "greeting  to rest";
	}

	static List<Product> prdList;
	static {
		prdList = Arrays.asList(new Product(10001, "my java book", 1200), new Product(10002, "trouser", 1500),
				new Product(10003, "shirt", 1100), new Product(10004, "pant", 1800),
				new Product(10005, "mobile", 18900), new Product(10006, "laptop", 35000),
				new Product(10007, "pizza", 400), new Product(10001, "television", 90000),
				new Product(10008, "air conditioner", 45000), new Product(10009, "shoe", 1870),
				new Product(100010, "sofa", 25000), new Product(100011, "torch", 250)

		);
	}

	@RequestMapping("/all")
	public List<Product> getAllProductList() {
		return prdList;
	}

	@RequestMapping("/search/{id}")
	public @ResponseBody Product searchProduct(@PathVariable("id") int id) {
		for (Product p : prdList) {
			if (p.getId() == id)
				return p;
		}
		return null;
	}
}