package com.example.main;

import com.example.service.ProductService;
import com.example.dao.ProductDao;
import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shankar on 4/13/2023.
 */
public class ProductMain1 {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ProductService.class);
        ProductService service = ctx.getBean(ProductService.class);

        System.out.println("service add operation");
        service.saveProduct(new Product(677676,"pizza",500));
        service.saveProduct(new Product(677677,"biryani",700));
        service.saveProduct(new Product(677678,"burger",200));
        service.saveProduct(new Product(677679,"chicken tikka",300));

        System.out.println("service find all operation");
        for(Product p: service.findAllProduct())
            System.out.println(p);


   }
}
