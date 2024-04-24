package com.wipro.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrg1 {
    public static void main(String[] args) {
        //HashSet<String> set1=new HashSet<>();// not ordered
        Set<String> set1=new LinkedHashSet<>(); // ordered
                //HashSet<>();// not ordered
                //TreeSet<>();// sorted
        set1.add("hello");
        set1.add("welcome");
        set1.add("greeting");
        set1.add("welcome");
        System.out.println(set1);
        for (String s:set1)
            System.out.print(s+", ");
        set1.remove("hello");
        System.out.println(set1);
        System.out.println(set1.contains("welcome"));
        System.out.println(set1.contains("welcome"));
    }
}
