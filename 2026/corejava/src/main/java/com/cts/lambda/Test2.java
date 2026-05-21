package com.cts.lambda;

//import com.mysql.cj.callback.MysqlCallbackHandler;

import java.util.stream.Stream;

interface Hello1 {
    void show();
}

interface Hello2 {
    String show1();
}

public class Test2 {
    static void hello() {
        System.out.println("hello world ");
    }

    public static void main(String[] args) {

        String ar[] = {"bb", "aa", "dd"};

//        Stream.of(ar).forEach(a-> System.out.println(a));
        Stream.of(ar).forEach(System.out::println);

        Hello1 h = () -> System.out.println("hello");
        Hello2 hello2=()->new String("welcome");
        Hello2 hello3=String::new;

        String  s=String.valueOf("132");


        //System.out.println(String::toUpperCase);
    }
}
