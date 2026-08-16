package com.coforge.web;

import com.coforge.model.Product;
import com.coforge.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/product")
    public Product addProduct(@RequestBody  Product p){
        return  productRepository.save(p);
    }

    @GetMapping("/product")
    public List<Product> getAllProduct(){
        return  productRepository.findAll();
    }
    @GetMapping("/product/{id}")
    public Product searchProductById(@PathVariable int id){
        return  productRepository.findById(id).get();
    }

}
