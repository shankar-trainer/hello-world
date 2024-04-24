package com.wipro.collection;

import java.util.*;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> empMap = new LinkedHashMap<>();
        //TreeMap<>();// sorted
        // HashMap<>();  // not ordered

        empMap.put(10001, "Ram kumar"); // map -- key, value pair
        empMap.put(10008, "shyam"); // map -- no duplicate key
        empMap.put(10004, "prince kumar");
        empMap.put(10009, "parshant kumar");
        empMap.put(10007, "vikram kumar");
        empMap.put(10005, "abdhesh kumar");//put add key, value
        empMap.put(10001, "nand kishor sharma");
        System.out.println(empMap);
        System.out.println(empMap.get(10009));// get returns value using key
        empMap.remove(10001);
        Set<Integer> integers = empMap.keySet();// returns set of keys
        for (Integer i : integers)
            System.out.println(i + "  " + empMap.get(i));

        Collection<String> values = empMap.values();

        Set<Map.Entry<Integer, String>> entries = empMap.entrySet();
        for(Map.Entry<Integer, String> entry:entries)
            System.out.println(entry.getKey()+"   "+entry.getValue());
    }
}
