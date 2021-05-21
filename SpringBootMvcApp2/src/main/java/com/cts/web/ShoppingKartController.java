package com.cts.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cts.error.ProductException;
import com.cts.model.Product;
import com.cts.service.ShoppingKartService;

@Controller
@RequestMapping("/shopping")
@SessionAttributes(value= {"product","allprd"})
public class ShoppingKartController {

	@RequestMapping("/page1")
	public String shoppingPage(ModelMap map) {
		Product product = new Product();
		product.setCost(0.0f);
		product.setPrdName(" ");
		
		map.addAttribute("product", product);
		return "shoppingPage";
	}

	@Autowired
	ShoppingKartService service;
	@PostMapping("/shoppingAction")
	public String myshopping(@ModelAttribute("product") @Valid Product product, BindingResult bindingResult,
			@RequestParam("operation") String operation, HttpServletRequest request,ModelMap map
			
			) throws ProductException {
		
		HttpSession session =request.getSession();
		session.setMaxInactiveInterval(5);
		
		if (bindingResult.hasErrors())
			return "shoppingPage";
		else {
			if (operation.equals("Add Product")) {
				service.addProduct(product);
				request.setAttribute("msg", "Product Added");
			} 
			else if (operation.equals("ShowAll Product")) {
				request.setAttribute("msg", "All Product");
				//request.setAttribute("allprd", service.showAllProduct());
			    map.addAttribute("allprd",  service.showAllProduct());
			}
			else if (operation.equals("Search Product")) {
				request.setAttribute("msg", "Product Found");
				request.setAttribute("prd", service.searchProduct(product));
			}

		}
		return "shoppingResult";

	}

}
