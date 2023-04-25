package com.abc.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shankar on 3/23/2023.
 */
public class ListProgram {
    public static void main(String[] args) {

        //List<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();

        list1.add(11);
        list1.add(22);
        list1.add(33);
        list1.add(22);
        list1.add(55);
        list1.add(66);

        System.out.println(list1);
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(33));

        System.out.println("all values of list ");
        for (int i = 0; i <list1.size() ; i++) {
            System.out.print(list1.get(i)+", ");
        }
        list1.remove(new Integer(11));
        list1.remove(3);

        System.out.println("\nfor each loop");
        for (int i:list1 ) {
            System.out.print(i+", ");
        }
    }
}
