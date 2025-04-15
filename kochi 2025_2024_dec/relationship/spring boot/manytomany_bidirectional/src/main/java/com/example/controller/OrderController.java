package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Order;
import com.example.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
 
    @PostMapping("/place")
    public ResponseEntity<Order> placeOrder(@RequestParam int customerID, @RequestBody List<Integer> menuItemIDs) {
        Order placedOrder = orderService.placeOrder(customerID, menuItemIDs);
        return new ResponseEntity<>(placedOrder, HttpStatus.CREATED);
    }
 
    @GetMapping("/customer/{customerID}")
    public ResponseEntity<List<Order>> getOrdersByCustomerID(@PathVariable int customerID) {
        List<Order> orders = orderService.getOrdersByCustomerID(customerID);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
 
    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
 
    @DeleteMapping("/{orderID}")
    public ResponseEntity<Void> deleteOrder(@PathVariable int orderID) {
        orderService.deleteOrder(orderID);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}