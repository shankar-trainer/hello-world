package com.cts.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerInterface {

    public static void main(String[] args) {
    Consumer<String>  c=p-> System.out.println(p);
    c.accept("hello world");

        List<String> list1=new ArrayList<>();
        //list1.add("chennai");

        List<String> list = Arrays.asList(new String[]{
                "delhi", "chennai", "mumbai", "kolkotta", "banglore","delhi"
        });

        list.stream().forEach(p-> System.out.print(p+","));
        System.out.println("\nsorted ");

        list.stream().sorted().forEach(p-> System.out.print(p+",   "));

        System.out.println("\nsorted n distinct");

        list.stream().sorted().distinct().forEach(p-> System.out.print(p+",  "));
    }
}
