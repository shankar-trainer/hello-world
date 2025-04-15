package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.exception.LibraryException;
import com.example.model.Library;
import com.example.service.LibraryService;

import jakarta.validation.Valid;

@Controller
@RequestMapping
@SessionAttributes("operation")
public class LibraryController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/libraryForm")
	public String libraryForm(ModelMap map) {
		 Library library = new Library();
		 library.setLibraryId(0);
		 library.setLibraryLocation(" ");
		 library.setLibraryName("  ");
		 
		map.addAttribute("library",library);
		return "libraryform";
	}
	
	@Autowired
	LibraryService libraryService;

	@PostMapping("/libraryPost")
	public String libraryPost(@ModelAttribute("library") @Valid Library library, BindingResult result,
			@RequestParam("operation") String operation, ModelMap map) {

		if (result.hasErrors()) {
			return "libraryform";

		} else {

			map.addAttribute("operation", operation);

			System.out.println("add operation " + library);

			if (operation.equals("add library")) {
				libraryService.addLibrary(library);
			} else if (operation.equals("show all library")) {

				List<Library> allLibrary = libraryService.getAllLibrary();
				map.addAttribute("showall", allLibrary);
			}
			else if(operation.equals("update")) {
				Library updateLibrary = libraryService.updateLibrary(library);
				map.addAttribute("updateLibrary",updateLibrary);
			}

			return "libraryresult";
		}

	}
	
	
	@ExceptionHandler(exception = {LibraryException.class, Exception.class})
	public String  getError1() {
    		return "error1";
		
	}
	

}
