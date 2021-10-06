package org.com.controller;


import org.com.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/cust")
public class CustomerController {

	RestTemplate template = new RestTemplate();
	String url = "http://localhost:9090/SpringRestCrud/cst/getAll/";
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		Customer cst = new Customer();
		cst.setId(0);
		cst.setName(null);
		cst.setSalary(0);
		model.addAttribute("cst", cst);
		return "loginform";
	}

	@PostMapping("/login")
	public String CustomerResult(@ModelAttribute("cst") Customer cst, Model model, BindingResult result1,
			@RequestParam("operation") String operation) {
		String result = null;
		switch (operation) {
		case "Show All Customer":
			Customer[] forObject = template.getForObject(url, Customer[].class);
			model.addAttribute("customer", forObject);
			result = "CustomerResult";
			break;

		case "Add Customer":
			try {
				ResponseEntity<Customer> postForEntity = template.postForEntity(url, cst, Customer.class);
				model.addAttribute("customer", postForEntity.getBody());
				result = "CustomerResult1";
			} catch (HttpClientErrorException | HttpServerErrorException httpClientOrServerExc) {
				if (HttpStatus.NOT_FOUND.equals(httpClientOrServerExc.getStatusCode())) {
					result = "CustomerError1";
					model.addAttribute("error", "customer already   present <br>Cannot be added");
					/*try {
						throw new RuntimeException("customer already ...  present");
					} catch (RuntimeException e) {
					}*/
				} else {
				}
			}
			break;
		case "Find Customer":
			Customer findObject = template.getForObject(url + "/" + cst.getId(), Customer.class);
			model.addAttribute("customer", null);
			model.addAttribute("customer", findObject);
			result = "CustomerResult2";

			break;
		case "Update Customer":

			try {
				template.put(url, cst, Customer.class);
				model.addAttribute("customer", cst);
				result = "CustomerResult1";
			} catch (HttpClientErrorException | HttpServerErrorException httpClientOrServerExc) {
				if (HttpStatus.NOT_FOUND.equals(httpClientOrServerExc.getStatusCode())) {
					result = "CustomerError1";
					model.addAttribute("error", "customer not  present <br>Cannot be updated");
				/*	try {
						throw new RuntimeException("customer not  ...  present");
					} catch (RuntimeException e) {
					}*/
				} else {
				}
			}
			break;
		case "Remove Customer":
			try {
				template.delete(url + "/" + cst.getId(),Customer.class);
				result = "CustomerResult3";
			} catch (HttpClientErrorException | HttpServerErrorException httpClientOrServerExc) {
				if (HttpStatus.NOT_FOUND.equals(httpClientOrServerExc.getStatusCode())) {
					result = "CustomerError1";
					model.addAttribute("error", "customer not  present <br>  Cannot be removed");
					/*try {
						throw new RuntimeException("customer not   present<br>Cannot be deleted");
					} catch (RuntimeException e) {

					}*/
				} else {
				}
			}
			break;
		default:
			break;
		}
		return result;
	}
}
