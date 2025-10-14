package com.example.web;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProduct() {
        return productService.getAllProduct1();
    }


    //    @GetMapping("/page")
    @GetMapping
    public Page<Product> getProduct(Pageable page) {
        return productService.getAllProduct(page);
    }
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

//    @GetMapping("/hello")
//    public Page<Product> getAllUsers(
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "10") int size,
//            @RequestParam(defaultValue = "id") String sortBy) {
//        return productService.getPaginatedProduct(page, size, sortBy);
//    }
//
//    @GetMapping("/hello")
//    public Page<Product> getAllUsers(
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "10") int size,
//            @RequestParam(defaultValue = "id") Sort sortBy,
//            @RequestParam(defaultValue = "asc") String sortDirection
//    ) {
//        return productService.getPaginatedProduct(page, size, sortBy, sortDirection);
//    }
}
//page=0&size=10&sortBy=name&sortDirection=asc
///api/products?page=1&size=5&sort=price,desc&sort=name,asc
//http://localhost:8080/products?page=0&size=11&sort=id,desc
//http://localhost:8080/products?page=0&size=5&sort=id,asc