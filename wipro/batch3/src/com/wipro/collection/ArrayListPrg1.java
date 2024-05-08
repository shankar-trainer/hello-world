package com.wipro.collection;

import com.wipro.inheritance.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPrg1 {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();

        list1.add("hello");// add method add element
      list1.add(new Employee());
        list1.add(20000);
        list1.add("hello");
        list1.add(44556.45f);

       // Collections.sort(list1); // error cannot sort of different data type elements
        System.out.println(list1.get(0));// get gives element using index
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        System.out.println(list1);

        System.out.println(list1.contains("hello"));// contains checks element present or not and returns boolean
        list1.remove(1); // remove by index
        list1.remove(new Integer(20000));// remove by object
        System.out.println("after removal " + list1);
    }
}
