package com.abc.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by shankar on 3/23/2023.
 */
public class SetProgram1 {

    public static void main(String[] args) {
// set has no duplicate
        Set<String> language=new TreeSet<>();// sorted
                                        //HashSet<>();// not ordered, not sorted
        language.add("nepali");
        language.add("maithili");
        language.add("hindi");
        language.add("nepali");
        System.out.println(language);

        System.out.println("using for  each loop");
        for (String s:language ) {
            System.out.print(s+",");
        }
        System.out.println("Using iterator \n");

        Iterator<String> iterator = language.iterator();
          while (iterator.hasNext())
              System.out.print(iterator.next()+", ");

    }

}
