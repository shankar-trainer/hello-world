package com.example.web;

import com.example.exception.ProductOrderException;
import com.example.model.ProductOrder;
import com.example.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productorder")
public class ProductOrderController {

    @Autowired
    ProductOrderService productOrderService;

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

}
