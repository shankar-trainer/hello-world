package com.cts.collection;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();// generic feature, collection is type safe
//        list1.add("hello"); // error

        list1.add(656565);
        list1.add(656);
        list1.add(1);
        list1.add(0);
        list1.add(65);
        list1.add(656565);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);  //after sorting binary search works
        int pos=Collections.binarySearch(list1,65);
        if(pos>=0)
            System.out.println("65 found at "+pos+" position");
        else
            System.out.println("not found");
        System.out.println(list1.contains(0));// true or false

//        List<String> cityList=new LinkedList<>();
        LinkedList<String> cityList=new LinkedList<>();// LinkedList has two ends head, tail
        cityList.add("chennai");
        cityList.add("hyderabad");
        cityList.addFirst("kolkotta");
        cityList.addLast("delhi");

        System.out.println(cityList.getFirst());
        System.out.println(cityList.get(2));
        System.out.println(cityList.getLast());
        System.out.println(cityList);
        Collections.sort(cityList);
        System.out.println(cityList);
        System.out.println(Collections.max(cityList)); //Collections is a class
        System.out.println(Collections.min(cityList));
        Collections.shuffle(cityList);

        Collection c=new ArrayList(); // Collection is an interface
    }
}
/*
list -- duplicate, index , ordered
 */
