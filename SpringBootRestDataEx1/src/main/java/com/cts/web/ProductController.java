package com.cts.web;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.cts.dao.ProductRepository;
import com.cts.error.ProductNotFoundException;
import com.cts.model.Product;
import com.cts.service.ProductService;

//@Controller
@RestController
@RequestMapping("/product")
@CrossOrigin("http://localhost:4200")
public class ProductController {

	@Autowired
	ProductService service;

	@RequestMapping("/all")
	// @ResponseBody
	public ResponseEntity<List<Product>> allProduct() {
		try {
			return new ResponseEntity<>(service.getAllProduct(), HttpStatus.OK);

		} catch (ProductNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("search/{id}")

	public ResponseEntity<Product> searchProduct(@PathVariable("id") int id) {
		try {
			return new ResponseEntity<Product>(service.findProduct(id), HttpStatus.OK);
		} catch (ProductNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<Product> saveProduct(@RequestBody Product prd) {
		try {
			return new ResponseEntity<Product>(service.addProduct(prd), HttpStatus.OK);
		} catch (ProductNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	// @DeleteMapping("delete/{id}")
	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Product> deleteProduct(@PathVariable("id") int id) {
		try {
			return new ResponseEntity<Product>(service.deleteProduct(id), HttpStatus.OK);
		} catch (ProductNotFoundException e) {

			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

}
