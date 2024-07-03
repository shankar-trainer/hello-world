package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentRepository repository;

    RestTemplate restTemplate=new RestTemplate();

    @GetMapping("/all")
    public List<Order> getAllOrder() {
        Order[] forObject = restTemplate.getForObject("http://localhost:9090/order/all", Order[].class);
       return  Arrays.asList(forObject);
    }

    @GetMapping("/allpayment")
    public List<Payment> getAllPayment() {
        Order[] forObject = restTemplate.getForObject("http://localhost:9090/order/all", Order[].class);
        List<Order> list = Arrays.asList(forObject);

        for (Order order:list) {
          Payment payment=new Payment();
          payment.setOrder_id(order.getId());
          payment.setAmt(1000);
          payment.setLocation("delhi");
            repository.save(payment);
        }
        return repository.findAll();
    }

    @GetMapping("/search/{id}")
    public Order searchOrderById(@PathVariable("id") long id) {
        return restTemplate.getForObject("http://localhost:9090/order/search/"+id, Order.class);       
    }

}