package com.coforge;

import com.coforge.dao.ProductDao;
import com.coforge.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class ProductMain1 implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProductMain1.class, args);
    }

    @Autowired
    ProductDao dao;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("add product operation");
        Product product = new Product();
        product.setName("shirt");
        product.setCost(1600);
        dao.save(product);

        System.out.println("all products are \n");
        dao.findAll().forEach(a-> System.out.println(a));

        System.out.println("search product ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter product id ");
        int id=scanner.nextInt();

        Optional<Product> byId = dao.findById(id);
        if(byId.isPresent())
            System.out.println("found with id "+id+"\n is "+byId.get());
        else
            System.out.println("not found with this id "+id);

        System.out.println("delete product operation");
        System.out.println("enter product id ");
        id=scanner.nextInt();

        Optional<Product> byId = dao.findById(id);
        if(byId.isPresent()) {
            dao.deleteById(id);
            System.out.println("product with id "+id+" is deleted");
        }
        else
            System.out.println("product not foudn with id "+id);
    }
}
