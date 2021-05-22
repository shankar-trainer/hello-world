package com.cts.service;

import java.sql.SQLException;
import java.util.HashMap;

import com.cts.dao.ProductDao;
import com.cts.dao.ProductDaoImpl;
import com.cts.entity.Product;
import com.cts.exception.ProductException;

public class ProductServiceImpl implements ProductService {

	ProductDao dao;
	Product product=null;

	public ProductServiceImpl() throws SQLException {
		dao = new ProductDaoImpl();
	}

	HashMap<Integer, Product> map1;
	public HashMap<Integer, Product> getAllProduct() throws SQLException, ProductException {
        map1=dao.getAllProduct();
		if(map1.isEmpty())
			throw new ProductException("Product list is empty");
		else {
			for(Integer k:map1.keySet()) {
			  product=map1.get(k);
				System.out.println(product.getPrdId()+"  "+product.getPrdName()+"   "+product.getPrdCost());
			}
		}
        return null;
	}

	public Product searchProduct(Product p) throws SQLException, ProductException {
	   product=null;
	   product=dao.searchProduct(p);
	   if(product==null)
		    throw new ProductException("Product not found");
	   else {
		   System.out.println("Product found");
			System.out.println(product.getPrdId()+"  "+product.getPrdName()+"   "+product.getPrdCost());
	   }
		    return null;
	}
	
	public boolean addProduct(Product p) throws SQLException, ProductException {
		 if(dao.addProduct(p))
			 System.out.println("product added");
		 
		return false;
	}

	public boolean removeProduct(Product p) {
		return false;
	}

	public boolean updateProduct(Product p) {
		return false;
	}

	


}
