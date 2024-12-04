package com.example.feign;

import com.example.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="PRODUCT-ORDER-APP")
public interface OrderFeign {

    @GetMapping("/order")
    public List<Order> getAllOrder();

    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable("id") int id);


    }
