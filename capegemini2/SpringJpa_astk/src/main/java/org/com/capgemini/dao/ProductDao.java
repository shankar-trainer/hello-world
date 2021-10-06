package org.com.capgemini.dao;

import java.util.List;

import org.com.capgemini.model.Product;

public interface ProductDao {

	public boolean storeProduct(Product prd);
	public Product searchProduct(Product prd);
	public boolean removeProduct(Product prd);
	public List<Product> getAllProduct();

}
