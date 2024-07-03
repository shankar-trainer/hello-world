package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListPrg2 {
    public static void main(String[] args) {

        //List<String> list1=new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("java");
        list1.add("php");
        list1.add("java");
        list1.add("python");
        list1.add("angular");
        list1.add("react");
        list1.add("python");
        // list1.add(65655); // error
        System.out.println("unsorted " + list1);
        Collections.sort(list1);
        //Collections -- is a class, Collection is an interface
        System.out.println("sorted " + list1);

        System.out.println("all elements using for loop");
        for (int i = 0; i < list1.size(); i++)
            System.out.print(list1.get(i) + ", ");

        System.out.println("\njava present in list " + list1.contains("java"));

        System.out.println("\n using for each ");
        for (String s : list1)
            System.out.print(s + ", ");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("hindi");
        list2.add("english");
        list2.add("sankirit");
        list2.add("tamil");
        list2.add("hindi");

        list1.addAll(list2); // addAll adds another collection
        System.out.println(list1);
        System.out.println(list1.containsAll(list2));
        list1.removeAll(list2);

        LinkedList<Integer> list3=new LinkedList<>();

        list3.add(1001);// add at last
        list3.add(1002);
        list3.add(1003);

        System.out.println(list3);
        list3.addFirst(100);
        list3.addLast(100);

        System.out.println(list3);

        list3.remove(); // remove first
        list3.removeLast();
        System.out.println(list3);
        list3.clear(); // remove all element
    }
}
