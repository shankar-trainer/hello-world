package org.capg.web;

import java.util.List;

import org.capg.model.Product;
import org.capg.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping("/gettAll")
	public List<Product> showAll(){
	   return service.getAllProduct();	
	}
}
