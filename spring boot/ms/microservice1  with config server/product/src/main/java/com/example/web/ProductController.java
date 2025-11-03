package com.example.web;

import com.example.exception.ProductException;
import com.example.service.ProductService;
import com.netflix.discovery.converters.Auto;
import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {

        try {
            return new ResponseEntity<>(productService.addProduct(product), HttpStatus.OK);
        } catch (ProductException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }


    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int productId) {
        try {
            return new ResponseEntity<>(productService.getProductById(productId), HttpStatus.OK);
        } catch (ProductException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        try {
            return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
        } catch (ProductException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
