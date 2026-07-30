package com.coforge.web;

import com.coforge.model.Order;
import com.coforge.model.Product;
import com.coforge.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository repo;

    RestTemplate restTemplate=new RestTemplate();

    @PostMapping("/order")
    public Order addOrder(@RequestBody  Order order){
        Product product = restTemplate.getForObject("http://localhost:9090/product/" + order.getPrdId(), Product.class);

        if(product!=null)
        return    repo.save(order);
        else
            return  null;
    }
    @GetMapping("/order")
    public List<Order> getAllOrder(){
        return  repo.findAll();
    }

}
