package com.audintel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audintel.dao.ManufacturingCompanyRepository;
import com.audintel.dao.ProductOrderRepository;
import com.audintel.dao.ProductRepository;
import com.audintel.model.Product;
import com.audintel.model.ProductOrder;

@RestController
@RequestMapping("/prd")
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductOrderRepository productOrderRepository;

	@Autowired
	ManufacturingCompanyRepository manufacturingCompanyRepository;

	@RequestMapping("/all")
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@RequestMapping("/add")
	public Product addProduct(@RequestBody Product p) {
		manufacturingCompanyRepository.save(p.getCompany());

		for (ProductOrder order : p.getPrdOrderSet())
			productOrderRepository.save(order);
		return productRepository.save(p);
	}

	Optional<Product> findById;

	@RequestMapping("/search/{id}")
	public Product searchProduct(@PathVariable("id") long id1) {
		findById = null;
		findById = productRepository.findById(id1);
		if (findById.isPresent())
			return findById.get();
		return null;

	}

	Product prd = null;

	@DeleteMapping("/delete/{id}")
	public Product deleteProduct(@PathVariable("id") long id1) {

		findById = null;
		findById = productRepository.findById(id1);
		if (findById.isPresent()) {
			prd = findById.get();
			productRepository.deleteById(id1);
			return prd;
		}
		return null;
	}

}
