package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Theater;
import com.cg.entity.Ticket;
import com.cg.services.CustomerServiceImpl;
import com.cg.exceptions.TicketCancellationException;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerservice;
	
	@GetMapping("/city/all")
	public ResponseEntity<Theater> chooseCity(String city){
		boolean allcities=customerservice.chooseCity(city);
		return new ResponseEntity<Theater>(HttpStatus.OK);
	}
	
	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<Ticket> deleteTicketById(@PathVariable("id") int ticketId) throws TicketCancellationException {

		ResponseEntity<Ticket> rt = null;
		//boolean flag = false;
		if (ticketId != 0) {
			customerservice.cancelMovieTicket(ticketId);
			rt = new ResponseEntity<Ticket>(HttpStatus.OK);
		}
		else {
			rt = new ResponseEntity<Ticket>(HttpStatus.NOT_FOUND);
		}
		return rt;
	}

}
