package com.cts.collection;

import java.util.*;

public class MapExample2 {

    public static void main(String[] args) {
        Map<Integer, String> employeeMap=new TreeMap<>();// all keys are sorted
        employeeMap.put(10005,"ramesh kumar");
        employeeMap.put(10001,"suresh kumar");
        employeeMap.put(10004,"devansh kumar");
        employeeMap.put(10002,"rajiv kumar");
        System.out.println(employeeMap);

        System.out.println("using entry set ");
        //Entry interface represents one entry in map

        Set<Map.Entry<Integer, String>> entries = employeeMap.entrySet();

        for(Map.Entry<Integer, String> e:entries)
            System.out.println(e.getKey()+" "+e.getValue());

        List<String> list1=new ArrayList<>(employeeMap.values());
        System.out.println(list1);
        List<String> strings = Collections.unmodifiableList(list1);
        strings.add("hello"); //error

    }
}
