package com.example.feign;

import com.example.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "PRODUCT-APPLICATION")
public interface ProductFeign {

    @PostMapping("/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) ;

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProduct();

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> searchById(@PathVariable int id);
}
