package com.example.service;

import com.example.dao.ProductRepository;
import com.example.model.Product;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }



    public Product addProduct(@RequestBody Product product) {
    return  productRepository.save(product);
    }

    @Transactional

    //public List<Product> addProductAll(List<Product> product) {
    public  void  addProductAll(List<Product> product) {
         productRepository.saveAll(product);
         productRepository.flush();
//         productRepository.saveAllAndFlush(product);


    }

    public List<Product> getAllProduct1(){
        return  productRepository.findAll();
    }

    public Page<Product> getAllProduct(Pageable pageable){
        return  productRepository.findAll(pageable);
    }
///
//    public Page<Product> getPaginatedProduct(int page, int size, Sort sortBy, String sortDirection) {
//        Pageable pageable = PageRequest.of(page, size, sortBy);
//        return productRepository.findAll(pageable);
//    }

}

