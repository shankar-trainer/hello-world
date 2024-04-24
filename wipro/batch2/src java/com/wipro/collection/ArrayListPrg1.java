package com.wipro.collection;

import java.util.ArrayList;

public class ArrayListPrg1 {
    public static void main(String[] args) {

        //List<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10001);
        list1.add(10002);
        list1.add(10003);
        list1.add(10001);
        System.out.println(list1.contains(10002));
// contains check  specified element present or not  and return boolean
        System.out.println(list1);
        //generalized array with index support
        // allows duplicate
        // ordered
        ArrayList list2 = new ArrayList(list1);
        list2.add(9001);
        list2.add(9003);
        list2.add(9004);
        list2.add(9001);
        System.out.println(list2);
        System.out.println(list2.containsAll(list1));
        //containsAll checks if specified collection is present or not
        list2.remove(1); // remove by index
        list2.remove(new Integer(10003));// remove by element
        list2.removeAll(list1); // remove specified collection


    }
}

