package com.cts.dao;

import java.util.List;

import com.cts.model.Product;

public interface ProductDao {

	boolean addProduct(Product product);

	boolean removeProduct(Product product);

	boolean searchProduct(Product product);

	List<Product> showAllProduct();
	List<Product> showAllProduct1();

	boolean updateProduct(Product product);

}
