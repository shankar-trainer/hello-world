package com.cts.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cts.exception.ProductAlreadyPresentException;
import com.cts.exception.ProductEmptyException;
import com.cts.model.Product;

@Repository
public class ShoppingKart {

	private HashMap<Integer, Product> productMap;

	public ShoppingKart() {
		productMap = new HashMap<Integer, Product>();
		Product prd[] = new Product[4];
		Integer id[] = { 1001, 1002, 1003, 1004 };
		String nm[] = { "shirt", "pant", "mobile", "laptop" };
		Float cost[] = { 600.0f, 1500.0f, 14000.0f, 45000.0f };
		String loc[] = { "delhi", "noida", "chennai", "ooty" };

		for (int i = 0; i < prd.length; i++) {
			prd[i] = new Product();
			prd[i].setPrdId(id[i]);
			prd[i].setPrdLocation(loc[i]);
			prd[i].setPrdCost(cost[i]);
			prd[i].setPrdName(nm[i]);
			productMap.put(prd[i].getPrdId(), prd[i]);
		}
	}

	public Product addProduct(Product product) throws ProductAlreadyPresentException {
		if (productMap.containsKey(product.getPrdId()))
			throw new ProductAlreadyPresentException("product already present");

		else {
			productMap.put(product.getPrdId(), product);
			return product;
		}
	}

	public Product removeProduct(Product product) throws Exception {
		if (productMap.containsKey(product.getPrdId())) {
			return productMap.remove(product.getPrdId());
		}

		else {
			throw new Exception("remove product not found");
		}
	}

	public Product searchProduct(Product product) throws Exception {
		if (productMap.containsKey(product.getPrdId()))
			return productMap.get(product.getPrdId());

		else {
			throw new Exception("product not found");
		}
	}

	public Product updateProduct(Product product) throws Exception {
		if (productMap.containsKey(product.getPrdId())) {
			Product prd = productMap.get(product.getPrdId());
			prd.setPrdName(product.getPrdName());
			prd.setPrdLocation(product.getPrdLocation());
			prd.setPrdCost(product.getPrdCost());
			return prd;
		} else {
			throw new Exception("update product not found");

		}
	}

	public HashMap<Integer, Product> getAllProduct() throws ProductEmptyException {
		if (productMap.size() == 0)
			throw new ProductEmptyException("Product List is empty");
		else
			return productMap;
	}

	@ExceptionHandler(value = ProductAlreadyPresentException.class)
	public String ProductExceptionhandler(ProductAlreadyPresentException ex) {
		return "error";
	}
}
