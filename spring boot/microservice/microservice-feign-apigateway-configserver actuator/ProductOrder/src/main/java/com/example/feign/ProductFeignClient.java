package com.example.feign;

import com.example.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-application")
public interface ProductFeignClient {

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> searchById(@PathVariable int id);

}
