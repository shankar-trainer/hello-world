package com.cts.lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {
        Integer ar1[]={11,1,2,33,4,55,6,7,11,2,4};

        Stream.of(ar1).forEach(a-> System.out.print(a+","));
        System.out.println("\nusing skip ");

        Stream.of(ar1).skip(3).forEach(a-> System.out.print(a+","));

        System.out.println("\nusing filter");

        Stream.of(ar1).filter(a->a%2==0).forEach(a-> System.out.print(a+","));

        System.out.println("\nusing distict");
        Stream.of(ar1).distinct().forEach(a-> System.out.print(a+","));

        System.out.println("\nusing distict and sort");
        Stream.of(ar1).distinct().sorted().forEach(a-> System.out.print(a+","));

        System.out.println("\nusing map");
        Stream.of(ar1).distinct().map(a->a*a).forEach(a-> System.out.print(a+","));

        List<String> languageList=new ArrayList<>();
        languageList.add("java");languageList.add("javascript");languageList.add("python");
        languageList.add("java");languageList.add("angular");languageList.add("python");

        languageList.stream().distinct().sorted().forEach(s-> System.out.print(s+","));
        System.out.println("using filter display string >5 char length");
        languageList.stream().distinct().sorted().
                filter(s->s.length()>5).forEach(s-> System.out.print(s+","));

    }
}
