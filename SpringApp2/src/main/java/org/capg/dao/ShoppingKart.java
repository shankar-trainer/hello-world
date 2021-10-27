package org.capg.dao;

import java.util.ArrayList;
import java.util.List;

import org.capg.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class ShoppingKart {

	List<Product> prdList;

	public ShoppingKart() {
		prdList = new ArrayList<Product>();
	}

	public void addProduct(Product p) {
		prdList.add(p);
	}

	public List<Product> getAllProduct() {
		return prdList;
	}

	public boolean searchProduct(Product product) {
		return prdList.contains(product);
	}

	public boolean removeProduct(Product product) {
		if (searchProduct(product)) {
			prdList.remove(product);
			return true;
		}
		return false;

	}
}
