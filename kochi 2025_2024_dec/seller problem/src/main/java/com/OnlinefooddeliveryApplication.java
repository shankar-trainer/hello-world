package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bean.Car;
import com.bean.Seller;
import com.dao.SellerDAO;

@SpringBootApplication
public class OnlinefooddeliveryApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(OnlinefooddeliveryApplication.class, args);
    }

    @Autowired
    SellerDAO dao;

    @Override
    public void run(String... args) throws Exception {
        Seller seller = new Seller();
        seller.setSellerId("1");
        seller.setSellerName("name1");
        seller.setSellerContactNumber("87787878");

        Car car = new Car();
        car.setRegNumber("11");
        car.setCarRegistrationDate("date1");
        car.setCarModel("model1");
        car.setCarName("name1");
        car.setCarPrice(655665);

        car.setCarManufacturer("mfd");
        car.setCarRegistrationDate("date1");

        Car car1 = new Car();
        car1.setRegNumber("22");

        car1.setCarRegistrationDate("date1");
        car1.setCarModel("model1");
        car1.setCarName("name1");
        car1.setCarPrice(655665);

        car1.setCarManufacturer("mfd");

        car1.setCarRegistrationDate("date1");

        ArrayList<Car> list1 = new ArrayList<>();
        list1.add(car1);
        list1.add(car);

        System.out.println("1st seller size " + list1.size());
        seller.setCarList(list1);
        dao.addSeller(seller);

        // 2nd seller

        Seller seller1 = new Seller();
        seller1.setSellerId("2");
        seller1.setSellerName("name1");
        seller1.setSellerContactNumber("87787878");

        car = new Car();
        car.setRegNumber("33");
        car.setCarRegistrationDate("date1");
        car.setCarModel("model1");
        car.setCarName("name1");
        car.setCarPrice(655665);

        car.setCarManufacturer("mfd");
        car.setCarRegistrationDate("date1");

        car1 = new Car();
        car1.setRegNumber("44");

        car1.setCarRegistrationDate("date1");
        car1.setCarModel("model1");
        car1.setCarName("name1");
        car1.setCarPrice(655665);

        car1.setCarManufacturer("mfd");

        car1.setCarRegistrationDate("date1");

     Car     car2 = new Car();
        car2.setRegNumber("55");

        car2.setCarRegistrationDate("date1");
        car2.setCarModel("model1");
        car2.setCarName("name1");
        car2.setCarPrice(655665);

        car2.setCarManufacturer("mfd");
        car2.setCarRegistrationDate("date1");

        ArrayList<Car> list2 = new ArrayList<>();
        System.out.println("... 1st seller size " + list1.size());

        list2.add(car1);
        list2.add(car);
        list2.add(car2);

        seller1.setCarList(list2);

        System.out.println("2nd seller size " + list2.size());

        dao.addSeller(seller);
        dao.addSeller(seller);
        //dao.addSeller(seller1);

        //dao.addSeller(seller1);
        //dao.addSeller(seller1);
        dao.addSeller(seller1);

        System.out.println("first seller car sold  " + seller.getCarList().size());
        System.out.println("second seller car sold  " + seller1.getCarList().size());

        System.out.println("final result ...");
        dao.sellerWithMaximumSalesCount().forEach(System.out::println);
        //System.out.println(dao.sellerWithMaximumSalesCount().size());

    }
}
