package com.pathinfotech.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathinfotech.shopping.dao.ProductDao;
import com.pathinfotech.shopping.exception.ProductException;
import com.pathinfotech.shopping.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;

	public Product saveProduct(Product p) throws ProductException {
		Product searchProduct = dao.searchProduct(p);
		if (searchProduct == p)
			throw new ProductException("product already present");
		else
			return dao.addProduct(p);
	}

	public List<Product> showAllProduct() throws ProductException {
		if (dao.getAllProduct().size() == 0)
			throw new ProductException("product list is empty");
		else
			return dao.getAllProduct();
	}

	public Product findProduct(Product p) throws ProductException {
		if (dao.searchProduct(p) == null)
			throw new ProductException("product  is not present");
		else
			return dao.searchProduct(p);

	}
}
