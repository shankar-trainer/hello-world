package com.example.dao;

import com.example.model.Product;

import java.util.List;

public interface Productdao {
    public Product addProduct(Product p);
    public Product removeProduct(int id);
    public Product searchProduct(int id);
    public Product updateProduct(Product product);
    public List<Product> getAllProduct();


}
