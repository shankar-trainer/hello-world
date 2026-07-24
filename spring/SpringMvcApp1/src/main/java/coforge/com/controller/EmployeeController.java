package coforge.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coforge.model.Employee;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/employee")
//@RequestMapping("/")
public class EmployeeController {

//	@GetMapping("/empForm")
	@RequestMapping("/empForm")
	public String employeeForm(Model model) {
		Employee emp = new Employee();
		model.addAttribute("emp", emp);
		System.out.println("employee form runs");
		return "EmployeeForm";
	}

	@RequestMapping("/empAction")
	public String employeeProcess(@ModelAttribute("emp") @Valid Employee emp, BindingResult result) {

		if (result.hasErrors()) {
			return "EmployeeForm";
		}

		return "empResult";
	}

}
