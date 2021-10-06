package org.com;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@ModelAttribute("loc_list")
	public List<String> getLocation(){
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Chennai");
		list1.add("Banglore");
		list1.add("Noida");
		list1.add("Coimbtotre");
		return list1;
	}
	
	
	@RequestMapping(value="/login") 
	public String login(ModelMap map){
		Employee employee=new Employee();
		map.addAttribute("emp", employee);
	  return "login";	
	}
	
	@RequestMapping(value="empLogin")
	public String loginProcess(@ModelAttribute("emp") @Valid Employee emp1,BindingResult result, ModelMap  map){
		
		if(result.hasErrors()){
			return "login";
		}
		else{
			map.addAttribute(emp1);
			return "empResult";
			
		}
	}
	
	
	
	
	
}
