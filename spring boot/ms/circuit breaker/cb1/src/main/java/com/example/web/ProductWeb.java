package com.example.web;

import com.example.dto.ProductDTO;
import com.example.service.ProductOrderService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productorder")
public class ProductWeb {
@Autowired
private ProductOrderService1 productOrderService1;
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable  int id) {
     return  new ResponseEntity(productOrderService1.getProductById(id), HttpStatus.OK);
    }
}
