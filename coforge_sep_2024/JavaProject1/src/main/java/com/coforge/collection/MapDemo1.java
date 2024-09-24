package com.coforge.collection;

import java.util.*;

public class MapDemo1 {

    public static void main(String[] args) {

        Map<Integer,String> empMap=new LinkedHashMap<>(); // ordered
        //TreeMap<>();// all keys sorted
        //HashMap<>();
           // Key, Value
        empMap.put(10001,"suresh kumar");
        empMap.put(10003,"rahul kumar");
        empMap.put(10005,"naina devi");
        empMap.put(10002,"aman kumar");
        empMap.put(10001,"geeta kumari");
        System.out.println(empMap);
        System.out.println(empMap.containsKey(10001));
        System.out.println(empMap.containsValue("aman kumar"));

        for(Integer i:  empMap.keySet())  //keySet -- returns set of keys
            System.out.println(i+"   "+empMap.get(i));
        empMap.remove(10001); // using key the value is removed

        System.out.println(empMap.keySet());// all keys in set form
        System.out.println(empMap.values());// all values in collection form

        Set<Map.Entry<Integer, String>> entries = empMap.entrySet();

        //Entry -- interface for each  of the entry of map
        System.out.println("using entry set ");

        for(Map.Entry<Integer, String> e:entries){
            System.out.println(e.getKey()+"\t"+e.getValue());
        }

        empMap.clear(); // remove all value
        empMap.isEmpty();

    }
}
/*
 Map   -- key, value
          keys can not be duplicate , value can be duplicate
          put(k,v) -- add key and value
          get(k)  -- using key retrieve value
          Classes
           HashMap
           TreeMap
           HashTable-- legacy , synchronized , null can not be used as key and value

 */