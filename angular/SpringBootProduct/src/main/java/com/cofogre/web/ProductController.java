package com.cofogre.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cofogre.entity.Product;
import com.cofogre.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin("http://localhost:4200")
public class ProductController {

	@Autowired
	ProductService service;

	@PostMapping("/add")
	public Product addProduct(@RequestBody Product p) {
		return service.addProduct(p);
	}

	@GetMapping("/all")
	public List<Product> getAllProduct() {
		return service.getAllProduct();
	}
}
