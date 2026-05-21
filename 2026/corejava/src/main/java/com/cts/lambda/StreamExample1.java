package com.cts.lambda;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample1 {

    public static void main(String[] args) {
        Integer ar[]={44,33,1,2,33,7,2,44};

        Stream.of(ar).forEach(a-> System.out.print(a+", "));
        System.out.println("\n duplicate removed ");
        Stream.of(ar).distinct().forEach(a-> System.out.print(a+", "));

        System.out.println("\n duplicate removed with odd number only ");
        Stream.of(ar).distinct().filter(a->a%2!=0).forEach(a-> System.out.print(a+", "));

        System.out.println("\n  number gr than 30 only ");
        Stream.of(ar).filter(a->a>30).forEach(a-> System.out.print(a+", "));

        System.out.println("\n sorted ");
        Stream.of(ar).sorted().forEach(a-> System.out.print(a+", "));

        System.out.println("\n after sorting mapping multiply by 3 ");
        Stream.of(ar).sorted().map(a->a*3).forEach(a-> System.out.print(a+", "));

        Optional<Integer> reduce = Stream.of(ar).reduce((a, b) -> a + b);

        if(reduce.isPresent())
            System.out.println("sum is "+reduce.get());
        else
            System.out.println("null values");


    }
}
