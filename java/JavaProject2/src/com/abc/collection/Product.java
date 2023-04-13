package com.abc.collection;

/**
 * Created by shankar on 3/24/2023.
 */
public class Product implements Comparable<Product> {
    private int prdId;
    private String prdName;
    private float prdCost;

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

    public static void productInfo(Product p) {
        System.out.println("\nProduct Information");
        System.out.println("\tprd Id" + p.getPrdId());
        System.out.println("\tprd Name" + p.getPrdName());
        System.out.println("\tprd Cost" + p.getPrdCost());
    }

    @Override
    public int compareTo(Product o) {
        if (this.prdId > o.prdId)
            return 1;
        else if (this.prdId < o.prdId)
            return -1;
        else
            return 0;

    }
}