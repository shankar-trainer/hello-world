package com.example.web;

import com.example.exception.ProductOrderException;
import com.example.model.ProductOrder;
//import com.example.service.ProductOrderService;
import com.example.service.ProductOrderService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productorder")
public class ProductOrderController {

    @Autowired
//    ProductOrderService productOrderService;
    ProductOrderService1 productOrderService;

    @PostMapping
    public ResponseEntity<ProductOrder> addProduct(@RequestBody ProductOrder productOrder) {
        try {
            return new ResponseEntity(
                    productOrderService.addProduct(productOrder)
                    , HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductOrder> getProductById(@PathVariable int id) {
        try {
            return new ResponseEntity(
                    productOrderService.getProductById(id)
                    , HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<ProductOrder>>  getAllProduct() {
        try {
            return new ResponseEntity(
                    productOrderService.getAllProducts()
                    , HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}
