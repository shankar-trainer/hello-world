package com.cts.collection;

import java.util.*;

public class MapProgram {
    public static void main(String[] args) {


//        Map<Integer,String> empMap=new HashMap<>();
//        Map<Integer,String> empMap=new LinkedHashMap<>();
        Map<Integer,String> empMap=new TreeMap<>();

        empMap.put(100005,"kamal partap");
        empMap.put(100001,"vimal kumar");
        empMap.put(100005,"raman kumar");
        empMap.put(100004,"kamal partap");
        empMap.put(100002,"suman kumar");

        System.out.println(empMap);

        Set<Integer> integers = empMap.keySet();
        Collection<String> values = empMap.values();
        System.out.println("keys "+integers);
        System.out.println("values "+values);

        for(int key:integers)
            System.out.println(key+"-----------"+empMap.get(key));

        String remove = empMap.remove(100005);// using key value is removed

        Set<Map.Entry<Integer, String>> entries = empMap.entrySet();

        for(Map.Entry<Integer, String> entry:entries)
            System.out.println(entry.getKey()+"   "+entry.getValue());



    }


}
