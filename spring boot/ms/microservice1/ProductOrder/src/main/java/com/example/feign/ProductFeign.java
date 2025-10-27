package com.example.feign;

import com.example.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

//@FeignClient(url = "http://localhost:8080/product/", value = "PRODUCT")
@FeignClient(name = "PRODUCT")
public interface ProductFeign {

    @PostMapping("/product")
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO product) ;

    @GetMapping("/product/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") int productId) ;

    @GetMapping("/product")
    public ResponseEntity<List<ProductDTO>> getAllProducts() ;
}
