package org.capg.service;

import java.util.List;
import java.util.Optional;

import org.capg.dao.ProductDao;
import org.capg.exception.ProductNotFoundException;
import org.capg.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService1 {

	@Autowired
	ProductDao dao;

	public ResponseEntity  getAllProduct() {
       try {
    	   if(dao.findAll().size()>=1)
		return new ResponseEntity<List<Product>>( dao.findAll(),HttpStatus.FOUND);
    	   else 
    		   throw new ProductNotFoundException("Product List is empty");
       }
       catch (ProductNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity addProduct(Product p) {
		try {
			Optional<Product> findById = dao.findById(p.getId());
			if (!findById.isPresent()) {
				return new ResponseEntity<Product>(dao.save(p), HttpStatus.FOUND);
			} else
				throw new ProductNotFoundException("Product already present");
		} catch (ProductNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity deleteProduct(int id) {
		try {
			Optional<Product> findById = dao.findById(id);
			if (findById.isPresent()) {
				Product p1 = findById.get();
				dao.deleteById(id);
				return new ResponseEntity<Product>(p1, HttpStatus.FOUND);

			} else
				throw new ProductNotFoundException("Product not found");
		} catch (ProductNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity findProduct(int id) {
		try {
			Optional<Product> findById = dao.findById(id);
			if (findById.isPresent())
				return new ResponseEntity<Product>(findById.get(), HttpStatus.FOUND);

			else
				throw new ProductNotFoundException("Product not found");
		} catch (ProductNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity updateProduct(Product p) {
		try {
			Optional<Product> findById = dao.findById(p.getId());
			if (findById.isPresent()) {
				return new ResponseEntity<Product> (dao.save(p),HttpStatus.FOUND);
			}
			else
				throw new ProductNotFoundException("Product not present");
	

		} catch (ProductNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

}
