package com.cts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.CardRepository;
import com.cts.dao.CashRepository;
import com.cts.model.CardPayment;
import com.cts.model.CashPayment;

@RestController
@RequestMapping("/payment")
public class PaymentController {


	@Autowired
	CashRepository cashRep;
	
	@Autowired
	CardRepository cardRep;
	
	
	@GetMapping("/cashall")
	public List<CashPayment> getcashPayment(){
	 return	cashRep.findAll();
	}
	
	@GetMapping("/cardall")
	public List<CardPayment> getcardPayment(){
		return	cardRep.findAll();
	}
	
	@PostMapping("/addcash")
	public CashPayment addCash(@RequestBody  CashPayment cashPayment ) {
	  return 	cashRep.save(cashPayment);
	}
	
	@PostMapping("/addcard")
	public CardPayment addCard(@RequestBody  CardPayment cardPayment ) {
		return 	cardRep.save(cardPayment);
	}
}
