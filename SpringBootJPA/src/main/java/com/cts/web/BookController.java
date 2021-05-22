package com.cts.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@RequestMapping("/form")
	public String  bookForm() {
        System.out.println("book form ............");		
		return "BookForm";
	}
}
