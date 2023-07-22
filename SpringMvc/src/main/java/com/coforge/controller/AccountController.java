package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

	@RequestMapping("/actform")
	public String form() {
		return "accountpage/AccountForm";
	}
}
