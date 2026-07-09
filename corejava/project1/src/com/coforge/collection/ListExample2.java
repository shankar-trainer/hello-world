package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
//        List<String> list1=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        //list1.add(655665); // error
        list1.add("java");
        list1.add("javascript");
        list1.add("java");
        list1.add("java for beginner");
        list1.add("php");
        list1.add("dotnet");
        list1.add("rust");
        System.out.println("unsorted n ordered "+list1);
        Collections.sort(list1);
        System.out.println("sorted "+list1);
        int pos=Collections.binarySearch(list1, "php");
        if(pos>=0)
            System.out.println( "found at "+pos);

        System.out.println("after sort first element "+Collections.min(list1));
        System.out.println("after sort last element "+Collections.max(list1));
        Collections.shuffle(list1);
        System.out.println(list1);
        System.out.println(list1.contains("rust"));
        System.out.println(list1.contains("rust1"));

    }
}
/*
Collections -- utility  class  have methods sort, binarySearch
Collection-- interface , sub interfaces are list and set

 */

