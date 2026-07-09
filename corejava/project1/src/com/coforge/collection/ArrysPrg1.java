package com.coforge.collection;

import java.util.Arrays;

public class ArrysPrg1 {

    public static void main(String[] args) {

        int ar1[]={22,3,4,1,0};
        int ar2[]={22,3,4,1,0};

        Integer i;

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.equals(ar1, ar2));

        Arrays.sort(ar1);
        System.out.println(Arrays.toString(ar1));

        System.out.println("found at "+Arrays.binarySearch(ar1, 4));
    }
}
