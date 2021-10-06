package org.com.capgemini.service;

import java.util.List;

import org.com.capgemini.dao.ProductDao;
import org.com.capgemini.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "ps")
public class ProductService {

	@Autowired
	ProductDao dao;

	public void addProduct(Product product) {
		if (dao.storeProduct(product))
			System.out.println("Product added");
		else
			System.out.println("Product already present");
	}

	public void findProduct(Product product) {
		Product p = dao.searchProduct(product);
		if (p != null)
			System.out.println("Product found \n" + p);
		else
			System.out.println("Product not found");
	}

	public List<Product> showAllProduct() {
	    return dao.getAllProduct();
	}
	
	public void deleteProduct(Product product) {
	
		if(dao.removeProduct(product))
			System.out.println("product deleted");
		else
			System.out.println("product not present");
	}
}
