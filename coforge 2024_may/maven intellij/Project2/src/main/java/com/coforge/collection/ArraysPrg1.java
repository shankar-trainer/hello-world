package com.coforge.collection;

import java.util.Arrays;

public class ArraysPrg1 {
    public static void main(String[] args) {

        int ar[]={11,2,1,3,5,4};
        int ar1[]={11,2,1,3,5,4};

        System.out.println(Arrays.equals(ar,ar1));
        System.out.println(Arrays.toString(ar));

        Arrays.sort(ar);

        System.out.println(Arrays.toString(ar));

        System.out.println("after sorting binary search can be used");

        int i = Arrays.binarySearch(ar, 4);
        if(i>=0)
            System.out.println("found at "+i);
        else
            System.out.println("not found ");


    }
}
