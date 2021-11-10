package org.capg.web;

import java.util.List;

import org.capg.model.Product;
import org.capg.service.ProductService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController1 {

	@Autowired
	ProductService1 service;

	@GetMapping("/getAll")
	public ResponseEntity<List<Product>> showAll() {
		return service.getAllProduct();
	}

	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product p) {
		return service.addProduct(p);
	}

	@GetMapping(value = "/search/{id}")
	public ResponseEntity<Product> searchProduct(@PathVariable("id") int id) {
		return service.findProduct(id);
	}

	@DeleteMapping(value = "/remove/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("id") int id) {
		return service.deleteProduct(id);
	}

	@PutMapping(value = "/update")
	public ResponseEntity<Product> updateProduct(@RequestBody Product p) {
		return service.updateProduct(p);
	}

}
