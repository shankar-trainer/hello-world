package com.cg.springwithangular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springwithangular.beans.Country;
import com.cg.springwithangular.service.ICountryService;

@RestController
public class CountryController {
	@Autowired
	ICountryService service;

	@RequestMapping(value = "/countries/search/{id}",method = RequestMethod.GET,headers="Accept=application/json")
	public Country getCounty(@PathVariable int id) {
		return service.searchCountry(id);
		
	}
	
		@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Country with this id not present")
	    @ExceptionHandler({Exception.class})
	    public void handleException() {
	        
	    }


	
	@RequestMapping(value = "/countries",method = RequestMethod.GET,headers="Accept=application/json")
	public List<Country> getAllCounties(Model model) {
		return service.getAllCountries();
		
	}
	
}
