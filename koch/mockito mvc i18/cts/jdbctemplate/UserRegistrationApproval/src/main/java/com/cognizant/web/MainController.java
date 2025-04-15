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
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
