package org.com.capgemini.controller;

import java.util.List;

import org.com.capgemini.model.Product;
import org.com.capgemini.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prd")
public class ProductController {

	@Autowired
	ProductService productService;
	
	public String productPage(){
		return "UserList";
		
	}

	@RequestMapping("/prdList")
	public String productList(Model model){
		List<Product> prdList=productService.showAllProduct();
		model.addAttribute("prdList", prdList);
		return "ProductList";
		
	}
	
}
