package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Integer(111));
        list.add(111);                // autoboxing converts primitive to object
        list.add("hello world");
        list.add(new Employee());
        list.add("hello world");

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // access one by one using for loop
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i)+", ");

        System.out.println( "using for each");
        // access one by one using for each  loop
        for(Object o:list)
            System.out.print(o+",");

        list.remove(0);// remove by index
        list.remove("hello world");
        System.out.println(list);
        Collections.sort(list);//ClassCastException

    }
}
class Employee{}