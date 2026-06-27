package com.cts.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

//        Set<String> languageSet=new HashSet<>();
//        Set<String> languageSet=new LinkedHashSet<>();// ordered
        Set<String> languageSet=new TreeSet<>();// sorted
        languageSet.add("java");
        languageSet.add("dotnet");
        languageSet.add("ruby");
        languageSet.add("java");
        languageSet.add("php");
        languageSet.add("angular");

        System.out.println(languageSet);
        //languageSet.iterator();
        for(String s:languageSet)
            System.out.println(s);

        languageSet.remove("java");

    }
}
