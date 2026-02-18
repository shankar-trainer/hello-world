package com.example.web;

import com.example.exception.ProductOrderException;
import com.example.model.ProductOrder;
import com.example.service.ProductOrderService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductOrderController1 {

//    private ProductOrderService productOrderService;
    @Autowired
    private ProductOrderService1 productOrderService;

//    public ProductOrderController(ProductOrderService productOrderService) {
//        this.productOrderService = productOrderService;
//    }

    @PostMapping("/productorder")
    public ResponseEntity<ProductOrder> addProductOrder(@RequestBody  ProductOrder order) {
        try {
            System.out.println("controller product order "+order);
            return new ResponseEntity(productOrderService.addProductOrder(order), HttpStatus.CREATED);

        } catch (ProductOrderException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/productorder")
    public ResponseEntity<List<ProductOrder>> getAllProduct() {
        try {
            return new ResponseEntity<>(productOrderService.getAllProduct(), HttpStatus.FOUND);
        } catch (ProductOrderException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
