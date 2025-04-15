package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.exception.ProductException;
import com.cts.model.Product;

@Repository

public class ProductDaoImpl implements ProductDao {
	private List<Product> plist;

	public ProductDaoImpl() {
		plist = new ArrayList<Product>();
	}

	@Override
	public boolean addProduct(Product p) {
//		if (plist.contains(p))
//			throw new ProductException("product already present");
//		else 
		{
			plist.add(p);
			return true;
		}
	}
	
	@Override
	public List<Product> getAllProduct() {
		return plist;
	}

}
