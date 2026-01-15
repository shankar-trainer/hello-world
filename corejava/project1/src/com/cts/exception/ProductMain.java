package com.cts.exception;

public class ProductMain {
    public static void main(String[] args) {
        Product product1=new Product
                (1,"mobile",12000.0f);
 Product product2=new Product
                (1,"mobile",12000.0f);

        System.out.println(product1);
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product1.equals(product2));

    }
}
