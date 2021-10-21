package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.Book;

@Controller
@RequestMapping("/book")
public class BookController {

	@RequestMapping("/bookForm")
	public String BookPage(ModelMap map1) {
		map1.addAttribute("book", new Book());
		return "BookForm";
	}

}
