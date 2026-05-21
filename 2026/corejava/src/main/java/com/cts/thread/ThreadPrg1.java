package com.cts.thread;

public class ThreadPrg1 extends  Thread{
    @Override
    public void run() {

        for (int i = 0; i <=10 ; i++)
        System.out.println(getName()+" child thread running ");
    }

    public static void main(String[] args) {
//        Thread thread=new ThreadPrg1();
        ThreadPrg1 thread1=new ThreadPrg1();
        thread1.setName("task1");
        ThreadPrg1 thread2=new ThreadPrg1();
        thread2.setName("task2");

        thread1.start();
        thread2.start();
        System.out.println("main thread runs ");
    }
}
