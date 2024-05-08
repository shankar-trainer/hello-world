package com.wipro.inheritance;

public class ProductMain {
    public static void main(String[] args) {

        Product product1=new Product(1,"book");
        Product product2=new Product(1,"book");

        System.out.println(product1==product2);//false
        System.out.println(product1.equals(product2));//true

        System.out.println(product1.hashCode()); // hashCode for both objects are same as equals, hashCode  method have been overriden
        System.out.println(product2.hashCode());
    }
}
