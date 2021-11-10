package org.capg.web;

import java.util.List;

import org.capg.model.Product;
import org.capg.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping
	//@RequestMapping("/getAll")
	public List<Product> showAll(){
	   return service.getAllProduct();	
	}
	
	//@RequestMapping(value = "/add",method = RequestMethod.POST)
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product p  ){
		return service.addProduct(p);	
	}
	
	//@RequestMapping(value = "/search/{id}")
	@GetMapping(value = "/search/{id}")
	public Product searchProduct(@PathVariable("id") int id  ){
		return service.findProduct(id);	
	}
	
	@RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
	//@DeleteMapping(value = "/remove/{id}")
	public Product deleteProduct(@PathVariable("id") int id  ){
		return service.deleteProduct(id);	
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.PUT)
	//@PutMapping(value = "/update")
	public Product updateProduct(@RequestBody Product p  ){
		return service.updateProduct(p);	
	}
	
	
}
