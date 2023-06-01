package com.example.dao;

import com.example.model.Product;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
@Data
public class ProductDaoImpl implements  Productdao {

    JdbcTemplate jdbcTemplate;


    @Override
    public Product addProduct(Product p) {
        int update = jdbcTemplate.update("insert into product values(" + p.getId() + ",'" + p.getName() + "'," + p.getCost() + ")");
        if(update==1)
        return p;
        return null;
    }

    @Override
    public List<Product> getAllProduct() {

        return null;

    }
}
