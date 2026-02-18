package com.example.web;

import com.example.exception.ProductOrderException;
import com.example.model.ProductOrder;
import com.example.service.ProductOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductOrderController {

    private ProductOrderService productOrderService;

    public ProductOrderController(ProductOrderService productOrderService) {
        this.productOrderService = productOrderService;
    }

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
