package com.cts.thread;

import java.time.LocalDate;
import java.time.LocalTime;

public class Clock {

    public static void main(String[] args) {

        Runnable runnable=()->{
            for(;;) {
                System.out.println(LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        new Thread(runnable).start();
    }
}
