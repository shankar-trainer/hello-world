package com.example;

import com.example.dao.ProductDaoImpl;
import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.Scanner;

@SpringBootApplication
public class ProductMain {
    public static void main(String[] args) {
        SpringApplication.run(ProductMain.class, args);

        ProductDaoImpl dao = getProductdao();

        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter product id name and cost");
        product.setId(scanner.nextInt());
        product.setName(scanner.next());
        product.setCost(scanner.nextFloat());

        Product product1 = dao.addProduct(product);
        System.out.println("product added is \n");
        System.out.println("\t" + product1.getId() + "\t" + product1.getName() + "\t" + product1.getCost());

    }

    @Bean
    public static ProductDaoImpl getProductdao() {
        ProductDaoImpl productDao = new ProductDaoImpl();
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getds());
        productDao.setJdbcTemplate(jdbcTemplate);
        return productDao;
    }

    @Bean
    public static DriverManagerDataSource getds() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setUrl("jdbc:mysql://localhost:3306/database1");
        return dataSource;
    }

}
