package com.coforge.collection;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
//        Map<Integer, String> employeeMap=new HashMap<>();
//        Map<Integer, String> employeeMap=new LinkedHashMap<>(); //ordered
        Map<Integer, String> employeeMap=new TreeMap<>(); //sorted by key

        employeeMap.put(100001, "amit kumar"); // put to add  key, value
        employeeMap.put(100002, "shyam kumar");
        employeeMap.put(8001, "amita kumari");
        employeeMap.put(5001, "amit kumar");
        employeeMap.put(100003, "suman kumar");
        employeeMap.put(100004, "kamal kumar");
        employeeMap.put(100005, "devendra kumar");
        employeeMap.put(100001, "surendra kumar"); // put to add key, value

        employeeMap.put(100009, "kamal kumar");  // values can be duplicate , no duplicate keys

        System.out.println(employeeMap);
        System.out.println(employeeMap.get(8001)); // get accepts key and return value
        System.out.println(employeeMap.get(100004));

        Set<Integer> setKey = employeeMap.keySet();// keySet returns all keys
        employeeMap.remove(100004);// remove by the key

        for(int key:setKey)
            System.out.println(key+" -----------"+employeeMap.get(key));

        System.out.println(employeeMap.containsKey(100001));
        System.out.println(employeeMap.containsValue("kamal kumar"));

        Collection<String> values = employeeMap.values();
        System.out.println(setKey+"   "+values);

        Set<Map.Entry<Integer, String>> entries = employeeMap.entrySet();
        for(Map.Entry<Integer, String> entry:entries)
            System.out.println(entry.getKey()+" "+entry.getValue());

    }
}
