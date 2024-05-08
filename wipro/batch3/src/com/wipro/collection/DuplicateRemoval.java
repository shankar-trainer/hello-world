package com.wipro.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemoval {

    static int[] removeDuplicate(int ar[]) {

        Set<Integer> set1 = new LinkedHashSet<>();
        for (int a : ar)
            set1.add(a);

        int myarr[] = new int[set1.size()];

        int x = 0;
        for (int b : set1)
            myarr[x++] = b;
        return myarr;
    }

    public static void main(String[] args) {
        int array1[]={11,2,3,4,1,2,3,4};
        int[] ints = removeDuplicate(array1);
        System.out.println("after duplicate removal");
        for(int k:ints)
            System.out.print(k+", ");
    }
}
