package com.cts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.model.Address;
import com.cts.model.Employee;
import com.cts.service.AddressService;
import com.cts.service.EmployeeService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/form")
	public String welcome(ModelMap map) {
		map.addAttribute("employee", new Employee());
		return "EmployeeForm";
	}

	@Autowired
	private EmployeeService service;

	@Autowired
	AddressService addressService;

	@PostMapping("/login")
	public String welcome(@ModelAttribute @Valid Employee employee, BindingResult result) {
		if (result.hasErrors())
			return "EmployeeForm";
		else {
			service.addEmployee(employee);
			return "EmployeeResult";
		}
	}

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add")
	public Employee addEmployee(@ModelAttribute Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@PostMapping("/addAddress")
	public String addAddress(@RequestParam("location") String location, @RequestParam("pincode") long pincode,
			HttpSession session, ModelMap map) {

		Address address = new Address();
		address.setLocation(location);
		address.setPincode(pincode);

		var emp1 = (Employee) session.getAttribute("emp1");

		address.setEmployee(emp1);

		var address1 = addressService.addAddress(address);
		map.addAttribute("address1", address1);
		return "addressResult";

	}

	@GetMapping("/search")
	public Employee searchEmployeeById(@RequestParam("id") int id) {
		return employeeService.searchEmployeeById(id);
	}

	@GetMapping("/delete")
	public Employee deleteEmployeeById(@RequestParam("id") int id) {
		return employeeService.deleteEmployeeById(id);
	}

}
