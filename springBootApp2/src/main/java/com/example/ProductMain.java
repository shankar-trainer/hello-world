package com.example;

import com.example.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProductMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext bean = SpringApplication.run(ProductMain.class, args);
        Product bean1 = bean.getBean(Product.class);
        System.out.println(bean1.getPrdId()+"\t"+bean1.getPrdName()+"\t"+bean1.getPrdCost());
    }
}
