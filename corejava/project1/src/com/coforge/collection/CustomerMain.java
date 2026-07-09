package com.coforge.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomerMain {

    public static void main(String[] args) {
     Customer customer[]=new Customer[]{
             new Customer(100003,"deepak kumar"),
             new Customer(100001,"amit kumar"),
             new Customer(100002,"bobby kumar")
        };
        System.out.println("unsorted");
        for(Customer c:customer)
            System.out.println(c);

        Arrays.sort(customer);

        System.out.println("sorted");
        for(Customer c:customer)
            System.out.println(c);

        List<Customer> list = Arrays.asList(customer);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Arrays.toString(customer));
    }
}

