package com.cts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.dao.ShoppingKart;
import com.cts.model.Product;

@Controller
@RequestMapping("/kart")
public class ShoppingKartController {
	@Autowired
	ShoppingKartValidator validator;

	@Autowired
	ShoppingKart dao;

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping("/first")
	public String shoppingPage(ModelMap map) {
		Product prd = new Product();
		prd.setPrdId(0);
		prd.setPrdCost(0.0f);
		prd.setPrdName("  ");
		prd.setPrdLocation("  ");
		map.addAttribute("prd", prd);
		return "ShoppingForm";
	}

	@RequestMapping(value = "/kartAction", method = RequestMethod.POST)
	public String shoppingProcess(@ModelAttribute("prd") Product prd, BindingResult result,
			@RequestParam("operation") String operation, ModelMap map) throws Exception {
		validator.validate(prd, result);
		map.addAttribute("operation", operation);
		if (result.hasErrors()) {
			return "ShoppingForm";
		} else {
			if (operation.equals("Add Product")) {
					map.addAttribute("msg", "Product Added<br>Product Details are <br>");
			} else if (operation.equals("Show All Product")) {
					map.addAttribute("msg", "All Products List <br>");
					map.addAttribute("prdMap", dao.getAllProduct());
			}

			else if (operation.equals("Search Product")) {

					map.addAttribute("msg", "Product Found <br>");
					map.addAttribute("prd", dao.searchProduct(prd));
			}

			else if (operation.equals("Remove Product")) {
				Product prd1 = dao.removeProduct(prd);
					map.addAttribute("msg", "Product Deleted <br>");
					map.addAttribute("prd", prd1);
			} else if (operation.equals("Update Product")) {
				Product prd1 = dao.updateProduct(prd);
					map.addAttribute("msg", "Product Updated <br>");
					map.addAttribute("prd", prd1);
			}
			return "ShoppingDetail";
		}
	}

}
