package com.pathinfotech.shopping.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.pathinfotech.shopping.model.Product;

@Repository
public class ProductDao {

	private List<Product> prdList;

	public ProductDao() {
		prdList = new ArrayList<Product>();
	}

	public Product addProduct(Product p) {
		prdList.add(p);
		return p;
	}

	public Product searchProduct(Product p) {
		for (Product p1 : prdList) {
			if (p1.equals(p) ) {
				return p1;
			}
		}
		return null;
	}

	public List<Product> getAllProduct() {
		return prdList;
	}

}
