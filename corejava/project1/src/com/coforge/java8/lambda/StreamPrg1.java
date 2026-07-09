package com.coforge.java8.lambda;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrg1 {

    public static void main(String[] args) {
        Integer ar1[]={11,22,3,1,6,8,9,1,2,11};

        Stream.of(ar1).forEach(p-> System.out.print(p+","));

        System.out.println("using method filter");
        Stream.of(ar1).filter(p->p%2==0).forEach(p-> System.out.print(p+","));

        System.out.println("\nusing method filter filer and sorted");
        Stream.of(ar1).filter(p->p%2==0).sorted().forEach(p-> System.out.print(p+","));

        System.out.println("\nusing method distinct");
        Stream.of(ar1).distinct().forEach(p-> System.out.print(p+","));

        System.out.println("\nusing method map");
        Stream.of(ar1).distinct().map(p->p*p).forEach(p-> System.out.print(p+","));

        System.out.println("\nusing method limit");
        Stream.of(ar1).limit(3).forEach(p-> System.out.print(p+","));

        System.out.println("\nusing method limit");

        Set<Integer> collect = Stream.of(ar1).collect(Collectors.toSet());
        List<Integer> collect1 = Stream.of(ar1).collect(Collectors.toList());
    }
}
