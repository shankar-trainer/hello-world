package com.cts.collection;

import java.util.*;

public class SetExample1 {

    public static void main(String[] args) {
        Set<String> languageSet1=new TreeSet<>(); // TreeSet sorts all elements
//        Set<String> languageSet1=new HashSet<>();
        languageSet1.add("java");
        languageSet1.add("php");
        languageSet1.add("java");
        languageSet1.add("javascript");
        languageSet1.add("python");
        languageSet1.add("angular");
        System.out.println(languageSet1);
        languageSet1.remove("php"); // no index support
        System.out.println("all elements using iterator ");

        Iterator<String> iterator = languageSet1.iterator();//
        System.out.println("using iterator ");
        while(iterator.hasNext())
            System.out.print(iterator.next()+", ");

        System.out.println("using for each ");
       for (String s:languageSet1)
           System.out.print(s+",");
        System.out.println(languageSet1.contains("php"));
//        Collections.sort(languageSet1); //error
    }
}
