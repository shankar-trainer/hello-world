package com.cts.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor_Using_Callable {

    public static void main(String[] args) {
        Callable<String> callable1=()->{
            for (int i = 1; i <=10 ; i++) {
                System.out.println(i+"\t "+Thread.currentThread().getName());
            }
             return  null;
        };
        Callable<String> callable2=()->{
            for (int i = 1; i <=10 ; i++) {
                System.out.println(i+"\t "+Thread.currentThread().getName());
            }
            return  null;
        };
        Callable<String> callable3=()->{
            for (int i = 1; i <=10 ; i++) {
                System.out.println(i+"\t "+Thread.currentThread().getName());
            }
            return  null;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(callable1);
        executorService.submit(callable2);


        Future<String> submit = executorService.submit(callable3);
        submit.cancel(true);

        executorService.shutdown();
    }
}
