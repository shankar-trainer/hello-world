package org.com.capgemini.service;

import org.com.capgemini.dao.ProductDao;
import org.com.capgemini.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;
	
	public void addProduct(Product product)
	{
		if(dao.storeProduct(product))
		{
			System.out.println("Product Addedd");
		}
		else
		{
			System.out.println("Product not added");
		}
	}
	
	public void findProduct(Product product)
	{
		Product p = dao.searchProduct(product);
		
		if(p!=null)
		{
			System.out.println("Product found\n"+p);
		}
		else
		{
			System.out.println("Product not found");
		}
	}
	
	public void showAllProduct() {
		dao.getAllProduct().forEach(System.out::println);
		
	}
	
	public void deleteProduct(Product product)
	
	{
		if(dao.removeProduct(product))
		{
			System.out.println("Product deleted");
		}
		else
		{
			System.out.println("Product not deleted");
		}
		
	}
	
}
