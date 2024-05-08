package com.wipro.collection;

import java.util.*;

public class SetPrg1 {
    public static void main(String[] args) {

        //List<String> list1=new ArrayList<>();
        //ArrayList<String> list2=new ArrayList<>();
        Set<String> languageSet = new LinkedHashSet<>(); // ordered
        //TreeSet<>();// sorted
        //HashSet<>(); // not ordered

        languageSet.add("java");
        languageSet.add("javascript");
        languageSet.add("java8");
        languageSet.add("java17");
        languageSet.add("python");
        languageSet.add("java");// duplicate is removed

        System.out.println(languageSet);

        languageSet.remove("java"); // remove with object, no index present in set
        System.out.println("after java removed " + languageSet);
        System.out.println("all elements using for each ");
        for (String s : languageSet)
            System.out.print(s + ",  ");

        System.out.println("addAll ");// addAll method allows another other collection like list, set to be added
        ArrayList<String> city = new ArrayList<>();

        city.add("chennai");
        city.add("kolkotta");
        city.add("hyderabad");
        city.add("delhi"); // adds element at the end
        city.add("mathura");
        city.add("chennai");

        languageSet.addAll(city);//addAll add all elements from the given collection
                                  // add() -- adds one by one element

        System.out.println("\n after add all of city list elements are \n");
        System.out.println(languageSet);
        System.out.println(languageSet.contains("chennai"));// contains checks single element
        System.out.println(languageSet.containsAll(city));// containsAll checks the presence of another collectiob

        languageSet.remove("javascript");// remove(object) -- it removes the single object
        languageSet.removeAll(city);// it removes the given collection
        System.out.println(languageSet);

    }
}
