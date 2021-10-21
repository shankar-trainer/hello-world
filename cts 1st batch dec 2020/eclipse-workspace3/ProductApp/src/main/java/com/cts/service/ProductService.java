package com.cts.service;

import java.sql.SQLException;
import java.util.HashMap;

import com.cts.entity.Product;
import com.cts.exception.ProductException;

public interface ProductService {
	public boolean addProduct(Product p) throws SQLException, ProductException;

	public boolean removeProduct(Product p);

	public boolean updateProduct(Product p);

	public Product searchProduct(Product p) throws SQLException, ProductException;

	public HashMap<Integer, Product> getAllProduct() throws SQLException, ProductException;

}
