package org.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class HelloController {

	@RequestMapping("/abc")
	public ModelAndView sayHello() {
		return new ModelAndView("helloPage", "message", "Hello! Welcome!");
	}

	@RequestMapping("/abc1")
	public String sayHello1() {
		return "welcome";
	}
}
