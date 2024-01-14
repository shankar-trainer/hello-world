package com.coforge.dao;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.coforge.model.Product;
import lombok.Data;

//@Resource
@Repository
@Data
public class ProductDao {

	Map<Long, Product> productMap;

	public ProductDao() {
		productMap = new HashMap<>();
	}

	public Product addProduct(Product p) {
		return productMap.put(p.getId(), p);
	}

	public Product searchProduct(long id) {
		if (productMap.containsKey(id)) {
			return productMap.get(id);
		}
		return null;
	}
	
	public Product removeProduct(long id) {
		if (productMap.containsKey(id)) {
			return productMap.remove(id);
		}
		return null;
	}

	public Map<Long, Product> getAllProduct() {
		return productMap;
	}
}
