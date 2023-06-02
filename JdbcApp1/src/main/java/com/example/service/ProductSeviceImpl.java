package com.example.service;

import com.example.dao.Productdao;
import com.example.exception.ProductException;
import com.example.model.Product;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
@Data
public class ProductSeviceImpl implements ProductService {

    //@Autowired
    Productdao dao;

    @Override
    public Product addProduct(Product p) throws ProductException {
        if (dao.searchProduct(p.getId()) == null) {
            return dao.addProduct(p);
        } else
            throw new ProductException("product already present with given id " + p.getId());

    }

    @Override
    public Product removeProduct(int id) throws ProductException {
        if (dao.searchProduct(id) != null)
            return dao.removeProduct(id);
         else
            throw new ProductException("product not present with given id " + id);

    }

    @Override
    public Product searchProduct(int id) throws ProductException {
        if(dao.searchProduct(id)!=null)
            return dao.searchProduct(id);
        else
            throw new ProductException("product id  not present " );
    }

    @Override
    public Product updateProduct(Product product) throws ProductException {
        Product product1 = dao.updateProduct(product);
        if(product1!=null)
            return  product1;
        else
            throw new ProductException("product not present " );
    }

    @Override
    public List<Product> getAllProduct() throws ProductException {
        if(dao.getAllProduct().size()==0)
            throw new ProductException("product list is empty ");
        else
        return dao.getAllProduct();
    }
}
