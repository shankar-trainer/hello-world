package com.example.service;

import com.example.exception.ProductOrderException;
import com.example.feign.ProductFeign;
import com.example.model.Product;
import com.example.model.ProductOrder;
import com.example.repository.ProductOrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class ProductOrderService1 {
    @Autowired
    private ProductOrderRepository orderRepository;
     @Autowired
    ProductFeign productFeign;

    public ResponseEntity<ProductOrder> addProductOrder(ProductOrder order) {
        try {
      log.info(order+" is order details");
      log.info(order.getPrdId()+" is order details");
            ResponseEntity<Product> productResponseEntity = productFeign.searchById(order.getPrdId());

            if (productResponseEntity.getStatusCode().is2xxSuccessful()) {
                return new ResponseEntity<>(orderRepository.save(order), HttpStatus.CREATED);
            } else
                throw new ProductOrderException("product id not present");
        } catch (RestClientException e) {
            return  new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    public List<ProductOrder> getAllProduct() {
        if (orderRepository.findAll().isEmpty())
            throw new ProductOrderException("product order list is empty");
        return orderRepository.findAll();
    }
}
