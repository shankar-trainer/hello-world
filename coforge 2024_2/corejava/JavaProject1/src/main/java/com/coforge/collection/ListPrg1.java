package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListPrg1 {

    public static void main(String[] args) {

        List<String> list1=new ArrayList<>();

        list1.add("java");
        list1.add("python");
        list1.add("java");
        list1.add("angular");
        list1.add("java");
        list1.add("react");

        //list1.add(5445);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("using for loop");
        for (int i = 0; i <list1.size() ; i++)
            System.out.print(list1.get(i)+", ");

        System.out.println("\nusing for each  loop");
        for (String s:list1)
            System.out.print(s+", ");

        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            if(next.equals("java"))
                iterator.remove();
        }
        System.out.println("\n");
        System.out.println(list1);
    }
}
/*
 List -- interface
 Concrete classes of List are
    Vector  -- legacy  , all methods are synchronized
    ArrayList -- alternative of Vector  all methods are no synchronized
    LinkedList

    -- list allows duplicate
    -- supports index
    -- ordered
 */