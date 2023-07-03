package org.abc.web;


import java.util.List;

import org.abc.entity.Payment;
import org.abc.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@RequestMapping("/all")
     public List<Payment> getAllOrder() {
       return   paymentService.getOrderList();  	 
     }	
	
	@PostMapping("/add")
	public Payment saveOrder(@RequestBody Payment payment) {
		return   paymentService.savePayment(payment);  	 
	}	

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId)  throws JsonProcessingException {
              return paymentService.findPaymentHistoryByOrderId(orderId);
    }
	
	
}
