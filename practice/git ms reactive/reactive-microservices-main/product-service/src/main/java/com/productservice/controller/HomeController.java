package com.productservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.RedirectView;

@Controller
public class HomeController {

	@GetMapping
	public RedirectView redirectToSwaggerUi() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("/swagger-ui.html");

		return redirectView;
	}

}
