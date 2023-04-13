package com.example.main;

import com.example.config.JavaConfig;
import com.example.dao.ProductDao;
import com.example.model.Product;
import com.example.model.Share;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

/**
 * Created by shankar on 4/13/2023.
 */
public class ProductMain {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ProductDao.class);
        ProductDao dao = ctx.getBean(ProductDao.class);

        System.out.println("dao add operation");
        dao.addProduct(new Product(677676,"pizza",500));
        dao.addProduct(new Product(677677,"biryani",700));
        dao.addProduct(new Product(677678,"burger",200));
        dao.addProduct(new Product(677679,"chicken tikka",300));

        System.out.println("dao get all operation");
        for(Product p:dao.getAllProduct())
            System.out.println(p.getProductId()+"\t"+p.getProductName()+"\t"+p.getProductCost());
        System.out.println("dao search operation");

        //Product product = dao.searchProduct(new Product(677678, "burger", 200));
        Product product = dao.searchProduct(new Product(677679, "burger", 200));
       if(product==null)
           System.out.println("product not present ");
       else
           System.out.println("product present "+product);

        System.out.println("remove operation");

        if(dao.removeProduct(new Product(677678, "burger", 200)))
            System.out.println("product removed");
        else
            System.out.println("product not present");

        System.out.println("after product removed all products are \n");
        for(Product p:dao.getAllProduct())
            System.out.println(p);
    }
}
