package com.cts.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorPrg2 {

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " \t" + Thread.currentThread().getName());
            }
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " \t" + Thread.currentThread().getName());
            }
        };
        Runnable runnable3 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " \t" + Thread.currentThread().getName());
            }
        };

//        Executor executor= Executors.newSingleThreadExecutor();
//        executor.execute(runnable);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(runnable1);
        executorService.execute(runnable2);
        //Future<?> submit = executorService.submit(runnable1);

        executorService.shutdown();

        executorService.execute(runnable3);


    }

}
