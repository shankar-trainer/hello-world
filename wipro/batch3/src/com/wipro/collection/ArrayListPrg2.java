package com.wipro.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPrg2 {
    public static void main(String[] args) {

        ArrayList<String> city=new ArrayList<>();
      //  List<String> city1=new ArrayList<>();

        //city.add(43223); // error now only string type will be taken
       city.add("chennai");
       city.add("kolkotta");
       city.add("hyderabad");
       city.add("delhi"); // adds element at the end
       city.add("mathura");
       city.add("chennai");
                          // ArrayList/List is ordered
        System.out.println(city);
        System.out.println("all elements using for loop");
        for (int i = 0; i <city.size() ; i++) {
            System.out.print(city.get(i)+", ");
        }
        Collections.sort(city);
        System.out.println("\nafter sorting "+city);
        System.out.println("using for each ");
        for(String s:city)
            System.out.print(s+", ");
    }
}
