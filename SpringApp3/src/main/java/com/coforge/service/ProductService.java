package com.coforge.service;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coforge.dao.ProductDao;
import com.coforge.exception.ProductException;
import com.coforge.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;

	Map<Long, Product> productMap;

	public ProductService() {
		productMap = new HashMap<>();
	}

	public Product addProduct(Product p) {
		if (productMap.containsKey(p.getId()))
			throw new ProductException("product already present");
		else
			return productMap.put(p.getId(), p);
	}

	public Product searchProduct(long id) {
		if (productMap.containsKey(id)) {
			return productMap.get(id);
		} else
			throw new ProductException("product not found ");
	}

	public Product removeProduct(long id) {
		if (productMap.containsKey(id)) {
			return productMap.remove(id);
		} else
			throw new ProductException("product not  present");
	}

	public Map<Long, Product> getAllProduct() {
		if (productMap.size() == 0)
			throw new ProductException("product list is empty");
		return productMap;
	}
}
