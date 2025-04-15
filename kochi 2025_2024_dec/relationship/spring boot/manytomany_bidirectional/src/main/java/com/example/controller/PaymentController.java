package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Payment;
import com.example.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
 
    @PostMapping("/process")
    public ResponseEntity<Payment> processPayment(
            @RequestParam int orderID,
            @RequestParam String paymentMethod,
            @RequestParam double amount) {
        Payment processedPayment = paymentService.processPayment(orderID, paymentMethod, amount);
        return new ResponseEntity<>(processedPayment, HttpStatus.CREATED);
    }
 
    @GetMapping("/order/{orderID}")
    public ResponseEntity<Payment> getPaymentByOrderID(@PathVariable int orderID) {
        Optional<Payment> payment = paymentService.getPaymentByOrderID(orderID);
        return payment.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
 
    @GetMapping("/all")
    public ResponseEntity<List<Payment>> getAllPayments() {
        List<Payment> payments = paymentService.getAllPayments();
        return new ResponseEntity<>(payments, HttpStatus.OK);
    }
 
    @DeleteMapping("/{paymentID}")
    public ResponseEntity<Void> deletePayment(@PathVariable int paymentID) {
        paymentService.deletePayment(paymentID);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}