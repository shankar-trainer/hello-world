package com.example.web;

import com.example.model.Order;
import com.example.model.Product;
import com.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class OrderController {

    RestTemplate restTemplate = new RestTemplate();

    @Autowired
    OrderRepository orderRepository;

    @PostMapping("/order/{prdid}")
    public Order addOrder(@RequestBody Order order,@PathVariable("prdid") int prdid  ) {
        ResponseEntity<Product> productResponseEntity = searchProductById(prdid);
        Product body = productResponseEntity.getBody();
        order.setProduct(body);
        return orderRepository.save(order);
    }
    @GetMapping("/order")
    public List<Order> getAllOrder(){
        return  orderRepository.findAll();
    }

    //ResponseEntity<List<?>>
    @GetMapping("/order/product")
    public Product[] getAllProduct() {
        ResponseEntity<Product[]> forEntity = restTemplate.getForEntity("http://localhost:8080/product", Product[].class);
        Product[] body = forEntity.getBody();
        return body;
    }

    @GetMapping("/order/product/{id}")
    public ResponseEntity<Product> searchProductById(@PathVariable("id") int id) {
        return restTemplate.getForEntity("http://localhost:8080/product/"+id, Product.class);
    }

}
