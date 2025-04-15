package com.ukg.web;

import com.ukg.exception.CustomerException;
import com.ukg.model.Customer;
import com.ukg.model.Product;
import com.ukg.repository.CustomerRepository;
import com.ukg.repository.ProductRepository;
import com.ukg.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;
    //-------------------------
    @Autowired
    private CustomerRepository repository;

    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/all1")
    public List<Customer> getAllCustomer1() {
        System.out.println(repository.findAll());
        return repository.findAll();
    }
//----------------

    @RequestMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        try {
            return new ResponseEntity<List<Customer>>(service.getAllCustomer(), HttpStatus.FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    //@RequestMapping(value = "/add", method = RequestMethod.POST)
    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        try {
            for (Product p : customer.getProductSet())
                p.setCustomer(customer);
            return new ResponseEntity<Customer>(service.addCustomer(customer), HttpStatus.CREATED);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping("/update")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
     /*   Optional<Customer> byId = repository.findById(customer.getId());
         if(byId.isPresent()){
             repository.updateCustomer(customer.getName(),customer.getSsn(),customer.getId());
             return  repository.findById(customer.getId()).get();
         }
        return null;*/

        try {
            for (Product p : customer.getProductSet())
                p.setCustomer(customer);

            return new ResponseEntity<>(service.updateCustomer(customer), HttpStatus.FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<>(service.findCustomerById(id), HttpStatus.FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
//http://localhost:9090/get/1

    @GetMapping("/getbyname/")
    public ResponseEntity<Customer> findCustomerByName(@RequestParam("name") String name) {
        try {
            return new ResponseEntity<Customer>(service.findCustomerByName(name), HttpStatus.FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
//http://localhost:9090/getbyname/?name=amit kumar

    @GetMapping("/getbynameandssn/")
    public ResponseEntity<Customer> findCustomerByNameAndSsn(@RequestParam("name") String name, @RequestParam("ssn") String ssn) {
        try {
            return new ResponseEntity<Customer>(service.findCustomerByNameAndSsn(name, ssn), HttpStatus.NOT_FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    // http://localhost:9090/getbynameandssn/?name=amit kumar&ssn=abc344343

    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Customer> deleteCustomerById(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<Customer>(service.deleteCustomerById(id), HttpStatus.FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @Autowired
    ProductRepository productRepository1;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product p) {
        Customer c=p.getCustomer();
            //c.setProductSet();

        return productRepository1.save(p);
    }
}

/*
http://localhost:9090/add
{
    "name":"anand kumar",
    "ssn":"65566bnnbbn",
    "productSet":[
        {
            "pname":"pant",
            "cost":1200
        },
        {
            "pname":"shirt",
            "cost":800
        },
        {
            "pname":"pizza",
            "cost":200
        }
    ]
}
//http://localhost:9090/update

    {
        "id": 1,
        "name": "raman kumar",
        "ssn": "65566xxxx",
        "productSet": [
            {
                "id": 3,
                "pname": "pizza1",
                "cost": 2001.0
            },
            {
                "id": 1,
                "pname": "pant1",
                "cost": 12001.0
            },
            {
                "id": 2,
                "pname": "shirt1",
                "cost": 8001.0
            }
        ]
    }


http://localhost:9090/addProduct
{
            "pname":"pant",
            "cost":1200,
      "customer":{
      "name":"anand kumar",
      "ssn":"65566bnnbbn"
     }
}
http://localhost:9090/addProduct
{
            "pname":"pant",
            "cost":1200,
      "customer":{
      "name":"anand kumar",
      "ssn":"65566bnnbbn"
     }
}

*/