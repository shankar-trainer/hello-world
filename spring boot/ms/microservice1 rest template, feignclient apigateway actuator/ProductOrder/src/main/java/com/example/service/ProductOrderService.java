//package com.example.service;
//
//import com.example.dto.ProductDTO;
//import com.example.exception.ProductOrderException;
//import com.example.model.ProductOrder;
//import com.example.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestClientException;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//public class ProductOrderService {
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Autowired
//    RestTemplate restTemplate;
//
//    public  ResponseEntity<ProductOrder> addProduct(ProductOrder productOrder) {
//
////        ResponseEntity<ProductDTO> forEntity = restTemplate.getForEntity("http://localhost:8080/product/" + productOrder.getProductId(), ProductDTO.class);
//
//        try {
//            ResponseEntity<ProductDTO> forEntity = restTemplate.getForEntity("http://PRODUCT/product/" + productOrder.getProductId(), ProductDTO.class);
//
//            if (forEntity.getStatusCode().is2xxSuccessful()) {
//                return new ResponseEntity<>(productRepository.save(productOrder), HttpStatus.OK);
//            } else
//                throw new ProductOrderException("product id not present in product table");
//        }
//        catch (RestClientException e){
//            return new ResponseEntity("product id not present in product table",HttpStatus.NOT_FOUND);
//        }
//        catch (Exception e){
//            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
//        }
//        }
//
//}
