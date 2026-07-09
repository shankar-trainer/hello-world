package com.coforge.collection;

import java.util.*;

public class SetPrg1 {
    // set has no index , no duplicate, supports for each loop

    public static void main(String[] args) {
//        Set<String> courseSet=new HashSet<>();// not ordered
//        Set<String> courseSet=new LinkedHashSet<>();//  ordered
        Set<String> courseSet=new TreeSet<>();//  sorted
        courseSet.add("java");
        courseSet.add("sql");
        courseSet.add("java");
        courseSet.add("angular");

        System.out.println(courseSet);

        Iterator<String> iterator = courseSet.iterator();// iterator supported in list , set
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            if(next.equals("sql"))
                iterator.remove();
        }

        System.out.println(courseSet);
        System.out.println(courseSet.contains("angular"));
    }

}
