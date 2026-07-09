package com.coforge.thread;

public class ThreadPrg2 implements  Runnable {

    @Override
    public void run() {
    Thread t;
        t=Thread.currentThread();

        for (int i = 0; i <20 ; i++) {
            System.out.println(i+"  "+t.getName());
        }
    }

    public static void main(String[] args) {

        ThreadPrg2 threadPrg2=new ThreadPrg2();
//        Thread thread1=new Thread(threadPrg2);
        Thread thread1=new Thread(threadPrg2,"process1");
        Thread thread2=new Thread(threadPrg2,"process2");
        Thread thread3=new Thread(threadPrg2,"process3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
