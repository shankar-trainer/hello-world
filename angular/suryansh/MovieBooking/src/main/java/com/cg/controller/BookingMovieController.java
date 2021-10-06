package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exceptions.* ;
import com.cg.services.BookingServiceImpl;
import com.cg.entity.Booking;
import com.cg.entity.Seat;
import com.cg.entity.Payment;
import com.cg.entity.Ticket;
import com.cg.services.*;

@RestController
@RequestMapping("/booking")
public class BookingMovieController {
	@Autowired
	BookingServiceImpl service;
//	@Autowired
//	TicketServiceImpl ticketservice;
//	@Autowired
//	SeatServiceImpl seatservice;
	
	@GetMapping("/seats/all")
	public ResponseEntity<List<Seat>> getAllSeats(){
		List<Booking> allseats=service.getListOfSeats();
		return new ResponseEntity<List<Seat>>(HttpStatus.OK);
	}
	
	@GetMapping("/id/{seatId}")	
	public ResponseEntity<Seat> getSeatById(@PathVariable int seatId) throws BookingBlockedException{
		Booking seat= service.getSeatById(seatId);
		return new ResponseEntity<Seat>(HttpStatus.OK);
	}
	
	@GetMapping("/id/{ticketId}")	
	public ResponseEntity<Ticket> getTicketById(@PathVariable int ticketId) throws BookingBlockedException{
		Booking ticket= service.getTicketById(ticketId);
		return new ResponseEntity<Ticket>(HttpStatus.OK);
	}
	
	@GetMapping("/payment/all")
	public ResponseEntity<Payment> makePayment(@PathVariable String paymentMethod,double totalcost){
		//List<Payment> PaymentMethod=service.makePayment(paymentMethod,totalcost);
		//List<Payment> list=paymentMethod.getCardNumber();
		ResponseEntity<Payment> rt = null;
		if(paymentMethod!=null) {
			//service.getDetails(long cardnumber,int expmonth,int expyear,int cvc);
			service.setCardNumber(cardnumber);
			service.setExpMonth();
			service.setExpYear();
			service.setCvc();
			rt = new ResponseEntity<Payment>(HttpStatus.OK);
		}
		else {
			rt = new ResponseEntity<Payment>(HttpStatus.NOT_FOUND);
		}
		return rt;	
	}
	
	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<Ticket> deleteTicketById(@PathVariable("id") int ticketId) throws TicketCancellationException {

		ResponseEntity<Ticket> rt = null;
		//boolean flag = false;
		if (ticketId != 0) {
			service.cancelTicketById(ticketId);
			rt = new ResponseEntity<Ticket>(HttpStatus.OK);
		}
		else {
			rt = new ResponseEntity<Ticket>(HttpStatus.NOT_FOUND);
		}
		return rt;
	}

}
