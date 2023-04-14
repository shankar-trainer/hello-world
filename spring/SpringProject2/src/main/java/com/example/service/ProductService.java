package com.example.service;

import com.example.dao.ProductDao;
import com.example.exception.ProductException;
import com.example.model.Product;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by shankar on 4/13/2023.
 */

@Service
@Data
@ComponentScan("com.example.dao")
public class ProductService {

    @Autowired
    ProductDao productDao;

    public boolean saveProduct(Product p) throws ProductException {
        if (productDao.searchProduct(p) == null) {
            productDao.addProduct(p);
            System.out.println("Product added");
            return true;
        } else
            //System.out.println("Product already present");
            throw new ProductException("Product already present");
    }

    public Set<Product> findAllProduct() throws ProductException {
        if (productDao.getAllProduct().isEmpty())
            //System.out.println("no product available");
            throw new ProductException("no product available");
            else
            return productDao.getAllProduct();
    }

    public boolean deleteProduct(Product p) throws ProductException {
        if(productDao.removeProduct(p))
            return true;
        else
            throw new ProductException("no product available");

     }
    public Product findProduct(Product p) throws ProductException {
        Product product = productDao.searchProduct(p);
        if(product!=null)
            return product;
        else
            throw new ProductException("product not found ");

     }
    }
