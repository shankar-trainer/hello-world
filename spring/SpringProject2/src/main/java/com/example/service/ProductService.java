package com.example.service;

import com.example.dao.ProductDao;
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

    public boolean saveProduct(Product p) {
      if(productDao.searchProduct(p)==null){
          productDao.addProduct(p);
          System.out.println("Product added");
          return true;
      }
      else
          System.out.println("Product already present");
     return false;
    }

    public Set<Product> findAllProduct() {
          if(productDao.getAllProduct().isEmpty())
              System.out.println("no product available");
          else
              return productDao.getAllProduct();
          return null;
    }

    }
