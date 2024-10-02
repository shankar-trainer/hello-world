package com.coforge.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        Integer  ar[]={11,2,30,14,5,6,90};

        Stream.of(ar); // with array use of method

        Stream.of(ar).forEach(a-> System.out.print(a+","));
        System.out.println();
        Stream.of(ar).filter(a->(a>10)).forEach(a-> System.out.print(a+","));
        System.out.println();

        Stream.of(ar).filter(a->(a%2==0)).forEach(a-> System.out.print(a+","));
        System.out.println("\nsorted");

        Stream.of(ar).sorted().forEach(a-> System.out.print(a+","));
        System.out.println("\n sorted and limit of 3 ");
        Stream.of(ar).sorted().limit(3).forEach(a-> System.out.print(a+","));

        System.out.println("min element ");
        Stream.of(ar).sorted().limit(1).forEach(a-> System.out.print(a+","));

        Stream.of(ar).forEach(a-> System.out.print(a+","));






    }
}
