package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPrg1 {

    public static void main(String[] args) {

        List  list1=new ArrayList();

        list1.add(100001);
        list1.add(5600.45f);
        list1.add("hello world ");
        list1.add(new Employee1());

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        System.out.println(list1.get(3));

        list1.remove(1);
        list1.remove(5600.45f);

       // Collections.sort(list1); // error
        System.out.println(list1);
    }
}
class Employee1{  }