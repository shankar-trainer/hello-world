package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Order;
import com.example.model.Payment;
import com.example.repository.OrderRepository;
import com.example.repository.PaymentRepository;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
 
    @Autowired
    private OrderRepository orderRepository;
 
    // Simulate payment gateway integration
    private boolean processPaymentThroughGateway(String paymentMethod, double amount) {
        // In a real-world scenario, this would call a third-party payment gateway API
        // For now, we simulate a successful payment
        return true; // Payment successful
    }
 
    public Payment processPayment(int orderID, String paymentMethod, double amount) {
        Order order = orderRepository.findById(orderID)
                .orElseThrow(() -> new RuntimeException("Order not found"));
 
        // Simulate payment processing
        boolean paymentSuccess = processPaymentThroughGateway(paymentMethod, amount);
 
        Payment payment = new Payment();
        payment.setOrder(order);
        payment.setPaymentMethod(paymentMethod);
        payment.setAmount(amount);
        payment.setStatus(paymentSuccess ? "Successful" : "Failed");
 
        return paymentRepository.save(payment);
    }
 
    public Optional<Payment> getPaymentByOrderID(int orderID) {
        return paymentRepository.findByOrder_OrderID(orderID);
    }
 
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
 
    public void deletePayment(int paymentID) {
        paymentRepository.deleteById(paymentID);
    }
}