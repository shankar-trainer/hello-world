package com.coforge.repository;

import com.coforge.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient( name =  "Product")
//@FeignClient(url = "http://localhost:9090")
public interface ProductClient {

    @GetMapping("/product")
    public List<Product> getAllProduct();
}
