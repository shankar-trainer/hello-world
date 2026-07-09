package com.coforge.thread;

public class ThreadPrg1  extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(i+" "+getName());
        }
    }

    public static void main(String[] args) {
        System.out.println( "main thread runs ");

        Thread thread1=new ThreadPrg1();
        Thread thread2=new ThreadPrg1();
        Thread thread3=new ThreadPrg1();

        thread1.setName("task1");
        thread2.setName("task2");
        thread3.setName("task3");

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println( "main thread stops  ");
    }
}
