package com.cts.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.Product;
import com.cts.model.User;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/product")
public class ProductController {

	@GetMapping("/form")
	public String form(ModelMap map) {
		map.addAttribute("product", new Product());
		return "productform";
	}

	List<Product> plist; 
	@PostMapping("/productsubmit")
	public String submitform(@ModelAttribute @Valid Product product, BindingResult result, HttpSession session
			) {

		if (result.hasErrors())
			return "productform";
		else {
			List<Product>	 plist=(List<Product>)session.getAttribute("plist");
			if(plist==null) {
				plist=new ArrayList<Product>();
				plist.add(product);
				session.setAttribute("plist", plist);
			}else {
			plist.add(product);
			session.setAttribute("plist", plist);
			}
			return "productpayment";
		}
	}
}
