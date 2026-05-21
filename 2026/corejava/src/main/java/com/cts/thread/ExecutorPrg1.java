package com.cts.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorPrg1 {

    public static void main(String[] args) {

        Runnable runnable=()->{
            for (int i = 0; i <=10 ; i++) {
                System.out.println(i+" \t"+Thread.currentThread().getName());
            }
        };
        Executor executor= Executors.newSingleThreadExecutor();
        executor.execute(runnable);

    }

}
