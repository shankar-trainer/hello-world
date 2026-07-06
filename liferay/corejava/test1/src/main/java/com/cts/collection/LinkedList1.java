package com.cts.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<Integer> list1=new LinkedList<>();

        list1.add(10001);
        list1.add(10002);
        list1.add(10002);
        list1.add(10003);
        list1.addFirst(1);
        list1.addLast(788);
        list1.addFirst(2);

        System.out.println(list1);
        Collections.sort(list1);

        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        System.out.println(list1.get(0));

        list1.remove();
        list1.removeFirst();

        System.out.println(list1);

        Iterator<Integer> iterator = list1.iterator();// traversing elements

        while(iterator.hasNext()) {
            int  s=iterator.next();
            System.out.println(s);
            if(s==10001)
             iterator.remove();
        }
        System.out.println(list1);

    }
}
