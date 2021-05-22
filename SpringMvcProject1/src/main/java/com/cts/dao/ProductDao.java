package com.cts.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.cts.model.Product;

@Repository
public class ProductDao {

	HashMap<Integer, Product> map1;

	public ProductDao() {
		map1 = new HashMap<Integer, Product>();
	}

	public Product addProduct(Product product) {

		if (map1.containsKey(product.getPrdId())) {
			return null;
		} else {
			map1.put(product.getPrdId(), product);
			return product;
		}
	}

	public HashMap<Integer, Product> getProductList() {
		return map1;
	}

}
