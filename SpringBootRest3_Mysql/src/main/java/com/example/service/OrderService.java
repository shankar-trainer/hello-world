package com.example.service;

import com.example.dao.OrderRepository;
import com.example.dao.ProductRepository;
import com.example.exception.OrderException;
import com.example.exception.ProductException;
import com.example.model.Order;
import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository repository;

    public Order addOrder(Order o) throws ProductException {
        Order order = searchOrder1(o.getOrderId());
        if (order != null)
            throw new ProductException("order already present..");
        else
        return repository.save(o);
    }

    public Order updateProduct(Order o) throws OrderException, ProductException {
        Order order = searchOrder1(o.getOrderId());
        if (order == null)
            throw new OrderException("order not present");
        else
            return repository.save(order);
    }

    public Order searchProduct(int id) throws OrderException {
        Optional<Order> byId = repository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            throw new OrderException("product not found");
    }

    public Order searchOrder1(int id) throws ProductException {
        Optional<Order> byId = repository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        }
        else
            return null;
    }

    public Order  deleteOrder(int id) throws OrderException, ProductException {
        Order order = searchOrder1(id);
        if (order == null)
            throw new OrderException("order not  present");
        else {
            repository.delete(order);
            return order;
        }
    }

    public List<Order> getAllOrder() throws OrderException {
        if (repository.findAll().size() == 0)
            throw new OrderException("product list is empty");
        else {
            return repository.findAll();
        }
    }
}
