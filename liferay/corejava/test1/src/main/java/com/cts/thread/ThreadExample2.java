package com.cts.thread;

public class ThreadExample2{

    public static void main(String[] args) {
        Runnable runnable=()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println(i+" "+Thread.currentThread().getName() + " thread  runs ");
                if (i == 5 && Thread.currentThread().getName().equals("task2")) {
                    try {
                        Thread.sleep(500);
                        System.out.println("sleeping is over");
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        };

        Thread th1=new Thread(runnable,"task1");
        Thread th2=new Thread(runnable,"task2");
        Thread th3=new Thread(runnable,"task3");

        th1.start();

        th2.start();
        th3.start();
    }
}
