package org.com.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;

import org.com.dao.ProductRepository;
import org.com.error.RecordNotFoundException;
import org.com.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prd")
@CrossOrigin(value = "http://localhost:4200")
public class ProductController {

	@Autowired
	ProductRepository dao;

	@GetMapping("/getProduct")
	public List<Product> getAllProduct() {
		return dao.findAll();
	}

	@RequestMapping("/getProduct/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> findProduct1(@PathVariable("id") int pid) {

		Optional<Product> findById = dao.findById(pid);
		try {
			if (findById.isPresent()) {
				Product product = findById.get();
				return new ResponseEntity<Product>(product, HttpStatus.OK);
			} else {
				throw new RecordNotFoundException("Record not found");
			}
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	/*
	 * @PostMapping("/getProduct") public ResponseEntity<Product>
	 * saveProduct(@Valid @RequestBody Product prd) {
	 * 
	 * Optional<Product> findById = dao.findById(prd.getPrdId()); try { if
	 * (!findById.isPresent()) { dao.save(prd); return new
	 * ResponseEntity<Product>(prd, HttpStatus.OK); } else { throw new
	 * RecordNotFoundException("Record already present"); } } catch
	 * (RecordNotFoundException e) { return new ResponseEntity(e.getMessage(),
	 * HttpStatus.NOT_FOUND); } }
	 */

	@PostMapping("/getProduct")
	public Product saveProduct(@Valid @RequestBody Product prd) {
		return dao.save(prd);
	}

	@PutMapping("/getProduct")
	public ResponseEntity<Product> updateProduct(@Valid @RequestBody Product prd) {

		Optional<Product> findById = dao.findById(prd.getPrdId());
		try {
			if (findById.isPresent()) {
				dao.save(prd);
				return new ResponseEntity<Product>(prd, HttpStatus.OK);
			} else {
				throw new RecordNotFoundException("Record not present");
			}
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/getProduct/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("id") int id) {

		Optional<Product> findById = dao.findById(id);
		try {

			if (findById.isPresent()) {
				Product p = dao.findById(id).get();
				dao.deleteById(id);
				return new ResponseEntity<Product>(p, HttpStatus.OK);
			} else {
				throw new RecordNotFoundException("Record not present");
			}
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}
