package com.cts.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cts.dao.OrderRepository;
import com.cts.dao.ProductRepository;
import com.cts.model.Order;
import com.cts.model.Product;

@RestController
@RequestMapping("/order")
public class OneToManyController {

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	ProductRepository productRepository;

	@GetMapping("/allOrder")
	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}

	@GetMapping("/searchOrder/{id}")
	public Order searchOrder(@PathVariable("id") int id) {

		Optional<Order> findById = orderRepository.findById(id);

		if (findById.isPresent())
			return findById.get();
		return null;
	}

	@PostMapping("/addOrder")
	public Order addOrder(@RequestBody Order order) {

		Optional<Order> findById = orderRepository.findById(order.getOrderId());

		if (!findById.isPresent()) {
			for (Product p : order.getPrdSet()) {
                   productRepository.save(p);
			}
			return orderRepository.save(order);
		}
		return null;
	}

}
