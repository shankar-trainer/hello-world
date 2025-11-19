package com.example.test;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class Test1 {

    @Test
    public  void test1(){
        Flux<String> test1=Flux.just("apple","orange","banana");
        test1.buffer(3);
        System.out.println(test1);
    }
}
