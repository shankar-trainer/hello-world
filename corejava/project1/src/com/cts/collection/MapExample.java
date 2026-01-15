package com.cts.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> alphabets=new HashMap<>(); //key , value
        alphabets.put("a","apple");  // unique key, no duplicate key, values can be duplicate
        alphabets.put("b","boy");   // put(key,value) -- add element with key, value
        alphabets.put("bo","boy");
        alphabets.put("b","baby");

        System.out.println(alphabets);
        System.out.println(alphabets.get("a"));// get(key) return value

        Set<String> strings = alphabets.keySet();// returns all keys in the set form
        System.out.println(" ");
        for (String key:strings)
            System.out.print(key+"  ---- "+alphabets.get(key));

        alphabets.remove("b"); // using key remove element
        Collection<String> values = alphabets.values();// return all values  in collection
        System.out.println("all keys "+strings+"\n all values "+values);
    }
}
