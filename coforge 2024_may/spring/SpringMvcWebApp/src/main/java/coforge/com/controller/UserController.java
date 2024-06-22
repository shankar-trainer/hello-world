package coforge.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import coforge.com.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "UserForm";
	}
	
	@RequestMapping("/userAction")
	public String UserAction(@RequestParam("id") int id,
			@RequestParam("name") String name,
			ModelMap map
			) {
		
		User user=new User();
		user.setId(id);
		user.setName(name);
		map.addAttribute("user", user);
		return "UserResult";
	}
	
}
