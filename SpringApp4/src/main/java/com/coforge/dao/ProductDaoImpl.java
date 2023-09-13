package com.coforge.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.coforge.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	List<Product> prdList;

	public ProductDaoImpl() {
		prdList = new ArrayList<Product>();
	}

	@Override
	public Product searchProduct(Product p) {

		for (Product p1 : prdList) {
			if (p1 == p)
				return p;
		}
		return null;
	}

	@Override
	public Product addProduct(Product p) {
		if (searchProduct(p) == null) {
			prdList.add(p);
			return p;
		}
		return null;
	}

	@Override
	public Product removeProduct(Product p) {
		if (searchProduct(p) != null) {
			prdList.remove(p);
			return p;
		}
		return null;
	}

	@Override
	public Product updateProduct(Product p1,Product p2) {
		
		if (searchProduct(p1) != null) {
			prdList.remove(p1);
			prdList.add(p2);
			return p2;
		}
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		return prdList;
	}

}
