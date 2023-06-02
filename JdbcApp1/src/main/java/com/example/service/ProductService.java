package com.example.service;

import com.example.exception.ProductException;
import com.example.model.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product p) throws ProductException;
    public Product removeProduct(int id) throws ProductException;
    public Product searchProduct(int id) throws ProductException;
    public Product updateProduct(Product product) throws ProductException;
    public List<Product> getAllProduct() throws ProductException;

}
