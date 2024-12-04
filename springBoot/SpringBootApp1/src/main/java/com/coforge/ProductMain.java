package com.coforge;

import com.coforge.dao.ProductDao;
import com.coforge.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class ProductMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ProductMain.class, args);

        ProductDao dao = ctx.getBean(ProductDao.class);

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


    }

}
