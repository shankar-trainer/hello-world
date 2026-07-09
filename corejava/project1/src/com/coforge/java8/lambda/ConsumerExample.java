package com.coforge.java8.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerExample {

    public static void main(String[] args) {
     Consumer<Integer> consumer= (p)-> System.out.println(p);
     consumer.accept(10000);

        BiConsumer<Integer,String> biConsumer=(id,name)->System.out.println(id+"  "+name);
        biConsumer.accept(10001,"ram kumar");

        // Consumer, BiConsumer no  return , Function acceps and returns
        Function<Integer,String> function=(no1)-> "square is "+(no1*no1);
        String apply = function.apply(10);
        System.out.println(apply);
    }
}


