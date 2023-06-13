package com.example.service;

import com.example.dao.OrderRepository;
import com.example.dao.ProductRepository;
import com.example.exception.ProductException;
import com.example.model.Order;
import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    @Autowired
    OrderRepository repository1;

    public Product addProduct(Product p) throws ProductException {
        Product product = searchProduct1(p.getProductId());
        if (product != null)
            throw new ProductException("product already present");
        else {
            for(Order o:p.getOrderSet())
             repository1.save(o);

            return repository.save(p);
        }
    }

    public Product updateProduct(Product p) throws ProductException {
        Product product = searchProduct1(p.getProductId());
        if (product == null)
            throw new ProductException("product not present");
        else
            return repository.save(p);
    }

    public Product searchProduct(int id) throws ProductException {
        Optional<Product> byId = repository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            throw new ProductException("product not found");
    }

    public Product searchProduct1(int id) throws ProductException {
        Optional<Product> byId = repository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            return null;
    }

    public Product deleteProduct(int id) throws ProductException {
        Product product = searchProduct1(id);
        if (product == null)
            throw new ProductException("product not  present");
        else {
            for(Order o:product.getOrderSet())
                repository1.delete(o);
            repository.delete(product);
            return product;
        }
    }

    public List<Product> getAllProduct() throws ProductException {
        if (repository.findAll().size() == 0)
            throw new ProductException("product list is empty");
        else {
            return repository.findAll();
        }
    }
}
