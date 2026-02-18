//package com.example.service;
//
//import com.example.exception.ProductOrderException;
//import com.example.model.Product;
//import com.example.model.ProductOrder;
//import com.example.repository.ProductOrderRepository;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestClientException;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//@Service
//public class ProductOrderService {
//
//    private ProductOrderRepository orderRepository;
//    RestTemplate restTemplate;
//
//    public ProductOrderService(ProductOrderRepository orderRepository, RestTemplate restTemplate) {
//        this.orderRepository = orderRepository;
//        this.restTemplate = restTemplate;
//    }
//
//    public ResponseEntity<ProductOrder> addProductOrder(ProductOrder order) {
//        try {
////            ResponseEntity<Product> forEntity = restTemplate.getForEntity("http://localhost:9090/product/" + order.getPrdId(), Product.class);
//            ResponseEntity<Product> forEntity = restTemplate.getForEntity("http://PRODUCT-APPLICATION/product/" + order.getPrdId(), Product.class);
//            System.out.println(forEntity.getStatusCode() + " is status code");
//
//            if (forEntity.getStatusCode().is2xxSuccessful()) {
//                return new ResponseEntity<>(orderRepository.save(order), HttpStatus.CREATED);
//            } else
//                throw new ProductOrderException("product id not present");
//        } catch (RestClientException e) {
//            return  new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
//        }
//    }
//
//    public List<ProductOrder> getAllProduct() {
//        if (orderRepository.findAll().isEmpty())
//            throw new ProductOrderException("product order list is empty");
//        return orderRepository.findAll();
//    }
//}
