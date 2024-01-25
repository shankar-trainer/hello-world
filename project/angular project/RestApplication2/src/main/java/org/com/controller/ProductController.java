package org.com.controller;

import java.util.List;
import java.util.Optional;
//import javax.validation.Valid;

import org.com.dao.ProductRepository;
import org.com.error.RecordNotFoundException;
import org.com.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prd")
@CrossOrigin("http://localhost:4200")

public class ProductController {

    @Autowired
    ProductRepository dao;

    // @RequestMapping("/allProduct")
    @GetMapping("/allProduct")

    public List<Product> getAllProduct() {
        return dao.findAll();
    }

    @RequestMapping("/searchProduct1/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<?> findProduct1(@PathVariable("id") int pid) {

        Optional<Product> findById = dao.findById(pid);
        try {
            if (findById.isPresent()) {
                Product product = findById.get();
                return new ResponseEntity<Product>(product, HttpStatus.OK);
            } else {
                throw new RecordNotFoundException("Record not found");
            }
        } catch (RecordNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping("/searchProduct/{id}")
    public Product findProduct(@PathVariable("id") int pid) {

        Optional<Product> findById = dao.findById(pid);
        if (findById.isPresent()) {
            return findById.get();
        }

        return null;
    }

    /*@PostMapping("/employees")
     public Employee createEmployee(@Valid @RequestBody Employee employee) {
     return employeeRepository.save(employee);
     }
     */
    @PostMapping("/saveProduct")
     public Product createProduct(@RequestBody Product employee) {
     return dao.save(employee);
     }
    
    @PostMapping("/addProduct")
           // @PostMapping(value = "/addProduct",produces = {MediaType.APPLICATION_JSON_VALUE})
    //    @ResponseBody
    public ResponseEntity<Product> saveProduct(@RequestBody Product prd) {

        Optional<Product> findById = dao.findById(prd.getPrdId());
        try {
            if (!findById.isPresent()) {
                dao.save(prd);
                return new ResponseEntity<Product>(prd, HttpStatus.OK);
            } else {
                throw new RecordNotFoundException("Record already present");
            }
        } catch (RecordNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<Product> updateProduct(@RequestBody Product prd) {

        Optional<Product> findById = dao.findById(prd.getPrdId());
        try {
            if (findById.isPresent()) {
                dao.save(prd);
                return new ResponseEntity<Product>(prd, HttpStatus.OK);
            } else {
                throw new RecordNotFoundException("Record not present");
            }
        } catch (RecordNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
 
    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("id") int id) {

        Optional<Product> findById = dao.findById(id);
        try {
           
            if (findById.isPresent()) {
                Product p=dao.findById(id).get();
                dao.deleteById(id);
                return new ResponseEntity<Product>(p, HttpStatus.OK);
            } else {
                throw new RecordNotFoundException("Record not present");
            }
        } catch (RecordNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
