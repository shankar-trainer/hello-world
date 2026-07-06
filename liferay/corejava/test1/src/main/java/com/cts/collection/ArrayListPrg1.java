package com.cts.collection;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPrg1 {

    public static void main(String[] args) {
//        List list1=new ArrayList();
        ArrayList list1=new ArrayList();

        list1.add(new Integer(10000));
        list1.add(100);// auto boxing  primitive -- object
        list1.add("hello world ");
        list1.add(new Employee1());


        System.out.println(list1);
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        System.out.println("using for each ");

        for(Object o:list1)
            System.out.println(o);

        System.out.println(list1.contains(100));

        list1.remove(0);
        list1.remove("hello world");
        System.out.println(list1);
    }
}

class Employee1{

}