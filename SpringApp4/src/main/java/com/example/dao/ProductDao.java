package com.example.dao;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Repository;
import com.example.model.Product;

@Repository
public class ProductDao {

	private Set<Product> prdset;

	public ProductDao() {
		prdset = new HashSet<>();
	}

	public Product addProduct(Product prd) {
		if (searchProduct(prd) == null) {
			prdset.add(prd);
			return prd;
		}
		return null;
	}

	public Product searchProduct(Product prd) {
		for (Product p : prdset) {
			if (prd.equals(p))
				return p;
		}
		return null;
	}

	public Set<Product> getAllProduct() {
		return prdset;
	}

}
