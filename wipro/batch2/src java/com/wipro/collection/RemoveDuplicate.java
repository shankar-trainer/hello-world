package com.wipro.collection;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int  ar[]={1,2,3,4,5,1,3,11};
        //remove duplicate
        LinkedHashSet<Integer> set1=new LinkedHashSet<>();
        for (int i = 0; i < ar.length; i++) {
            set1.add(ar[i]);
        }
        System.out.println(set1);
    }
}
