package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ListPrg2 {

    public static void main(String[] args) {
        ArrayList<String> bookList=new ArrayList<>();
        LinkedList<String> bookList1=new LinkedList<>();
        bookList1.add("java in action");// add -- add element at last
        bookList1.add("java for beginner action");
        bookList1.addLast("spring  in action");// add -- add element at last
        bookList1.add("java professional");
        bookList1.addFirst("java for dummies");// add -- add element at first

        System.out.println(bookList1);

        LinkedList<String> reversed = bookList1.reversed();
        System.out.println(reversed);

        bookList1.removeFirst();

        Vector<String> vector1=new Vector<>(bookList1);
        System.out.println(vector1.capacity());
        System.out.println(vector1.size());
        System.out.println(vector1);
        vector1.removeAll(bookList1);
        System.out.println(vector1);
        vector1.addAll(bookList1);

        Collections.sort(vector1);
        System.out.println(vector1);
      int pos=  Collections.binarySearch(vector1,"java in action");
        if(pos>=0)
            System.out.println("found at "+pos);
        else
            System.out.println("not found");

        System.out.println("Last element "+Collections.max(vector1));
        System.out.println("First element "+Collections.min(vector1));

        Collections.swap(vector1,1,3);
        Collections.shuffle(vector1);

    }
}
