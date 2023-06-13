package com.example.web;

import ch.qos.logback.core.status.Status;
import com.example.dao.ProductRepository;
import com.example.exception.ProductException;
import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/allProduct")
    public ResponseEntity getAllProduct() throws ProductException {
        try {
            return  new ResponseEntity(service.getAllProduct(),HttpStatus.OK);
        }
        catch (ProductException e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addProduct")
    public ResponseEntity addProduct(@RequestBody Product p)  {
        try {

            return  new ResponseEntity<>(service.addProduct(p), HttpStatus.CREATED);
        }
        catch (ProductException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/searchProduct/{id}")
    public ResponseEntity searchProduct(@PathVariable  int id) throws ProductException {
       try {
           return new ResponseEntity<>(service.searchProduct(id),HttpStatus.FOUND);
       }
       catch (ProductException e){
           return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
       }
    }

    @DeleteMapping("/searchProduct{id}")
    public ResponseEntity deleteProduct(@PathVariable int id) throws ProductException {
       try {
           return new ResponseEntity<>(service.deleteProduct(id),HttpStatus.OK);
       }
       catch (ProductException e){
           return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
       }
    }

}
