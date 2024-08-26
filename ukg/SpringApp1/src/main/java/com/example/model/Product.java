package com.example.model;

import java.util.Objects;

public class Product {
    private int prdId;
    private String prdName;

    public Product(int prdId, String prdName) {
        this.prdId = prdId;
        this.prdName = prdName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return prdId == product.prdId && Objects.equals(prdName, product.prdName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prdId, prdName);
    }

    public static void main(String[] args) {
        Product product1=new Product(10001,"biscuit");
        Product product2=new Product(10001,"biscuit");
        System.out.println(product1.equals(product2));
    }
}
