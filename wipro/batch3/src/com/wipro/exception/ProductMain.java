package com.wipro.exception;

public class ProductMain {
    public static void main(String[] args) {
     //StackOverflowError e;

        System.out.println("program starts ");
        Product product=new Product();
        try {
            product.setProductId(10);
            product.setProductName("sweets");
            product.setProductCost(500);

            System.out.println("product details ");
            System.out.println(product);
            System.out.println("program ends  ");
        }
        catch (IllegalArgumentException e){
            //System.err.println(e);
            System.err.println(e.getMessage());
        }
    }
}
