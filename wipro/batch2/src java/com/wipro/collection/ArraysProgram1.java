package com.wipro.collection;

import java.util.Arrays;

public class ArraysProgram1 {
    public static void main(String[] args) {
        int ar1[] = {11, 2, 3, 1, 7, 88, 5};
        System.out.println("unsorted array");
        System.out.println(Arrays.toString(ar1));

        Arrays.sort(ar1);
        System.out.println("\nsorted array");
        System.out.println(Arrays.toString(ar1));

        int search = 5;
        int i = Arrays.binarySearch(ar1, search);
        if (i >= 0)
            System.out.println(search+"found at " + i);
        else
            System.out.println("not found ");
        String name1[]={"ram kumar","aman kumar","suresh kumar","deepak anand"};
        String name2[]={"ram kumar","aman kumar","suresh kumar","deepak anand"};
        String string = Arrays.toString(name1);
        System.out.println(string);
        System.out.println(Arrays.equals(name1,name2));
        Arrays.sort(name1);

    }
}
