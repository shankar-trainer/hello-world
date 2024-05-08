package com.wipro.collection;

import java.util.Arrays;

public class ArraysPrg1 {

    public static void main(String[] args) {
        int ar1[] = {11, 2, 3, 1, 4, 5, 6};
        System.out.println("Unsorted Arrays " + Arrays.toString(ar1));
        Arrays.sort(ar1);
        System.out.println("Sorted Arrays " + Arrays.toString(ar1));

        int pos = Arrays.binarySearch(ar1, 3);
        if (pos >= 0)
            System.out.println("found at " + pos);
        else
            System.out.println("not found ");
        int array1[] = {11, 2, 3, 4, 5, 1};
        int array2[] = {11, 2, 3, 4, 5, 1};

        System.out.print(Arrays.toString(array1) + " equals to " + Arrays.toString(array2) + "  :  ");
        System.out.println(Arrays.equals(array1, array2));

    }
}
