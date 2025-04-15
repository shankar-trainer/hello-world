package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.model.MenuItem;
import com.example.model.Order;
import com.example.repository.CustomerRepository;
import com.example.repository.MenuItemRepository;
import com.example.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
 
    @Autowired
    private CustomerRepository customerRepository;
 
    @Autowired
    private MenuItemRepository menuItemRepository;
 
    public Order placeOrder(int customerID, List<Integer> menuItemIDs) {
        Customer customer = customerRepository.findById(customerID)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
 
        List<MenuItem> menuItems = menuItemRepository.findAllById(menuItemIDs);
 
        Order order = new Order();
        order.setCustomer(customer); // Set the customer for the order
      //  order.setMenuItems(menuItems);
        order.setStatus("Pending");
        order.setTotalAmount(menuItems.stream().mapToDouble(MenuItem::getPrice).sum());
 
        // Add the order to the customer's orders list
        //customer.getOrders().add(order);
        
 
        // Save the order (this will also update the customer due to CascadeType.ALL)
        return orderRepository.save(order);
    }
 
    public List<Order> getOrdersByCustomerID(int customerID) {
        return orderRepository.findByCustomer_CustomerID(customerID);
    }
 
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
 
    public void deleteOrder(int orderID) {
        orderRepository.deleteById(orderID);
    }
}