package com.coforge.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysPrg1 {

    public static void main(String[] args) {
        int ar1[] = {11, 20, 2, 1, 3, 4, 5};
        int ar2[] = {11, 20, 2, 1, 3, 4, 5};

        System.out.println(Arrays.toString(ar1));

        System.out.println(Arrays.equals(ar1, ar2));
        Arrays.sort(ar1);
        System.out.println("sorted ");
        System.out.println(Arrays.toString(ar1));

        int x = Arrays.binarySearch(ar1, 4);
        if (x >= 0)
            System.out.println("found at " + x);
        else
            System.out.println("not found ");

        Integer arr1[] = {11, 20, 2, 1, 3, 4, 5};
        List<Integer> list1 = Arrays.asList(arr1);
        System.out.println(list1);
    }
}
