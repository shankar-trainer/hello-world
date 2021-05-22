package com.cts.web;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.dao.ProductDao;
import com.cts.model.Product;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductDao dao;
	
	@GetMapping("/prdForm")
	public String prdInit(ModelMap map) {
		map.addAttribute("prd", new Product());
	    return "ProductForm";
	}
	
Product product=null;
	@PostMapping("/prdResult")
	public String prdPorocess(@ModelAttribute("prd") Product prd, @RequestParam("operation") String operation, ModelMap map1) {
        product=null;
		if(operation.equals("Add Product")) {
        	 
        	product=dao.addProduct(prd);
        	if(product!=null) {
        		map1.addAttribute("message", "product added");
        	} 
        	else
        		map1.addAttribute("message", "product already present");
        }
		else if(operation.equals("Show Product")) {
	        HashMap<Integer, Product> productList = dao.getProductList();
	        map1.addAttribute("message", "All Products");
	        map1.addAttribute("productList", productList);
		}
		return "ProductResult";
	}
	
}
