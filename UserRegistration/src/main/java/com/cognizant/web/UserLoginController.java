package com.cognizant.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.dao.LoginDaoImpl;
import com.cognizant.model.Login;

@Controller
@RequestMapping("/user")
public class UserLoginController {

	@RequestMapping("/login")
	public String loginForm(Model model) {
		Login login = new Login();
		model.addAttribute("login", login);
		return "LoginForm";
	}

	@Autowired
	LoginDaoImpl dao;
	
	@RequestMapping("/loginAction")
	public String LoginFormProcess(@ModelAttribute("login")  Login login , ModelMap map) {
                   String s= dao.chceckLogin(login);
                    map.addAttribute("credential", s);
 		return "LoginResult";
	}
}
