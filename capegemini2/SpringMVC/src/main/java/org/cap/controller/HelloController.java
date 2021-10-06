package org.cap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		return new ModelAndView("helloPage","message","Hello! Welcome!"); 
	}
}
