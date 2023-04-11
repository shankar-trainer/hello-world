package com.nec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nec.dao.FeedbackRepository;
import com.nec.dao.OrderRepository;
import com.nec.dao.ProductRepository;
import com.nec.model.Order;
import com.nec.model.Product;
import com.nec.model.ProductFeedback;

@RestController
public class ProductOrderController {

	@Autowired
	ProductRepository prdDao;

	@Autowired
	OrderRepository orderDao;

	@Autowired
	FeedbackRepository feedbackDao;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product prd) {
		orderDao.save(prd.getOrder());
		for (ProductFeedback f : prd.getProductFeedBackSet())
			feedbackDao.save(f);
	
		return prdDao.save(prd);
	}

	
	@GetMapping("/getAllPrd")
	public List<Product> getAll() {
		return prdDao.findAll();
	}

	@GetMapping("/getAllOrder")
	public List<Order> getAllOrder() {
		return orderDao.findAll();
	}

}
