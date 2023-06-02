package com.example;

import com.example.dao.ProductDaoImpl;
import com.example.exception.ProductException;
import com.example.model.Product;
import com.example.service.ProductService;
import com.example.service.ProductSeviceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.Scanner;

@SpringBootApplication
public class Productmain1 {
    public static void main(String[] args) {
        SpringApplication.run(Productmain1.class, args);

        Scanner scanner = new Scanner(System.in);

        ProductSeviceImpl service = getProductService();
        Product product;
        try {
            System.out.println("all products ");
            service.getAllProduct().forEach(a -> System.out.println(a.getId() + "\t" + a.getName() + "\t" + a.getCost()));
        } catch (ProductException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("========== add  product operation ==================== ");
            System.out.println("Enter product id name and cost ");
            product = null;
            product = new Product();
            product.setId(scanner.nextInt());
            product.setName(scanner.next());
            product.setCost(scanner.nextFloat());
            System.out.println("product added \n" + service.addProduct(product));
        } catch (ProductException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println("\n==========search product operation ============  \n");
            System.out.println("Enter product id  ");
            int id = scanner.nextInt();

            System.out.println("product found  \n" + service.searchProduct(id));
        } catch (ProductException e) {
            System.err.println(e.getMessage());
        }
        catch (EmptyResultDataAccessException e){
        }

        try {
            System.out.println("\n==========remove product operation =============\n  ");
            System.out.println("Enter product id  ");
            int id = scanner.nextInt();

            System.out.println("product found  \n" + service.removeProduct(id));
        } catch (ProductException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("\n==========update product operation =============\n  ");
            System.out.println("Enter product id name and cost ");
            product = null;
            product = new Product();
            product.setId(scanner.nextInt());
            product.setName(scanner.next());
            product.setCost(scanner.nextFloat());

            System.out.println("product updated  \n" + service.updateProduct(product));
        } catch (ProductException e) {
            System.err.println(e.getMessage());
        }


    }

    @Bean
    public static ProductSeviceImpl getProductService() {
        ProductSeviceImpl service = new ProductSeviceImpl();
        service.setDao(getProductdao());
        return service;
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
