package com.abc.collection;

/**
 * Created by shankar on 3/23/2023.
 */
public class ForEachloop {

    public static void main(String[] args) {

        int ar[]={1,2,3,4,5};

        System.out.println("using for loop ");
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+", ");
        }

        System.out.println("\nusing for each  loop ");
        for (int k:ar ) {
            System.out.print(k+", ");
        }
    }
}
