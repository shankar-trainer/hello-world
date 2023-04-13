package com.example.dao;


import com.example.model.Product;
import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

@Data
@Repository
public class ProductDao {
              // dao layer used with @Resource it do all data operation
    Set<Product> productSet;

    public ProductDao() {
        productSet=new HashSet<Product>();
    }

    public boolean addProduct(Product p) {
        if (searchProduct(p) == null) {
            productSet.add(p);
            return true;
        }
        return false;

    }
    public boolean removeProduct(Product p) {
        if (searchProduct(p) != null) {
            productSet.remove(p);
            return true;
        }
        return false;
    }

    public Set<Product> getAllProduct() {
        return productSet;
    }

    public Product searchProduct(Product p) {
        if (productSet.contains(p))
            return p;
        return null;
    }
}
/*
     | model
    Dao  --- Client     Dao  -- database  operation
     |
    Service -- client    Service -- uses dao and gives service to the client- it can handle the error




 */