package com.cts.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        List list1=new ArrayList();
        list1.add(3232342);
        list1.add(new Integer(123));
        list1.add("hello world");
        list1.add(3232342);// autoboxing converts the primitive to wrapper class object
        list1.add(76657.56f);
        System.out.println(list1); // single unit
        System.out.println(list1.get(0));// one by one using index
        System.out.println(list1.get(1));

        list1.remove(3); // remove by index
        list1.remove("hello world"); // remove by object
        System.out.println("\nusing for loop");
        for (int i = 0; i < list1.size() ; i++) {
            System.out.print(list1.get(i)+", ");
        }
        System.out.println("\nusing for each");
        for(Object o:list1)
            System.out.print(o+",");

        Collections.sort(list1);// sort the list
        System.out.println(list1);


    }
}
