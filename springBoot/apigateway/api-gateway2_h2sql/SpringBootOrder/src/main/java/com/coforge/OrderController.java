package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    DaoRepository repository;

    @GetMapping("/all")
    public List<Order> getAllOrder() {
        return  repository.findAll();
    }

    @GetMapping("/search/{id}")
    public Order searchOrderById(@PathVariable("id") long id) {
        return repository.findById(id).get();
    }
}



















/*
package com.coforge;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/order")
public class OrderController {

    static Order order[];

    static {
        order = new Order[]{
                new Order(10001, "book order", LocalDate.of(2023, 5, 12)),
                new Order(10002, "book order", LocalDate.of(2023, 4, 10)),
                new Order(10003, "book order", LocalDate.of(2023, 3, 11)),
                new Order(10004, "book order", LocalDate.of(2023, 1, 23))
        };
    }

    @GetMapping("/all")
    public List<Order> getAllOrder() {
        return Stream.of(order).collect(Collectors.toList());
    }

    @GetMapping("/search/{id}")
    public Order searchOrderById(@PathVariable("id") long id) {
        Stream<Order> orderStream = Stream.of(order).filter(a -> a.getId() == id);
        // if(orderStream.findFirst().isEmpty())
        //   return  null;
        Optional<Order> first = orderStream.findFirst();
        if (first.isPresent())
            return first.get();
        return null;
    }
}

 */