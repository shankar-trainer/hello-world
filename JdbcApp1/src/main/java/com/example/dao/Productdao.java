package com.example.dao;

import com.example.model.Product;

import java.util.List;

public interface Productdao {
    public Product addProduct(Product p);
    public List<Product> getAllProduct();

}
