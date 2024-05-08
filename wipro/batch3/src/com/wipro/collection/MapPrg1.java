package com.wipro.collection;

import java.util.*;

public class MapPrg1 {
    public static void main(String[] args) {

        Map<Integer,String> empMap=new TreeMap<>();// sort the keys
        //HashMap<>();
        // map consists of key and value
                         //key and values can be different or same data type/object
        empMap.put(10001,"ram kumar");// pu method to add key and value
        empMap.put(10004,"shyam kumar");
        empMap.put(10003,"vivek kumar");
        empMap.put(10002,"sumit kumar");

        empMap.put(10001,"amit kumar");// map no duplicate key

        System.out.println(empMap);
        System.out.println(empMap.get(10001));// get(key)-- return value  object

        Set<Integer> keys = empMap.keySet();// keySet -- returns all keys in set form

        for(Integer k:keys)
            System.out.println(k+" ------"+empMap.get(k));

        System.out.println(empMap.containsKey(877887));
        System.out.println(empMap.containsValue("shyam kumar"));

        empMap.remove(10001);// remove(key) --> it removes the map using key and return value

        Collection<String> values = empMap.values();


    }
}
