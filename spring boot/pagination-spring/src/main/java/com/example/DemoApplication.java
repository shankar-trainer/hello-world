package com.example;

import com.example.dao.ProductRepository;
import com.example.model.Product;
import com.example.service.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    ProductRepository productRepository;

    @Autowired
    private ProductService productService;

//@Transactional
    @Override
    public void run(String... args) throws Exception {

        var list1 = Arrays.asList(
                new Product[]{
                        Product.builder().name("biscuit").price(40).build(),
                        Product.builder().name("biscuit").price(41).build(),
                        Product.builder().name("biscuit").price(42).build(),
                        Product.builder().name("applet").price(43).build(),
                        Product.builder().name("biscuit").price(44).build(),
                        Product.builder().name("biscuit").price(45).build(),
                        Product.builder().name("jackfruit").price(46).build(),
                        Product.builder().name("biscuit").price(47).build(),
                        Product.builder().name("mobile").price(48).build(),
                        Product.builder().name("ball").price(49).build(),
                        Product.builder().name("xmas tree").price(50).build(),
                        Product.builder().name("biscuit").price(51).build(),
//                                Product.builder().name("biscuit").price(30).build(),
//                                Product.builder().name("biscuit").price(31).build(),
//                                Product.builder().name("biscuit").price(32).build(),
//                                Product.builder().name("biscuit").price(33).build(),
//                                Product.builder().name("biscuit").price(34).build(),
//                                Product.builder().name("biscuit").price(35).build(),
//                                Product.builder().name("biscuit").price(36).build(),
//                                Product.builder().name("biscuit").price(37).build(),
//                                Product.builder().name("biscuit").price(38).build(),
//                                Product.builder().name("biscuit").price(39).build(),
//                                Product.builder().name("biscuit").price(51).build(),
//                                Product.builder().name("biscuit").price(52).build(),
//                                Product.builder().name("biscuit").price(10).build(),
//                                Product.builder().name("biscuit").price(9).build(),
//                                Product.builder().name("biscuit").price(8).build(),
//                                Product.builder().name("biscuit").price(7).build(),
//                                Product.builder().name("biscuit").price(6).build(),
//                                Product.builder().name("biscuit").price(5).build(),
//                                Product.builder().name("biscuit").price(4).build(),
//                                Product.builder().name("biscuit").price(3).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
//                                Product.builder().name("biscuit").price(40).build(),
                }
        );

//        productRepository.saveAll(list1);
//        productRepository.saveAll(list1);
//        productRepository.saveAll(list1);

        productService.addProductAll(list1);
        productService.addProductAll(list1);
        productService.addProductAll(list1);

        //productService.ad
        System.out.println(productRepository.findAll().size()+ " size of list1");
//
//        // for batch operation
//        for (int i = 0; i < 10; i++) {
//            productRepository.saveAll(list1);
//            System.out.println("added");
//        }

        System.out.println(productRepository.findAll().size() + " after batch size");
        productRepository.findAll().size();
        //productRepository.findAll().forEach(a -> System.out.println(a));
//        Pageable pageable = PageRequest.of(0, 2, Sort.by("name").ascending());
        Pageable pageable = PageRequest.of(1, 10);

        System.out.println("using pagination ");
        // Call the repository method with Pageable
        Page<Product> myEntitiesPage = productService.getAllProduct(pageable);

        myEntitiesPage.getContent().forEach(System.out::println);


//        pageable = PageRequest.of(0, 2, Sort.by("name").ascending());

//        Page<Product> page = productService.getPaginatedProduct(0, 2, Sort.by("name").ascending());
       // Page<Product> page = productService.getPaginatedProduct(0, 2, Sort.by("name").ascending(),"asc");
        //page.getContent().forEach(System.out::println);

    }
}
//http://localhost:8080/products?page=1&size=10
//http://localhost:8080/products?page=2&size=10
//http://localhost:8080/products?page=3&size=10
