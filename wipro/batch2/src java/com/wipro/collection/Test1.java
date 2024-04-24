package com.wipro.collection;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1000);
        list1.add(1001);
        list1.add(1002);
        list1.add(1003);
        System.out.println(list1);
        list1.remove(0);
        list1.remove(new Integer(1000));
        System.out.println(list1);
    }
}
