package coforge.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coforge.exception.UserException;
import com.coforge.model.User;

@Controller
@RequestMapping("/")
public class UserController {

	@RequestMapping("/userform")
	public String form() {
		return "UserForm";
	}

	@GetMapping("/")
//	@RequestMapping("/")
	public String index() {
		return "index";
	}

//	@GetMapping("/userAction")
	@PostMapping("/userAction")
	public String userProcess(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("salary") float salary, ModelMap map) {
		if (id <= 0)
			throw new UserException("invalid id");
		else if (name.isBlank())
			throw new UserException("invalid name");
		else if (salary <= 0)
			throw new UserException("invalid salary");
		else {
			User user = new User();
			user.setId(id);
			user.setName(name);
			user.setSalary(salary);
			map.addAttribute("user", user);
			return "userResult";
		}
	}
//
//	@ExceptionHandler(value = {UserException.class, Exception.class})
//	public String exception1() {
//		return "error1";
//	}

}
