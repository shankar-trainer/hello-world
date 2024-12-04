package com.example.web;

import com.example.model.Order;
import com.example.model.Product;
import com.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
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
        //ResponseEntity<Product> productResponseEntity = searchProductById(prdid);
        ResponseEntity<Product> productResponseEntity = restTemplate.getForEntity("http://localhost:7070/product/" + prdid, Product.class);
        Product body = productResponseEntity.getBody();
        order.setProduct(body);
        return orderRepository.save(order);
    }
    @GetMapping("/order")
    public List<Order> getAllOrder(){
        return  orderRepository.findAll();
    }

    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable("id") int id){
        System.out.println(orderRepository.findById(id).get());
        return  orderRepository.findById(id).get();
    }

    @GetMapping("/order/product/{id}")
    public ResponseEntity<?> searchProductById(@PathVariable("id") int id) {
        try {
            return restTemplate.getForEntity("http://localhost:7070/product/" + id, Product.class);
        }
        catch (HttpClientErrorException e){
            return  new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    //ResponseEntity<List<?>>
    @GetMapping("/order/product")
    public Product[] getAllProduct() {
        ResponseEntity<Product[]> forEntity = restTemplate.getForEntity("http://localhost:7070/product", Product[].class);
        Product[] body = forEntity.getBody();
        return body;
    }
}

