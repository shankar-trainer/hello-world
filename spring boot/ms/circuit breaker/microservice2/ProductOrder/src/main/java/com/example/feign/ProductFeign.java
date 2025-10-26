package com.example.feign;

import com.example.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

//@FeignClient(value = "product" , url = "http://localhost:8080/product")
@FeignClient(name = "PRODUCT",url = "http://localhost:8080/product")
// @FeignClient(name = "PRODUCT")
public interface  ProductFeign {

    @PostMapping
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO product);

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") int productId);

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts();
}
