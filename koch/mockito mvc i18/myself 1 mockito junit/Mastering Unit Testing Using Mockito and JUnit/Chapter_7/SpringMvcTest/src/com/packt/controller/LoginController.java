package com.packt.controller;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.model.LoginInfo;

@Controller
@Scope("session")
public class LoginController implements Serializable {


	@RequestMapping({ "/", "/login" })
	public String onStartUp(ModelMap model) {
		model.addAttribute("loginInfo", new LoginInfo());
		return "login";

	}
	
	@RequestMapping({ "/onLogin" })
	public String onLogin(@ModelAttribute("loginInfo") LoginInfo loginInfo,
			ModelMap model) {
		if(!"junit".equals(loginInfo.getUserId())) {
		     model.addAttribute("error", "invalid login name");
		     return "login";
		}
		
		if(!"password".equals(loginInfo.getPassword())) {
		     model.addAttribute("error", "invalid password");
		     return "login";
		}

		 model.addAttribute("name", "junit reader!");
		 return "greetings";
	}

}
