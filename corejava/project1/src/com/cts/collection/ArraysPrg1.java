package com.cts.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysPrg1 {

    public static void main(String[] args) {
//        Collections.sort(list); // list
        int ar1[]={11,2,3,1,4,55};
        int ar2[]={11,2,3,1,4,55};

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.equals(ar1,ar2));

        Arrays.sort(ar1);
        System.out.println("sorted array1"+Arrays.toString(ar1));

        System.out.println("found at "+Arrays.binarySearch(ar1,3));
        Integer ar3[]={11,2,3,1,4,55};

        List<Integer> list = Arrays.asList(ar3);
        int p=0;
       // int p1=null;
        Integer s=0;
        Integer s1=null;
        String s3="123";

        int i = Integer.parseInt(s3); // parseInt is static method of Wrapper class Integer
                                      // accepts String , parse it and return primitive int
                              //parseFloat, parseDouble
        Float v = Float.valueOf("123");// valueOf takes String  parse then return Wrapper class
    }
}
/*
  every primitive data type has one Wrapper class

  primitive data         Wrapper class

  int                  java.lang.Integer
  float                java.lang.Float
  double                java.lang.Double
*/

