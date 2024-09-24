package com.coforge.collection;

import java.util.*;

public class SetPrg1 {

    public static void main(String[] args) {

        Set<String> citySet = new LinkedHashSet<>();//ordered
                //TreeSet<>(); // sorted
                //HashSet<>();// not ordered
        citySet.add("delhi");
        citySet.add("aagra");
        citySet.add("mathura");
        citySet.add("delhi");
        System.out.println(citySet);
        // Access elements using older way with iterator

        Iterator<String> cityIt = citySet.iterator();
        System.out.println("using iterator ");
        while (cityIt.hasNext())
            System.out.print(cityIt.next() + ",  ");

        System.out.println("using for each\n ");
          for(String s:citySet)
              System.out.print(s+", ");
    }

}

/*
 Set Interface

    -- no duplicate
    -- no index
    -- not ordered
   classes
      HashSet
      TreeSet
      LinkedHashSet

     */