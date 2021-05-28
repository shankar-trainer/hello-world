package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cts.dao.ProductRepository;
import com.cts.error.ProductNotFoundException;
import com.cts.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product addProduct(Product prd) throws ProductNotFoundException {
		Optional<Product> findById = productRepository.findById(prd.getId());
		if (!findById.isPresent())
			return productRepository.save(prd);
		else
			throw new ProductNotFoundException("product already exist");
	}

	public Product findProduct(int id) throws ProductNotFoundException {
		Optional<Product> findById = productRepository.findById(id);
		if (findById.isPresent())
			return findById.get();
		else
			throw new ProductNotFoundException("product not found ");
	}

	public Product deleteProduct(int id) throws ProductNotFoundException {
		Optional<Product> findById = productRepository.findById(id);
		if (findById.isPresent()) {
			Product p1 = findById.get();

			productRepository.deleteById(id);
			return p1;
		} else
			throw new ProductNotFoundException("product not present ");
	}

	public List<Product> getAllProduct() throws ProductNotFoundException {

		if (productRepository.findAll().size() > 0)
			return productRepository.findAll();
		else
			throw new ProductNotFoundException("product list is blank ");
	}

	@ExceptionHandler(value = ProductNotFoundException.class)
	public void errro() {

	}
}
