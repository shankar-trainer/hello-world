package com.coforge;

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
    
    RestTemplate restTemplate=new RestTemplate();

    @GetMapping("/all")
    public List<Order> getAllOrder() {
        Order[] forObject = restTemplate.getForObject("http://localhost:9090/order/all", Order[].class);
       return  Arrays.asList(forObject);
    }

    @GetMapping("/search/{id}")
    public Order searchOrderById(@PathVariable("id") long id) {
        return restTemplate.getForObject("http://localhost:9090/order/search/"+id, Order.class);       
    }
}