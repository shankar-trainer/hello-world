package org.capg.dao;

import java.util.ArrayList;
import java.util.List;

import org.capg.model.Product;

public class ProductDao {

	private List<Product> prdList;

	public ProductDao() {
		prdList = new ArrayList<>();
	}

	public boolean addProduct(Product p) {
		if (searchProduct(p))
			return false;
		else {
			prdList.add(p);
		}
		return true;
	}
	public boolean deleteProduct(Product p) {
		if (searchProduct(p)) {
		     prdList.remove(p);
			return true;
		}
		return false;
	}

	public boolean searchProduct(Product p) {
		return prdList.contains(p);
	}
	public List<Product> getAllProduct(){
		return prdList;
	} 

}
