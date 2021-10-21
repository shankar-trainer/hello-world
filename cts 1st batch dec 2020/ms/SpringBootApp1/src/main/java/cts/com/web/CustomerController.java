package cts.com.web;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cts.com.dao.CustomerDao;
import cts.com.exception.CustomerException;
import cts.com.model.Customer;
import cts.com.service.CustomerService;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	/*
	 * @Autowired CustomerDao customerDao;
	 * 
	 * @RequestMapping("/allCust") public List<Customer> showAllCustomr() { return
	 * customerDao.getAllCustomr(); }
	 * 
	 * @PostMapping("/addCust") public boolean addCustomer(@RequestBody Customer
	 * customer) { return customerDao.addCustomr(customer); }
	 */

	@Autowired
	CustomerService service;

	@RequestMapping("/allCust")
	public List<Customer> showAll() throws CustomerException {
		return service.showAllCustomer();
	}

	@ExceptionHandler(CustomerException.class)
	//@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "id not present..... ")
	@RequestMapping("/search/{id}")
	// public Customer search(@PathVariable("id") Integer id ) throws
	// CustomerException {
	public ResponseEntity<Customer> search(@PathVariable("id") Integer id) throws CustomerException {

		Customer c = new Customer();
		c.setId(id);
		// return service.findCustomr(c);

		return new ResponseEntity<Customer>(service.findCustomr(c), HttpStatus.FOUND);

	}

	@PostMapping("/addCust")
	public boolean add(@RequestBody Customer customer) throws CustomerException {
		return service.saveCustomr(customer);
	}

}
