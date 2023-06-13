package com.example;

import com.example.dao.ProductRepository;
import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ProductMain //implements CommandLineRunner
        //
        {
    public static void main(String[] args) {
        SpringApplication.run(ProductMain.class, args);
    }


}
