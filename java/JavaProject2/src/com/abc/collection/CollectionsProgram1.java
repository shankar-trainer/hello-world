package com.abc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsProgram1 {

    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("python");
        list1.add("php");
        list1.add("java");
        list1.add("ruby");
        list1.add("dotnet");
        list1.add("perl");
        list1.add("c");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println("after sort "+list1);
        int search_position = Collections.binarySearch(list1, "perl");
        if(search_position>=0)
            System.out.println("found at "+search_position);
        else
            System.out.println("not found");

        System.out.println("last element "+Collections.max(list1));
        System.out.println("first element "+Collections.min(list1));
    }
}
