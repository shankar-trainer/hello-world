package com.wipro.collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPrg1 {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        // it has two ends first and last
        // can do the operation at both ends

        list1.add(10001);// add element at last
        list1.addLast(23000);// add element at last

        list1.addFirst(1909);
        list1.addFirst(1908);
        list1.addFirst(1907);
        list1.addFirst(1906);
        list1.add(10001);
        list1.add(10001);

        System.out.println("unsorted "+list1);
        Collections.sort(list1);
        System.out.println("sorted "+list1);

        //int i = Collections.binarySearch(list1,1909);
        int i = Collections.binarySearch(list1,19077);
        if(i>=0)
            System.out.println("found at "+i);
        else
            System.out.println("not found ");

        list1.remove();// remove first element and return
        list1.removeFirst();// remove first element and return

        list1.removeLast();// remove last element and return

        list1.removeFirstOccurrence(10001); //remove first occurrences and return boolean
        list1.removeLastOccurrence(10001); //remove last  occurrences and return boolean
    }
}
