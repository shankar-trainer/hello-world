package com.cts.thread;

public class ThreadExample1  implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++)
        System.out.println( Thread.currentThread().getName()+" thread  runs ");
    }

    public static void main(String[] args) {
        ThreadExample1 t1=new ThreadExample1();

        Thread th1=new Thread(t1,"task1");
        Thread th2=new Thread(t1,"task2");
        Thread th3=new Thread(t1,"task3");

        th1.start();
        th2.start();
        th3.start();

    }
}
