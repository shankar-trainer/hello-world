package com.coforge.collection;

import java.util.LinkedList;

public class ListExample3 {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(1001);// add at end
        list1.add(1009);
        list1.add(201);
        list1.add(10);
        list1.add(1001);

        list1.addFirst(1);
        list1.addLast(444);
        System.out.println(list1);
        list1.remove();// remove from head
        list1.remove(2);
        list1.removeFirst();
        list1.removeLast();
        list1.removeFirstOccurrence(1001);
        list1.removeLastOccurrence(1001);
        System.out.println(list1);
    }
}
