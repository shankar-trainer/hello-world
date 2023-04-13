package com.abc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by shankar on 3/24/2023.
 */
public class ProductProgram {
    public static void main(String[] args) {

        List<Product> prdList=new ArrayList<>();

        Product product[]=new Product[4];
        product[0]=new Product(686778,"java book",2400.0f);
        product[1]=new Product(686771,"jeans pant",3000.0f);
        product[2]=new Product(686775,"shirt",1500.0f);
        product[3]=new Product(686772,"trouser",1900.0f);


        for (Product p:product     ) {
            prdList.add(p);
        }
//
//        for (Product p:product     ) {
//            Product.productInfo(p);
//        }
        System.out.println("Product Information");

        for (Product p:prdList     ) {
            System.out.println(p.getPrdId()+"\t"+p.getPrdName()+"\t"+p.getPrdCost());
        }

        Collections.sort(prdList);

        System.out.println("\nProduct Information after sorting");

        for (Product p:prdList     ) {
            System.out.println(p.getPrdId()+"\t"+p.getPrdName()+"\t"+p.getPrdCost());
        }
    }
}
