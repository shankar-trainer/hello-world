package com.cts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/hello")
	public String disp() {
		return "hello";
	}

	@RequestMapping("/form")
	public String customrForm() {
		return "form";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String customrForm1(HttpServletRequest request) throws IOException {

		String id1 = request.getParameter("custId");
		String name = request.getParameter("custName");
		String location = request.getParameter("custLocation");
		if (id1 == null || id1 == "") 
			request.setAttribute("error", "Id is blank ");
		 else if (name == null || name == "")
			request.setAttribute("error", "Name is blank ");

		else if (location == null || location == "")
			request.setAttribute("error", "Location is blank ");

		else {
			int id = Integer.parseInt(request.getParameter("custId"));

			Customer customer = new Customer();
			customer.setCustId(id);
			customer.setCustName(name);
			customer.setCustLocation(location);

			request.setAttribute("customer", customer);
		}
		return "formResult";
	}

}
