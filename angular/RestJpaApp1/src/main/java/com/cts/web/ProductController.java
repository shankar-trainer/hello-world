package com.cts.web;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cts.model.Product;

import cts.com.web.WebComponent;
import javassist.bytecode.stackmap.BasicBlock.Catch;
import com.cts.dao.ProductRepository;
import com.cts.error.ProductUpdateException;
import com.cts.error.RecordNotFoundException;

@RestController
@RequestMapping("/prd")
@CrossOrigin(value = "http://localhost:4200")
public class ProductController {
	static Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	ProductRepository dao;

//	@RequestMapping("/getAll")
	@GetMapping("/getAll")
	public ResponseEntity<List<Product>> getAllProduct() {

		if (dao.findAll().size() > 0)
			return new ResponseEntity<List<Product>>(dao.findAll(), HttpStatus.OK);
		else
			return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = RecordNotFoundException.class)
	public void productError() {

	}

	@ExceptionHandler(value = Exception.class)
	public void addProductError() {

	}

	@GetMapping("/search/{id}")
	// @RequestMapping("/search/{id}")
	// @ExceptionHandler(value = RecordNotFoundException.class)

	public ResponseEntity<Product> searchProduct(@PathVariable("id") int id) {

		Optional<Product> opt = dao.findById(id);
		try {
			if (opt.isPresent())
				return new ResponseEntity<Product>(opt.get(), HttpStatus.OK);

			else {
				logger.error("Record with id " + id + " is not present");
				throw new RecordNotFoundException("Record with id " + id + " is not present");

			}
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/delete/{id}")
	// @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Product> deleteProduct(@PathVariable("id") int id) {

		Optional<Product> opt = dao.findById(id);
		try {
			if (opt.isPresent()) {
				System.out.println("product to be deleted " + opt.get());

				dao.delete(opt.get());
				return new ResponseEntity<Product>(opt.get(), HttpStatus.OK);
			} else {
				throw new RecordNotFoundException("Record Not Present with  id  " + id + " \n So cannot be deleted");
			}
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

//	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product prd) {

		Optional<Product> opt = dao.findById(prd.getId());
		try {
			if (!opt.isPresent())
				return new ResponseEntity<Product>(dao.save(prd), HttpStatus.OK);
			else {
				throw new Exception("product already present");
			}
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/updateProduct")
	public ResponseEntity<Product> updateProduct(@RequestBody Product prd) {

		Optional<Product> opt = dao.findById(prd.getId());
		try {
			if (opt.isPresent()) {
				return new ResponseEntity<Product>(dao.save(prd), HttpStatus.OK);
			} else
				throw new ProductUpdateException("Product cannot be updated\nProduct not present");
		} catch (ProductUpdateException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}
