package com.cts.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

    public static void main(String[] args) {
       String languages[]= new String[]{
                "java","php","dotnet","angular","python","react"
        };

        Stream.of(languages).forEach(System.out::println);
        Stream<String> languages1 = Stream.of(languages);

        Set<String> collect = Stream.of(languages).collect(Collectors.toSet());

        List<String> collect1 = Stream.of(languages).collect(Collectors.toList());
        List<String> collect2 = Stream.of(languages).collect(Collectors.toUnmodifiableList());

        collect1.set(0, "jython");
        collect1.add("jython");

//        collect2.set(0, "jython");
    }

}
