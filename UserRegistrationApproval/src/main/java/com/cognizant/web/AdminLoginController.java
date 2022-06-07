package com.cognizant.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.dao.AdminDaoImpl;
import com.cognizant.model.Admin;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {

	@RequestMapping("/login")
	public String loginForm(Model model) {
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		return "LoginForm";
	}

	@Autowired
	AdminDaoImpl dao;
	
	@RequestMapping("/loginAction")
	public String LoginFormProcess(@ModelAttribute("admin")  Admin admin , ModelMap map) {
                   boolean b= dao.chceckLogin(admin);
                    map.addAttribute("status", b);
                    if(b) {
                    	 map.addAttribute("list",	dao.getUserList());
                    }
 		return "LoginResult";
	}
}
