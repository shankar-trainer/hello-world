package com.cognizant.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Product;

@Repository
public class ShoppingKartDaoImpl implements ShoppingKartDao {

	Map<Integer, Product> prodMap;

	public ShoppingKartDaoImpl() {
		prodMap = new HashMap<>();
	}

	@Override
	public Product addProduct(Product p) {
		if(searchProduct(p.getId())==null) {
			prodMap.put(p.getId(), p);
		}
		
		return null;
	}

	@Override
	public Product searchProduct(int id) {
		 if(prodMap.containsKey(id))
			return  prodMap.get(id);
		return null;
	}

	@Override
	public Map<Integer, Product> showAllProduct() {
		return prodMap;
	}

	@Override
	public Product updateProduct(Product p) {
		return null;
	}

	@Override
	public Product removeProduct(Product p) {
		if(searchProduct(p.getId())!=null) {
			Product p2=searchProduct(p.getId());
			prodMap.remove(p);
			return p2;
		}
		return null;
	}

}
