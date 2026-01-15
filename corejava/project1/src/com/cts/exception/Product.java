package com.cts.exception;

import java.util.Objects;
/**
Product class developed by
@author  shyam kuamr
@since  2jan 2026
 */
public class Product {
    private int prdId;
    private String prdName;
    private  float prdCost;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return prdId == product.prdId && Float.compare(prdCost, product.prdCost) == 0 && Objects.equals(prdName, product.prdName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prdId, prdName, prdCost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "prdId=" + prdId +
                ", prdName='" + prdName + '\'' +
                ", prdCost=" + prdCost +
                '}';
    }

    /**
     *
     * @param prdId
     * @param prdName
     * @param prdCost
     * are parameter to be added
     */
    public Product(int prdId, String prdName, float prdCost) {
        this.prdId = prdId;
        this.prdName = prdName;
        this.prdCost = prdCost;
    }

    public int getPrdId() {
        return prdId;
    }

    public String getPrdName() {
        return prdName;
    }

    public float getPrdCost() {
        return prdCost;
    }
}
