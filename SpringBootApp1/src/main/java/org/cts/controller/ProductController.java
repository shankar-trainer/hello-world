package org.cts.controller;

import javax.servlet.http.HttpServletRequest;

import org.cts.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class ProductController {

//	@RequestMapping("/prdform")
	@RequestMapping( path =   "/prdform", method = RequestMethod.GET)
	public String hello() {

		return "myform";
	}

	@RequestMapping(path =   "/prdform", method = RequestMethod.POST)
	public String productProcess(HttpServletRequest req) {
		try {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		float cost = Float.parseFloat(req.getParameter("cost"));

		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setCost(cost);

		req.setAttribute("prd", product);
		}
		catch (Exception e) {
           req.setAttribute("error", e);
		
		}
		return "productResult";
	}

}
