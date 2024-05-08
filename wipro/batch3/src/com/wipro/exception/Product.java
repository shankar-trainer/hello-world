package com.wipro.exception;

public class Product {
    private int productId;
    private  String productName;
    private float productCost;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if(productId<=0)
            throw new IllegalArgumentException("invalid product id ");
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if(productName.isBlank())
            throw new IllegalArgumentException("product name is empty");
        this.productName = productName;
    }

    public float getProductCost() {
        return productCost;
    }

    public void setProductCost(float productCost) {
        if(productCost<=0)
            throw new IllegalArgumentException("product cost is zero or negative");
        this.productCost = productCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCost=" + productCost +
                '}';
    }
}
