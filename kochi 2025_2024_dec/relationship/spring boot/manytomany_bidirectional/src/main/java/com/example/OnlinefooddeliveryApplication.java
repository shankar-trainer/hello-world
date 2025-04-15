package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Customer;
import com.example.model.Order;
import com.example.repository.CustomerRepository;
import com.example.repository.OrderRepository;

@SpringBootApplication
public class OnlinefooddeliveryApplication
{
    public static void main(String[] args) {
        SpringApplication.run(OnlinefooddeliveryApplication.class, args);
    }
}

//
//@SpringBootApplication
//public class OnlinefooddeliveryApplication implements CommandLineRunner {
//
//    public static void main(String[] args) {
//        SpringApplication.run(OnlinefooddeliveryApplication.class, args);
//    }
//
//    @Autowired
//    CustomerRepository repository;
//    @Autowired
//    OrderRepository repository1;
//
// //   @Transactional
//    @Override
//    public void run(String... args) throws Exception {
//
//        Customer customer = new Customer();
//        customer.setAddress("address1");
//        customer.setEmail("email");
//        customer.setName("suresh");
//        customer.setPhone("phone");
//
//        Order o1=new Order();
//        Order o2=new Order();
//        o1.setStatus("status");
//        o1.setTotalAmount(10000);
//        //o1.setMenuItems(null);
//        o1.setCustomer(customer);
//
//        o2.setStatus("status");
//        o2.setTotalAmount(10000);
//        //o2.setMenuItems(null);
//        o2.setCustomer(customer);
//
//        List<Order> orderlist = new ArrayList<>();
//        orderlist.add(o1);
//        orderlist.add(o2);
//
//        customer.setOrders(orderlist);
//        repository.save(customer);
//        repository.findAll().forEach(System.out::println);
//    }
//}

//http://localhost:9090/all
//http://localhost:9090/customer

/*

{

    "name": "John Doe",
    "email": "john.doe@example.com",
    "phone": "1234567890",
    "address": "123 Main St",
    "orders": [
      {
        "restaurantID": 1,
        "status": "Pending",
        "totalAmount": 29.97,
        "menuItems": [
          {
            "restaurantID": 1,
            "name": "Cheese Pizza",
            "description": "Delicious cheese pizza",
            "price": 9.99,
          },

          {
            "restaurantID": 2,
            "name": "Pepperoni Pizza",
            "description": "Spicy pepperoni pizza",
            "price": 10.99,
          }
        ]
      },
     {
        "restaurantID": 1,
        "status": "Pending",
        "totalAmount": 29.97,
        "menuItems": [
          {
             "restaurantID": 1,
            "name": "Cheese Pizza",
            "description": "Delicious cheese pizza",
            "price": 9.99,
          },

          {
            "restaurantID": 1,
            "name": "Pepperoni Pizza",
            "description": "Spicy pepperoni pizza",
            "price": 10.99,

          }
        ]
      },

        {

        "restaurantID": 1,
        "status": "Pending",
        "totalAmount": 29.97,
        "menuItems": [
          {
            "restaurantID": 1,
            "name": "Cheese Pizza",
            "description": "Delicious cheese pizza",
            "price": 9.99,
          },

          {
            "restaurantID": 1,
            "name": "Pepperoni Pizza",
            "description": "Spicy pepperoni pizza",
            "price": 10.99,
          }
        ]
      }
    ]
  }

 */