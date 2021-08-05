package com.cts.controller;

import com.cts.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.Book;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping
		("/book")
@SessionAttributes({"book","allBook","operation","message"})
///@SessionAttributes("allBook")

public class BookController {

	@Autowired
	BookDao dao;

	@RequestMapping(value = "/bookForm" ,method = RequestMethod.GET)
	public String BookPage(ModelMap map1) {
		map1.addAttribute("book", new Book());
		return "BookForm";
	}

	@RequestMapping(value = "/bookAction" ,method = RequestMethod.POST)
	public String BookAction(@ModelAttribute("book") Book book, @RequestParam("operation") String operation,ModelMap map1) {

		//map1.addAttribute(operation);
		map1.addAttribute("operation",operation);

		System.out.println("operation "+map1.getAttribute("operation"));

		if(operation.equals("Add Book")){
			if(dao.addBook(book))
				map1.addAttribute("message","book added");
			else
				map1.addAttribute("message","book already present");
		}

		else if(operation.equals("Show All Book")){
			List<Book> allBook = dao.getAllBook();
			System.out.println("all book size "+allBook.size());

			map1.addAttribute("message", "All Books Are");

            map1.addAttribute("allBook",allBook);
			System.out.println(map1.getAttribute("allBook"));
		}
		return "BookResult2";
	}

}
