package com.wipro.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorPrg1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("hyderabad"); // key 0
        list1.add("sikandrabad");// key 1
        list1.add("delhi");
        list1.add("mumbai");
        list1.add("mathura");
        list1.add("delhi");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ",");
//            iterator.remove();
        }
        System.out.println(list1);
    }
}
