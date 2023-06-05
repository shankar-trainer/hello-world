package com.example.dao;

import com.example.model.Product;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product p1 = new Product();
        p1.setId(rs.getInt(1));
        p1.setName(rs.getString(2));
        p1.setCost(rs.getFloat(3));

        return p1;
    }
}

@Repository
@Data
public class ProductDaoImpl implements Productdao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Product addProduct(Product p) {
        int update = jdbcTemplate.update("insert into product values(" + p.getId() + ",'" + p.getName() + "'," + p.getCost() + ")");
        if (update == 1)
            return p;
        return null;
    }

    @Override
    public Product removeProduct(int id) {
        Product product = searchProduct(id);
        if (product != null) {
            int update = jdbcTemplate.update("delete from product where id=" + id);
            return product;
        }
        return null;
    }

    @Override
    public Product searchProduct(int id) {
        try {
            return jdbcTemplate.queryForObject("select * from product where id=?", new Object[]{id}, new ProductRowMapper());
        } catch (EmptyResultDataAccessException e) {
            System.err.println(e);
        }
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        int update = jdbcTemplate.update("update product set pname='" + product.getName() + "',cost=" + product.getCost() + " where id=" + product.getId() + "  ");
        if (update == 1) {
            return searchProduct(product.getId());
        }
        return null;
    }

    Product prd;

    @Override
    public List<Product> getAllProduct() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from product");

        List<Product> plist = null;
        plist = new ArrayList<>();

        for (Map<String, Object> map : maps) {
            prd = null;
            prd = new Product();
            prd.setId(Integer.parseInt(map.get("id").toString()));
            prd.setName(map.get("pname").toString());
            prd.setCost(Float.parseFloat(map.get("cost").toString()));
            plist.add(prd);
        }

        return plist;

    }
}
