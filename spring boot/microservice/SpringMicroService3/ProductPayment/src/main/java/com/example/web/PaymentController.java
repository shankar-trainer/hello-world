package com.example.web;

import com.example.feign.OrderFeign;
import com.example.model.Order;
import com.example.model.Payment;
import com.example.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PaymentController {

    @Autowired
    OrderFeign orderFeign;

    @Autowired
    PaymentRepository paymentRepository;

    @GetMapping("/payment/all")
    public List<Order> getAllOrder() {
        return orderFeign.getAllOrder();
    }

    @GetMapping("/payment/{id}")
    public Order getOrderById(@PathVariable("id") int id) {
        return orderFeign.getOrderById(id);
    }

    @PostMapping("/payment/add/{orderid}")
    public Payment addPayment(@RequestBody Payment payment, @PathVariable("orderid") int orderid) {
        Order order1 = getOrderById(orderid);
        if (order1 != null) {
            payment.setOrder(order1);
            return paymentRepository.save(payment);
        }
        return null;
    }

}
