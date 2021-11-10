package org.capg.service;

import java.util.List;
import java.util.Optional;

import org.capg.dao.ProductDao;
import org.capg.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;

	public List<Product> getAllProduct() {
		return dao.findAll();
	}

	public Product addProduct(Product p) {
		Optional<Product> findById = dao.findById(p.getId());
		if (findById.isPresent())
			return null;
		else
			return dao.save(p);
	}

	public Product deleteProduct(int id) {
		Optional<Product> findById = dao.findById(id);
		if (findById.isPresent()) {
			Product p1 = findById.get();
			dao.deleteById(id);
			return p1;
		} else
			return null;
	}

	public Product findProduct(int id) {
		Optional<Product> findById = dao.findById(id);
		if (findById.isPresent())
			return findById.get();
		return null;
	}
	
	public Product updateProduct(Product p) {
		Optional<Product> findById = dao.findById(p.getId());
		if (findById.isPresent()) {
			return dao.save(p);
		}
		
		return null;
	}

}
