package com.wipro.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPrg1 {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1001);
        list1.add(1002);
        list1.add(1003);
        list1.add(1004);
        System.out.println(list1);
        list1.remove(0);// remove using index

        LinkedList<Integer> list2=new LinkedList<>();
        list2.add(10001);
        list2.add(10002);
        list2.add(10003);
        list2.addFirst(9999);
        System.out.println(list2);
        list2.remove();//remove from first
        list2.removeFirst();//remove from first
        list2.removeLast();//remove from last

            }
}

